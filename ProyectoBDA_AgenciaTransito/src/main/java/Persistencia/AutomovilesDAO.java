/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;
//Imports
import Dominio.Automovil;
import Dominio.Persona;
import Interfaces.IAutomovilesDAO;
import excepciones.PersistenciaException;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * Clase DAO para todos los movimientos relacionados con los vehiculos
 * @author Joel Antonio Lopez Cota ID:228926 y David de Jesus Sotelo Palafox ID:229384
 */
public class AutomovilesDAO implements IAutomovilesDAO{
    //Conexion a la base de datos
    ConexionBD conexion = new ConexionBD();

    /**
     * 
     * Metodo para agregar un vehiculo a la base de datos.
     * @param automovil objeto vehiculo.
     * @throws PersistenciaException Excepciones.
     */
    @Override
    public void agregar(Automovil automovil) throws PersistenciaException {
        EntityManager bd = conexion.obtenerConexion();

        try {
            bd.getTransaction().begin();//entre a la base de datos
            bd.persist(automovil);
            bd.getTransaction().commit();//cerre conexion
        } catch (Exception e) {
            bd.getTransaction().rollback();
            throw new PersistenciaException("No se puedo guardar el automovil." + e.getMessage());
        } finally {
            bd.close();
        }

    }
    
    /**
     * Metodo para consultar el Automovil que se desee en la base de datos.
     * @param numSerie numero de serie.
     * @return retorna el automovil deseado.
     */
    
    public Automovil consultarAutomovil(String numSerie){
         EntityManager bd = conexion.obtenerConexion();

        try {
            bd.getTransaction().begin();
            CriteriaBuilder builder = bd.getCriteriaBuilder();
            CriteriaQuery<Automovil> consulta = builder.createQuery(Automovil.class);//solo se conecta en el java
            Root<Automovil> root = consulta.from(Automovil.class);
            consulta.select(root).where(builder.equal(root.get("numSerie"), numSerie));
            TypedQuery<Automovil> resultado = bd.createQuery(consulta); // se conecta a la base de datos
            Automovil automovil = resultado.getSingleResult(); // devuelve la persona con el rfc que mande.
            bd.getTransaction().commit();
            return automovil;

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
          return null;
    }

    /**
     * Metodo para actualizar un vehiculo ya existente.
     * @param automovil objeto de vehiculo.
     * @throws PersistenciaException Excepciones.
     */
    
    @Override
    public void actualizar(Automovil automovil) throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
