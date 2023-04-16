/**
 * Placa.java
 * Apr 8, 2023 2:12:01 PM
 */
package Dominio;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * Clase de dominio "Placa" la cual se encarga de crear todos los atributos
 * existentes en la base de datos y aqui mismo se mapean para luego pasar los
 * datos a la base de datos, tambien aqui estan todos los constructores, gets y
 * sets, hash y el toString de la clase.
 *
 * @author Joel Antonio Lopez Cota ID:228926 y David de Jesus Sotelo Palafox
 * ID:229384
 */
@Entity
@DiscriminatorValue(value = "placa")
public class Placa extends Tramite implements Serializable {

    /**
     * Es el numero de placa del transporte.
     */
    @Column(name = "numeroPlaca", nullable = true, length = 7)
    private String numeroPlaca;
    @ManyToOne()
    /**
     * Es el transporte que esta relacionado con la placa.
     */
    @JoinColumn(name = "numSerie", nullable = true)
    private Transporte transporte;

    /**
     *
     * Constructor por default de la clase.
     */
    public Placa() {

    }

    /**
     * Consutrctor con todos los atributos de la clase placa.
     *
     * @param numeroPlaca es el numero de placa del transporte
     * @param activo es el estado de la placa
     * @param transporte es el transporte de la placa
     * @param costo es el costo de placa
     * @param fechaExpedicion es la fecha de expedicion de la placa
     * @param fechaVigencia es la fecha de vigencia de la placa
     * @param persona es la persona a la cual pertenece la placa
     */
    public Placa(String numeroPlaca, boolean activo, Transporte transporte,
            float costo, Calendar fechaExpedicion, Calendar fechaVigencia,
            Persona persona) {
        super(costo, fechaExpedicion, fechaVigencia, persona, activo);
        this.numeroPlaca = numeroPlaca;
        this.transporte = transporte;
    }

    /**
     * Metodo para obtener el numero de placa.
     *
     * @return el numero de placa
     */
    public String getNumeroPlaca() {
        return numeroPlaca;
    }

    /**
     * Metodo para setear el numero de placa.
     *
     * @param numeroPlaca
     */
    public void setNumeroPlaca(String numeroPlaca) {
        this.numeroPlaca = numeroPlaca;
    }

    /**
     * Metodo para obtener el transporte.
     *
     * @return el transporte
     */
    public Transporte getTransporte() {
        return transporte;
    }

    /**
     * Metodo para setear el transporte.
     *
     * @param transporte es el transporte a setear
     */
    public void setTransporte(Transporte transporte) {
        this.transporte = transporte;
    }

    /**
     * Metodo hash.
     *
     * @return el hash
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.numeroPlaca);
        hash = 47 * hash + Objects.hashCode(this.transporte);
        return hash;
    }

    /**
     * Metodo que compara si una placa es igual que otra.
     *
     * @param obj es el objeto a comparar
     * @return true si es igual, falso en caso contrario
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
     * Metodo toString de la clase.
     *
     * @return una string con todos los atributos de la clase
     */
    @Override
    public String toString() {
        return "Placa{" + "numeroPlaca=" + numeroPlaca + ", transporte="
                + transporte + '}';
    }

}
