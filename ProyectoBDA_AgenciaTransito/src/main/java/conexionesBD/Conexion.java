/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexionesBD;

import Implementaciones.ConexionBD;
import Interfaces.IConexionBD;

/**
 *
 * @author deivi
 */
public class Conexion {
    
    //Se crea la conexion a la base de datos con usuario y contrasena
    IConexionBD manejadorConexiones = new ConexionBD(
            "jdbc:mysql://localhost/banco_1pm",
            "root",
            "david");
    
    
}
