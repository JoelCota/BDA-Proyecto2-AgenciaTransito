/**
 * EncriptadoCesar.java
 * Apr 15, 2023 9:55:32 PM
 */
package utilidades;

/**
 * Clase encargada de setEncriptado y desencriptar los elementos del cliente
 *
 * @author Joel Antonio Lopez Cota ID:228926
 */
public class EncriptadoCesar {

    /**
     * Metodo constructor por defecto.
     */
    public EncriptadoCesar() {

    }

    /**
     * Metodo para setEncriptado los datos del nombre
     *
     * @param nombreCompleto es el nombre de la persona a encriptar
     * @return el nombre encriptado
     */
    public String setEncriptado(String nombreCompleto) {
        char[] array = nombreCompleto.toCharArray();
        for (int i = 0; i < array.length; i++) {
            array[i] = (char) (array[i] + (char) 16);
        }
        return String.valueOf(array);
    }

    /**
     * Metodo para desencriptar el nombre.
     *
     * @param encriptado el nombre de la persona encriptado.
     * @return el nombre sin encriptar.
     */
    public String getDesencriptado(String encriptado) {
        char[] array = encriptado.toCharArray();
        for (int i = 0; i < array.length; i++) {
            array[i] = (char) (array[i] - (char) 16);
        }
        return String.valueOf(array);
    }
}
