/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Implementaciones;

import Dominio.Persona;
import Interfaces.IPersonaDAO;
import excepciones.PersistenciaException;
import javax.persistence.EntityManager;

/**
 *
 * @author deivi
 */
public class PersonalDAO implements IPersonaDAO{
    //OBJETO CONEXION
ConexionBD conexion = new ConexionBD();

    @Override
    public void agregarPersona(Persona persona) throws PersistenciaException {
        EntityManager bd = conexion.obtenerConexion();
        
        try{
            bd.getTransaction().begin();//entre a la base de datos
            bd.persist(persona);
            bd.getTransaction().commit();//cerre conexion
            System.out.println("Persona guardada exitosamente!.");
        }catch(Exception e){
            bd.getTransaction().rollback();
            throw new PersistenciaException("No se puedo guardar la persona." + e.getMessage());
        }
        finally{
            bd.close();
        }
        
    }
    
}
