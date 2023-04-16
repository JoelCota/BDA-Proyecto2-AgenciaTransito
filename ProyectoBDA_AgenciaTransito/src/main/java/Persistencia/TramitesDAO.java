/**
 * TramitesDAO.java
 * Apr 14, 2023 11:36:00 PM
 */
package Persistencia;
//importanciones

import Dominio.Tramite;
import Interfaces.ITramitesDAO;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

/**
 * Clase DAO para gestionar todos los tramites relacionados con los tramites.
 *
 * @author Joel Antonio Lopez Cota ID:228926
 */
public class TramitesDAO implements ITramitesDAO {

    ConexionBD conexion = new ConexionBD();

    /**
     * Metodo constructor por defecto.
     */
    public TramitesDAO() {

    }

    /**
     * Metodo para consultar todos los tramites por nombre de usuario similar.
     *
     * @param nombre es el nombre del cliente
     * @return la lista de tramites de todos los usuarios con nombre similar
     */
    @Override
    public List<Tramite> consultaListaTramitesNombre(String nombre) {
        EntityManager em = conexion.obtenerConexion();
        em.getTransaction().begin();
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Tramite> cq = cb.createQuery(Tramite.class);
        Root<Tramite> root = cq.from(Tramite.class);
        Predicate predicate = cb.like(root.get("persona").get("nombreCompleto"), nombre + "%");
        cq.select(root).where(predicate);
        List<Tramite> listaTramites = em.createQuery(cq).getResultList();
        em.getTransaction().commit();
        return listaTramites;
    }

    /**
     * Metodo para consultar todos los tramites por periodo de tiempo.
     *
     * @param fechaInicio es la fecha de inicio del periodo
     * @param fechaFin es la fecha de fin del periodo
     * @return la lista de tramites de todos los usuarios que tienen un tramite
     * realizado durante el periodo
     */
    @Override
    public List<Tramite> consultarListaTramitesPorFechas(Date fechaInicio, Date fechaFin) {
        EntityManager em = conexion.obtenerConexion();
        CriteriaBuilder builder = em.getCriteriaBuilder();
        CriteriaQuery<Tramite> query = builder.createQuery(Tramite.class);
        Root<Tramite> root = query.from(Tramite.class);
        Predicate fechaInicioPredicate = builder.greaterThanOrEqualTo(root.get("fechaExpedicion"), fechaInicio);
        Predicate fechaFinPredicate = builder.lessThanOrEqualTo(root.get("fechaExpedicion"), fechaFin);
        Predicate fechaPredicate = builder.and(fechaInicioPredicate, fechaFinPredicate);
        query.select(root).where(fechaPredicate);
        List<Tramite> tramites = em.createQuery(query).getResultList();
        return tramites;
    }

    /**
     * Metodo para consultar todos los tramites realizados
     *
     * @return todos los tramites realizados
     */
    @Override
    public List<Tramite> consultaListaTramites() {
        EntityManager em = conexion.obtenerConexion();
        CriteriaBuilder builder = em.getCriteriaBuilder();
        CriteriaQuery<Tramite> query = builder.createQuery(Tramite.class);
        Root<Tramite> root = query.from(Tramite.class);
        query.select(root);
        List<Tramite> tramites = em.createQuery(query).getResultList();
        return tramites;
    }
}
