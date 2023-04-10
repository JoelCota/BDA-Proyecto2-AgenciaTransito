/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author deivi
 */
public interface IConexionBD {
    /**
     * Crea una conexión y devuelve ojeto Connection
     * @return Devuelve ojeto Connection
     * @throws SQLException Error
     */
    Connection crearConexion() throws SQLException;
}
