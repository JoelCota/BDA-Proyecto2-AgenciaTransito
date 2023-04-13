/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Principal;

import Persistencia.PersonasDAO;
import Presentacion.frmMenu;
import excepciones.PersistenciaException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Joel Antonio Lopez Cota ID:228926 y David de Jesus Sotelo Palafox ID:229384
 */
public class ProyectoBDA_AgenciaTransito {

    public static void main(String[] args) throws PersistenciaException {

            frmMenu menu = new frmMenu();
            menu.setVisible(true);
//            PersonasDAO persona=new PersonasDAO();
//        try {
//            persona.prueba();
//        } catch (PersistenciaException ex) {
//            Logger.getLogger(ProyectoBDA_AgenciaTransito.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }      
}
