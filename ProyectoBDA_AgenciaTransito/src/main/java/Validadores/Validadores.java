package Validadores;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
* Validadores.java
* Apr 12, 2023 1:53:09 AM
*/ 

/**
 *
 * 
 * @author Joel Antonio Lopez Cota ID:228926 y David de Jesus Sotelo Palafox ID:229384
 */
public class Validadores {

    /**
     * 
     */
    public Validadores(){

    }
    public boolean validarSerie(java.awt.event.KeyEvent evt){
        
        String patron= "^([A-Z]{3}-\\d{3,4})$";
        Pattern p= Pattern.compile(patron);
         Matcher matcher = p.matcher(evt.toString());
         if (matcher.matches()) {
            return true;
        }
         return false;
    }
}
