/**
 * Placa.java
 * Apr 8, 2023 2:12:01 PM
 */
package Dominio;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Objects;
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
      * Constructor por default de la clase
      */
    public Placa() {

    }
    
    /**
     * 
     * Construcotr con todos los atributosd de la clase polaca
     * @param numeroPlaca
     * @param activo
     * @param transporte
     * @param costo
     * @param fechaExpedicion
     * @param fechaVigencia
     * @param persona 
     */
    
    public Placa(String numeroPlaca, boolean activo, Transporte transporte,float costo, Calendar fechaExpedicion, Calendar fechaVigencia,Persona persona) {
        super(costo,fechaExpedicion,fechaVigencia,persona,activo);
        this.numeroPlaca = numeroPlaca;
        this.transporte = transporte;
    }

    /**
     * 
     * Constructor con todos sus atributos excepto el objeto de persona.
     * @param transporte
     * @param costo
     * @param fechaExpedicion
     * @param fechaVigencia
     * @param persona
     * @param activo 
     */
    
    public Placa(Transporte transporte, float costo, Calendar fechaExpedicion, Calendar fechaVigencia, Persona persona, boolean activo) {
        super(costo, fechaExpedicion, fechaVigencia, persona, activo);
        this.transporte = transporte;
    }
    
    
    
    /**
     * 
     * obtiene el numero de placa
     * @return 
     */
    public String getNumeroPlaca() {
        return numeroPlaca;
    }

    /**
     * 
     * Metodo para setear el numero de placa
     * @param numeroPlaca 
     */
    
    public void setNumeroPlaca(String numeroPlaca) {
        this.numeroPlaca = numeroPlaca;
    }
    
    /**
     * 
     * Metodo para obtener el transporte.
     * @return 
     */
    
    public Transporte getTransporte() {
        return transporte;
    }

    /**
     * 
     * Metodo para setear el transporte
     * @param transporte 
     */
    
    public void setTransporte(Transporte transporte) {
        this.transporte = transporte;
    }

    /**
     * 
     * Metodo hash
     * @return 
     */
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.numeroPlaca);
        hash = 47 * hash + Objects.hashCode(this.transporte);
        return hash;
    }

    /**
     * 
     * Metodo equals
     * @param obj
     * @return 
     */
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Placa other = (Placa) obj;
        if (!Objects.equals(this.numeroPlaca, other.numeroPlaca)) {
            return false;
        }
        return Objects.equals(this.transporte, other.transporte);
    }

    
    /**
     * 
     * Metodo toString de la clase
     * @return toString
     */
    @Override
    public String toString() {
        return "Placa{" + "numeroPlaca=" + numeroPlaca + ", transporte=" + transporte + '}';
    }
    
    
}
