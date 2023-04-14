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
 * Clase relacionada con la conexion directa a la base de datos
 * @author Joel Antonio Lopez Cota ID:228926 y David de Jesus Sotelo Palafox ID:229384
 */
public class ConexionBD {
    /**
     * Se creo el objeto EntityManagerFactory para la conexion.
     */
    private final EntityManagerFactory conexion = Persistence.createEntityManagerFactory("Principal_ProyectoBDA_AgenciaTransito_jar_1.0-SNAPSHOTPU"); 
    
    
    /**
     * Metodo encargado de obtener una nueva conexion creandola con el EntityManagerFactory.
     * @return 
     */
    public EntityManager obtenerConexion (){
        return (conexion.createEntityManager());
    }
}
