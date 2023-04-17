/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package Principal;

import Presentacion.frmMenu;
import excepciones.PersistenciaException;


/**
 * Clase principal
 * @author Joel Antonio Lopez Cota ID:228926 y David de Jesus Sotelo Palafox
 * ID:229384
 */
public class ProyectoBDA_AgenciaTransito {

    public static void main(String[] args) throws PersistenciaException {
        frmMenu menu = new frmMenu();
        menu.setVisible(true);
    }
}
