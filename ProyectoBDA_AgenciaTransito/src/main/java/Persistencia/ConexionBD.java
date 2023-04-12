/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

/**
 *
 * @author deivi
 */
public class ConexionBD {
    private final EntityManagerFactory conexion = Persistence.createEntityManagerFactory("persistenciaDatos"); 
    
    public EntityManager obtenerConexion (){
        return (conexion.createEntityManager());
    }
}
