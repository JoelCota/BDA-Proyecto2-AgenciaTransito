/**
 * Placa.java
 * Apr 8, 2023 2:12:01 PM
 */
package Dominio;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

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
    
      @Column(name = "Activo")
    private boolean activo;
    
     @ManyToOne(cascade=CascadeType.PERSIST)
     @JoinColumn(name = "numSerie",nullable = false)
    private Transporte transporte;
    
    /**
     *
     */
    public Placa() {

    }

    public Placa(String numeroPlaca, boolean activo, Transporte transporte,float costo, Calendar fechaExpedicion, Calendar fechaVigencia,Persona persona) {
        super(costo,fechaExpedicion,fechaVigencia,persona);
        this.numeroPlaca = numeroPlaca;
        this.activo = activo;
        this.transporte = transporte;
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

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    
    
}
