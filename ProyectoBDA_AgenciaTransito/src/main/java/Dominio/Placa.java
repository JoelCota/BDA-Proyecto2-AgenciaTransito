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
 * Clase de dominio "Placa". La cual se encarga de crear todos los atributos
 * existentes en la base de datos y aqui mismo se mapean para luego pasar los
 * datos a la base de datos, tambien aqui estan todos los constructores, gets y sets,
 * hash y el toString de la clase
 * @author Joel Antonio Lopez Cota ID:228926 y David de Jesus Sotelo Palafox ID:229384
 */
@Entity
@DiscriminatorValue(value = "placa")
public class Placa extends Tramite implements Serializable {

    //Atributos
    @Column(name = "numeroPlaca", nullable = true, length = 7)
    private String numeroPlaca;
     @ManyToOne(cascade=CascadeType.PERSIST)
     @JoinColumn(name = "id_transporte",nullable = true)
    private Transporte transporte;
    
    /**
     *
     */
    public Placa() {

    }

    public Placa(String numeroPlaca, boolean activo, Transporte transporte,float costo, Calendar fechaExpedicion, Calendar fechaVigencia,Persona persona) {
        super(costo,fechaExpedicion,fechaVigencia,persona,activo);
        this.numeroPlaca = numeroPlaca;
        this.transporte = transporte;
    }

    public Placa(Transporte transporte, float costo, Calendar fechaExpedicion, Calendar fechaVigencia, Persona persona, boolean activo) {
        super(costo, fechaExpedicion, fechaVigencia, persona, activo);
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
    
}
