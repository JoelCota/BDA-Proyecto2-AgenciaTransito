/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Dominio.Licencia;
import Dominio.Persona;
import excepciones.PersistenciaException;
import javax.persistence.EntityManager;
import Interfaces.ILicenciasDAO;
import java.util.List;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

/**
 *
 * Clase DAO para hacer las consultas a la base de datos con todo relacionado a la base
 * de datos con el tema de las licencias.
 * @author Joel Antonio Lopez Cota ID:228926 y David de Jesus Sotelo Palafox
 * ID:229384
 */
public class LicenciasDAO implements ILicenciasDAO {

    //Se obtiene una nueva conexion
    ConexionBD conexion = new ConexionBD();

    
    /**
     * 
     * Metodo para agregar una nueva licencia
     * @param licencia objeto de licencia
     * @throws PersistenciaException Excepciones (evita errroes).
     */
    @Override
    public void agregarLicencia(Licencia licencia) throws PersistenciaException {
        EntityManager bd = conexion.obtenerConexion();

        try {
            bd.getTransaction().begin();//entre a la base de datos
            if (licencia!=null) {
                bd.persist(bd);
            }
            bd.getTransaction().commit();//cerre conexion
        } finally {
            bd.close();
        }
    }

    
    /**
     * 
     * Metodo para actualizar una licencia ya creada
     * @param licencia objeto licencia.
     * @throws PersistenciaException Excepciones (evita errroes).
     */
    @Override
    public void actualizarLicencia(Licencia licencia) throws PersistenciaException {
        EntityManager bd = conexion.obtenerConexion();
        try {
            bd.getTransaction().begin();//entre a la base de datos
            CriteriaBuilder builder = bd.getCriteriaBuilder();
            //Consultar Licencia
            CriteriaQuery consulta = builder.createQuery(Licencia.class);
            Root<Licencia> root = consulta.from(Licencia.class);
             consulta.select(root);
            Predicate predicatePersona = builder.equal(root.get("persona"), licencia.getPersona());
            Predicate activo = builder.equal(root.get("activa"), true);
            consulta.where(predicatePersona,activo);
            TypedQuery<Licencia> resultado = bd.createQuery(consulta);
            List<Licencia> licenciaNew = resultado.getResultList();
            //Actualiza
            for (Licencia licencVieja : licenciaNew) {
                  licencVieja.setActiva(false);
            }
            bd.persist(licencia);
            bd.getTransaction().commit();
        } finally {
            bd.close();
        }
    }

    /**
     * 
     * Metodo para buscar una licencia por medio de el RFC.
     * @param personaProspecto objeto de persona.
     * @return retorna a la persona que se busco.
     */
    public Persona buscarLicenciaRFC(Persona personaProspecto) {
        EntityManager bd = conexion.obtenerConexion();
        try {
            bd.getTransaction().begin();
            CriteriaBuilder criteriaBuilder = bd.getCriteriaBuilder();
            CriteriaQuery consulta = criteriaBuilder.createQuery();
            Root<Licencia> root = consulta.from(Licencia.class);
            consulta.select(root);
            Predicate predicateLicencia = criteriaBuilder.equal(root.get("persona"), personaProspecto);
            Predicate activo = criteriaBuilder.equal(root.get("activa"), true);
            consulta.where(predicateLicencia, activo);
            TypedQuery<Licencia> resultado = bd.createQuery(consulta);
            Persona persona = resultado.getSingleResult().getPersona();
            bd.getTransaction().commit();
            return persona;

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
    
    public List<Licencia> listaLicencias(Persona personaProspecto) {
        EntityManager bd = conexion.obtenerConexion();
        try {
            CriteriaBuilder cb = bd.getCriteriaBuilder();
            CriteriaQuery<Licencia> cq = cb.createQuery(Licencia.class);
            Root<Licencia> root = cq.from(Licencia.class);
            Predicate predicate = cb.equal(root.get("persona"), personaProspecto);
            cq.where(predicate); // Aplicar la restricción a la consulta
            return bd.createQuery(cq).getResultList();
        } finally {
            bd.close();
        }
    }

}
