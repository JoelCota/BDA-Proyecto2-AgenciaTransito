/**
 * Automovil.java
 * Apr 8, 2023 2:12:22 PM
 */
package Dominio;
//importanciones

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 *
 *
 * @author Joel Antonio Lopez Cota ID:228926
 */
@Entity
@PrimaryKeyJoinColumn(name = "serie_automovil")
@Table(name = "automoviles")
public class Automovil extends Transporte implements Serializable {

    /**
     *
     */
    public Automovil() {

    }

   
}
