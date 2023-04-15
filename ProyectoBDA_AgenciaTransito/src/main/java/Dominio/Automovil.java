/**
 * Automovil.java
 * Apr 8, 2023 2:12:22 PM
 */
package Dominio;
//importanciones

import java.io.Serializable;
import java.util.List;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 *
 * Clase de dominio "Automovil". La cual se encarga de crear todos los atributos
 * existentes en la base de datos y aqui mismo se mapean para luego pasar los
 * datos a la base de datos, tambien aqui estan todos los constructores, gets y sets,
 * hash y el toString de la clase
 * @author Joel Antonio Lopez Cota ID:228926 y David de Jesus Sotelo Palafox ID:229384
 */
@Entity
@DiscriminatorValue(value = "automovil")
public class Automovil extends Transporte implements Serializable {

    /**
     * Constructor por default de la clase automovil
     */
    public Automovil() {
    
    }
    
    /**
     * 
     * Constructor de herencia de la clase automovil con atributos heredados de la clase de transporte con la lista placas
     * @param numSerie Numero de serie
     * @param modelo Modelo del vehiculo
     * @param linea Linea del vehiculo
     * @param marca Marca del vehiculo
     * @param color Color del vehiculo
     * @param listaPlacas La lista de las placas del vehiculo
     */
    public Automovil(String numSerie, String modelo, String linea, String marca, String color, List<Placa> listaPlacas) {
        super(numSerie, modelo, linea, marca, color, listaPlacas);
    }

    /**
     * 
     * Constructor de herencia de la clase automovil con atributos heredados de la clase de transporte
     * @param numSerie Numero de serie
     * @param modelo Modelo del vehiculo
     * @param linea Linea del vehiculo
     * @param marca Marca del vehiculo
     * @param color Color del vehiculo
     */
    
    public Automovil(String numSerie, String modelo, String linea, String marca, String color) {
        super(numSerie, modelo, linea, marca, color);
    }

    @Override
    public String toString() {
        return "Automovil{" + '}';
    }

   
    
}
