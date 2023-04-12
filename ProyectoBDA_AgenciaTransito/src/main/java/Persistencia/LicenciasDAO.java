/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Dominio.Licencia;
import excepciones.PersistenciaException;
import javax.persistence.EntityManager;
import Interfaces.ILicenciasDAO;

/**
 *
 * @author deivi
 */
public class LicenciasDAO implements ILicenciasDAO{
    ConexionBD conexion = new ConexionBD();

    @Override
    public void AgregarLicencia(Licencia licencia) throws PersistenciaException {
        EntityManager bd = conexion.obtenerConexion();
        
        try{
            bd.getTransaction().begin();//entre a la base de datos
            //code
            
            //
            bd.getTransaction().commit();//cerre conexion
            System.out.println("Se agrego exitosamente la licencia");
        }catch(Exception e){
            bd.getTransaction().rollback();
            throw new PersistenciaException("No se agrego la licencia" + e.getMessage());
        }
        finally{
            bd.close();
        }
    }

    @Override
    public void ActualizarLicencia(Licencia licencia) throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
            
    
    
        
        
    
}
