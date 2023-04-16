package Validadores;

import java.awt.event.KeyEvent;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Clase para gestionar las validaciones de datos.
 *
 * @author Joel Antonio Lopez Cota ID:228926 y David de Jesus Sotelo Palafox
 * ID:229384
 */
public class Validadores {

    /**
     *
     * Metodo encargado de validar la serie del vehiculo.
     *
     * @param serie String serie del vehiculo
     * @return retorna si se pudo o no validar
     */
    public boolean validarSerie(String serie) {

        String patron = "^([A-Z]{3}-\\d{3,4})$";
        Pattern p = Pattern.compile(patron);
        Matcher matcher = p.matcher(serie);
        if (matcher.matches()) {
            return true;
        }
        return false;
    }

    /**
     * Metodo para validar el campo por numero.
     *
     * @param evt evento
     */
    public void validacionNumero(java.awt.event.KeyEvent evt) {
        char txt = evt.getKeyChar();
        if (!(Character.isDigit(txt))) {
            evt.consume();
        }
    }

    /**
     *
     * Metodo para validar el campo alfabetico.
     *
     * @param evt evento
     */
    public void validacionCamposAlfabeto(java.awt.event.KeyEvent evt) {
        char txt = evt.getKeyChar();
        if (!(Character.isAlphabetic(txt) || txt == KeyEvent.VK_SPACE)) {
            evt.consume();
        }
    }

    /**
     *
     * Metodo para validar el campo del RFC.
     *
     * @param evt evento
     */
    public void validacionRFC(java.awt.event.KeyEvent evt) {
        char txt = evt.getKeyChar();
        if (!(Character.isLetterOrDigit(txt))) {
            evt.consume();
        }
    }

    /**
     * Metodo para validar el campo de la serie.
     *
     * @param evt evento
     */
    public void validacionCamposSerie(java.awt.event.KeyEvent evt) {
        char txt = evt.getKeyChar();
        if (!(txt == KeyEvent.VK_MINUS || Character.isLetterOrDigit(txt))) {
            evt.consume();
        }
    }
}
