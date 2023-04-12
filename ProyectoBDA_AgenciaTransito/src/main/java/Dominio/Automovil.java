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
 *
 * @author Joel Antonio Lopez Cota ID:228926
 */
@Entity
@DiscriminatorValue(value = "automovil")
public class Automovil extends Transporte implements Serializable {

    public Automovil() {
    }

    public Automovil(String numSerie, String modelo, String linea, String marca, String color, List<Placa> listaPlacas) {
        super(numSerie, modelo, linea, marca, color, listaPlacas);
    }

    public Automovil(String numSerie, String modelo, String linea, String marca, String color) {
        super(numSerie, modelo, linea, marca, color);
    }

   
    
}
