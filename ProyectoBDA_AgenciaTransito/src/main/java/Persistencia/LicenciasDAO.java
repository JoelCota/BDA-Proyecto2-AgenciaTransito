/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Dominio.Licencia;
import Dominio.Persona;
import static Dominio.Tramite_.persona;
import excepciones.PersistenciaException;
import javax.persistence.EntityManager;
import Interfaces.ILicenciasDAO;
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
            bd.persist(licencia);
            bd.getTransaction().commit();//cerre conexion
        } catch (Exception e) {
            throw new PersistenciaException("No se agrego la licencia" + e.getMessage());
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
            bd.getTransaction().begin();
            CriteriaBuilder builder = bd.getCriteriaBuilder();
            //Consultar Licencia
            CriteriaQuery consulta = builder.createQuery(Licencia.class);
            Root<Licencia> root = consulta.from(Licencia.class);
            consulta.select(root).where(builder.equal(root.get("id"), licencia.getId()));
            TypedQuery<Licencia> resultado = bd.createQuery(consulta);
            Licencia licenciaNew = resultado.getSingleResult();
            //Actualiza
            licenciaNew.setActiva(false);
            bd.merge(licenciaNew);//Se confirma el cambio a la base de datos.

            //mando lo datos a la base de datos
            bd.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("La licencia no se pudo actualizar " + e.getMessage());
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
            Predicate activo=criteriaBuilder.equal(root.get("activa"),true);
            consulta.where(predicateLicencia,activo);
            TypedQuery<Licencia> resultado = bd.createQuery(consulta);
            Persona persona = resultado.getSingleResult().getPersona();
            bd.getTransaction().commit();
            return persona;

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

}
