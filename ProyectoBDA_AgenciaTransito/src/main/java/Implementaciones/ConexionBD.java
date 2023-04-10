/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Implementaciones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author deivi
 */
public class ConexionBD implements Interfaces.IConexionBD{
     //Se crean las variables finales.
    private final String CADENA_CONEXION;
    private final String USUARIO;
    private final String PASSWORD;

    /**
     * Metodo que guarda los datos necesarios para crear la conexion a la base de datos.
     * @param CADENA_CONEXION cadena de conexion
     * @param USUARIO Usuario
     * @param PASSWORD Constreasena
     */
    public ConexionBD(String CADENA_CONEXION, String USUARIO, String PASSWORD) {
        this.CADENA_CONEXION = CADENA_CONEXION;
        this.USUARIO = USUARIO;
        this.PASSWORD = PASSWORD;
    }

    /**
     * Metodo que crea la conexion a la base de datos y se ingresan los datos que se guardaron en el metodo de ConexionBD.
     * @return retorna la conexion
     * @throws SQLException Errores
     */
    @Override
    public Connection crearConexion() throws SQLException {
        Connection conexion = DriverManager.getConnection(CADENA_CONEXION, USUARIO, PASSWORD);
        return conexion;
    }
}
