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
    private final EntityManagerFactory conexion = Persistence.createEntityManagerFactory("Principal_ProyectoBDA_AgenciaTransito_jar_1.0-SNAPSHOTPU"); 
    
    public EntityManager obtenerConexion (){
        return (conexion.createEntityManager());
    }
}
