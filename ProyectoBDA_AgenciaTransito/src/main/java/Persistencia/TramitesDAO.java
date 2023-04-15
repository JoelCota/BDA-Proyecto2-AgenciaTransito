/**
 * TramitesDAO.java
 * Apr 14, 2023 11:36:00 PM
 */
package Persistencia;
//importanciones

import Dominio.Tramite;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
 
/**
 *
 *
 * @author Joel Antonio Lopez Cota ID:228926
 */
public class TramitesDAO {

    ConexionBD conexion = new ConexionBD();

    /**
     *
     */
    public TramitesDAO() {

    }

    public List<Tramite> listaTramites(String nombre) {
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

    public List<Tramite> buscarTramitesPorFechas(Date fechaInicio, Date fechaFin) {
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
    
     public List<Tramite> buscarTramites(){
        EntityManager em = conexion.obtenerConexion();
        CriteriaBuilder builder = em.getCriteriaBuilder();
        CriteriaQuery<Tramite> query = builder.createQuery(Tramite.class);
        Root<Tramite> root = query.from(Tramite.class);
        query.select(root);
        List<Tramite> tramites = em.createQuery(query).getResultList();
        return tramites;
     }
}
