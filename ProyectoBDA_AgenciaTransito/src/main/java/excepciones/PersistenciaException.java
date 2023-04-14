/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

/**
 *
 * @author Joel Antonio Lopez Cota ID:228926 y David de Jesus Sotelo Palafox ID:229384
 */
public class PersistenciaException extends Exception{
    
    /**
     * 
     * Constructor por default
     */
    public PersistenciaException() {
    }

    /**
     * 
     * Constructor de Persistencia Exception para errores que recibe el mensaje 
     * @param message mensaje
     */
    public PersistenciaException(String message) {
        super(message);
    }

    /**
     * 
     * Constructor de Persistencia Exception para errores y imprime la causa
     * @param message mensaje
     * @param cause causa
     */
    public PersistenciaException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * 
     * Constructor de Persistencia Exception para errores que solamente recibe la causa y la excusa.
     * @param cause causa
     */
    public PersistenciaException(Throwable cause) {
        super(cause);
    }

    /**
     * 
     * Constructor de Persistencia Exception para errores.
     * @param message mensaje
     * @param cause causa
     * @param enableSuppression
     * @param writableStackTrace 
     */
    public PersistenciaException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}