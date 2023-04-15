/**
 * PlacasDAO.java
 * Apr 12, 2023 12:25:47 AM
 */
package Persistencia;
//importanciones

import Dominio.Licencia;
import Dominio.Persona;
import Dominio.Placa;
import Interfaces.IPlacasDAO;
import excepciones.PersistenciaException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

/**
 *
 * Clase DAO para hacer todos las consultas relacionada con la tabla de "Placas"
 * en la base de datos.
 *
 * @author Joel Antonio Lopez Cota ID:228926 y David de Jesus Sotelo Palafox
 * ID:229384
 */
public class PlacasDAO implements IPlacasDAO {

    //Conexion a la base de datos
    ConexionBD conexion = new ConexionBD();

    /**
     *
     * Metodo para crear una nueva placa de un automovil.
     *
     * @param placa objeto placa
     * @throws PersistenciaException Excepciones (evita erroes).
     */
    @Override
    public void generarPlaca(Placa placa) throws PersistenciaException {
        EntityManager bd = conexion.obtenerConexion();

        try {
            bd.getTransaction().begin();//entre a la base de datos
            bd.persist(placa);
            bd.getTransaction().commit();//cerre conexion
        } catch (Exception e) {
            bd.getTransaction().rollback();
            throw new PersistenciaException("No se puedo guardar la persona." + e.getMessage());
        } finally {
            bd.close();
        }
    }

    /**
     *
     * Metodo para actualizar la placa del automovil.
     *
     * @param placa objeto de placa
     * @throws PersistenciaException Excepciones (evita erroes)..
     */
    @Override
    public void actualizar(Placa placa) throws PersistenciaException {
        EntityManager bd = conexion.obtenerConexion();

        try {
            bd.getTransaction().begin();
            CriteriaBuilder builder = bd.getCriteriaBuilder();
            //Consultar Licencia
            CriteriaQuery consulta = builder.createQuery(Licencia.class);
            Root<Placa> root = consulta.from(Placa.class);
            consulta.select(root).where(builder.equal(root.get("id"), placa.getId()));
            TypedQuery<Placa> resultado = bd.createQuery(consulta);
            Placa placaNew = resultado.getSingleResult();
            //Actualiza
            placaNew.setActiva(false);
            bd.merge(placaNew);//Se confirma el cambio a la base de datos.
            bd.persist(placa);

            //mando lo datos a la base de datos
            bd.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("La placa no se pudo actualizar " + e.getMessage());
        } finally {
            bd.close();
        }

    }

    /**
     *
     *
     * @param serie
     * @return
     */
    public Placa buscarPersonaSerie(String serie) {
        EntityManager em = conexion.obtenerConexion();

        try {
            em.getTransaction().begin();
            CriteriaBuilder builder = em.getCriteriaBuilder();
            CriteriaQuery<Placa> consulta = builder.createQuery(Placa.class);//solo se conecta en el java
            Root<Placa> root = consulta.from(Placa.class);
            consulta.select(root);
            Predicate predicateLicencia = builder.equal(root.get("numeroPlaca"), serie);
            Predicate activo = builder.equal(root.get("activa"), true);
            consulta.where(predicateLicencia, activo);
            TypedQuery<Placa> resultado = em.createQuery(consulta); // se conecta a la base de datos
            Placa placa = resultado.getSingleResult(); // devuelve la persona con el rfc que mande.
            em.getTransaction().commit();
            return placa;

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public List<Placa> listaPlacas(Persona personaProspecto) {
        EntityManager em = conexion.obtenerConexion();
        try {
            CriteriaBuilder cb = em.getCriteriaBuilder();
            CriteriaQuery<Placa> cq = cb.createQuery(Placa.class);
            Root<Placa> root = cq.from(Placa.class);
            Predicate predicate = cb.equal(root.get("persona"), personaProspecto);
            cq.where(predicate); // Aplicar la restricción a la consulta
            return em.createQuery(cq).getResultList();
        } finally {
            em.close();
        }
    }

    public List<Placa> listaPlacas() {
        EntityManager em = conexion.obtenerConexion();
        em.getTransaction().begin();
        List<Placa> placas = em.createQuery("Select p from Placa p", Placa.class).getResultList();
        em.getTransaction().commit();
        return placas;
 
    }

}
