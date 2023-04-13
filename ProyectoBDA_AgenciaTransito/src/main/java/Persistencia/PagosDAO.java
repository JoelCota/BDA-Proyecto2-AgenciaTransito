/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Dominio.Pagos;
import Interfaces.IPagosDAO;
import excepciones.PersistenciaException;
import javax.persistence.EntityManager;

/**
 *
 * @author deivi
 */
public class PagosDAO implements IPagosDAO{
ConexionBD conexion = new ConexionBD();
    @Override
    public void agregar(Pagos pagos) throws PersistenciaException {
        EntityManager bd = conexion.obtenerConexion();

        try {
            bd.getTransaction().begin();//entre a la base de datos
            bd.persist(pagos);
            bd.getTransaction().commit();//cerre conexion
        } catch (Exception e) {
            bd.getTransaction().rollback();
            throw new PersistenciaException("No se pudo procesar el pago " + e.getMessage());
        } finally {
            bd.close();
        }
    }
    
}
