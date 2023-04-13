/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Dominio.Automovil;
import Interfaces.IAutomovilesDAO;
import excepciones.PersistenciaException;
import javax.persistence.EntityManager;

/**
 *
 * @author deivi
 */
public class AutomovilesDAO implements IAutomovilesDAO{
ConexionBD conexion = new ConexionBD();


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

    @Override
    public void actualizar(Automovil automovil) throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
