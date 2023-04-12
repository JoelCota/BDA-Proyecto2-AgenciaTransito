/**
 * Placa.java
 * Apr 8, 2023 2:12:01 PM
 */
package Dominio;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 *
 *
 * @author Joel Antonio Lopez Cota ID:228926
 */
@Entity
@DiscriminatorValue(value = "placa")
public class Placa extends Tramite implements Serializable {

    //Atributos
    @Column(name = "numeroPlaca", nullable = false, length = 7)
    private String numeroPlaca;
   @ManyToOne
    @JoinColumn(name = "numSerie",nullable = false)
    private Transporte transporte;
    
    /**
     *
     */
    public Placa() {

    }

    public String getNumeroPlaca() {
        return numeroPlaca;
    }

    public void setNumeroPlaca(String numeroPlaca) {
        this.numeroPlaca = numeroPlaca;
    }
    
    public Transporte getTransporte() {
        return transporte;
    }

    public void setTransporte(Transporte transporte) {
        this.transporte = transporte;
    }
    
}
