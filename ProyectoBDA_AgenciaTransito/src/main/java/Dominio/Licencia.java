/**
 * Licencia.java
 * Apr 8, 2023 2:11:53 PM
 */
package Dominio;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 * Clase de dominio "Licencia" la cual hereda de tramite y se encarga de crear
 * untramite de tipo licencia , asi tambien gestiona los atributos propios del
 * tramite.
 *
 * @author Joel Antonio Lopez Cota ID:228926 y David de Jesus Sotelo Palafox
 * ID:229384
 */
@Entity
@DiscriminatorValue(value = "licencia")
public class Licencia extends Tramite implements Serializable {
    /**
     * Es el tipo de la licencia que tiene la licencia.
     */
    @Column(name = "tipoLicencia", nullable = true, length = 13)
    @Enumerated(value = EnumType.STRING)
    private tipoLicencia tipo;
    /**
     * Son los años de vigencia.
     */
    @Column(name = "vigencia", nullable = true)
    private int vigencia;

    /**
     * Constructor por default de la clase Licencia.
     */
    public Licencia() {

    }

    /**
     *
     * Constructor de la clase licencia con sus respectivos atributos y con los
     * atributos heredados de la clase "tramites" con su respectivo id.
     *
     * @param tipo tipo de Licencia - Normal o Discapacitado.
     * @param vigencia vigencia de la licencia.
     * @param activa atributo booleano para identificar si la licencia se
     * encuentra activa o inactiva.
     * @param id llave primaria de la clase licencia.
     * @param costo costo de la licencia dependiendo sus atributos.
     * @param fechaExpedicion fecha de expedicion de la licencia.
     * @param fechaVigencia fecha de vigencia de la licencia.
     * @param persona objeto persona a la que pertenece la licencia.
     */
    public Licencia(tipoLicencia tipo, int vigencia, boolean activa, Long id,
            float costo, Calendar fechaExpedicion, Calendar fechaVigencia,
            Persona persona) {
        super(id, costo, fechaExpedicion, fechaVigencia, persona, activa);
        this.tipo = tipo;
        this.vigencia = vigencia;
    }

    /**
     * Constructor de la clase licencia con sus respectivos atributos y con los
     * atributos heredados de la clase "tramites" sin su id.
     *
     * @param tipo tipo de Licencia - Normal o Discapacitado.
     * @param vigencia vigencia de la licencia.
     * @param activa atributo booleano para identificar si la licencia se
     * encuentra activa o inactiva.
     * @param costo costo de la licencia dependiendo sus atributos.
     * @param fechaExpedicion fecha de expedicion de la licencia.
     * @param fechaVigencia fecha de vigencia de la licencia.
     * @param persona objeto persona a la que pertenece la licencia.
     */
    public Licencia(tipoLicencia tipo, int vigencia, boolean activa, float costo,
            Calendar fechaExpedicion, Calendar fechaVigencia, Persona persona) {
        super(costo, fechaExpedicion, fechaVigencia, persona, activa);
        this.tipo = tipo;
        this.vigencia = vigencia;
    }

    /**
     *
     * Constructor con el tipo de la licencia y la vigencia.
     *
     * @param tipo tipo
     * @param vigencia vigencia
     */
    public Licencia(tipoLicencia tipo, int vigencia) {
        this.tipo = tipo;
        this.vigencia = vigencia;
    }

    /**
     * Metodo para obtener el tipo de licencia.
     *
     * @return tipo de la licencia.
     */
    public tipoLicencia getTipo() {
        return tipo;
    }

    /**
     * Metodo para setear/actualizar el tipo de la licencia.
     *
     * @param tipo tipo de la licencia
     */
    public void setTipo(tipoLicencia tipo) {
        this.tipo = tipo;
    }

    /**
     * Metodo para obtener la vigencia de la licencia.
     *
     * @return obtiene la vigencia
     */
    public int getVigencia() {
        return vigencia;
    }

    /**
     * Metodo para setear/actualizar la vigencia de la licencia.
     *
     * @param vigencia vigencia de la licencia.
     */
    public void setVigencia(int vigencia) {
        this.vigencia = vigencia;
    }

    /**
     * Metodo que permite generar una string con todos los atributos de la
     * licencia.
     *
     * @return toString de la licencia.
     */
    @Override
    public String toString() {
        return super.toString() + "Licencia{" + "tipo=" + tipo + ", vigencia="
                + vigencia + '}';
    }

}
