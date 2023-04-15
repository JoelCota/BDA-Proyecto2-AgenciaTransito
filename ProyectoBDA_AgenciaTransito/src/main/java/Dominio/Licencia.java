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
 *
 * Clase de dominio "Licencia". La cual se encarga de crear todos los atributos
 * existentes en la base de datos y aqui mismo se mapean para luego pasar los
 * datos a la base de datos, tambien aqui estan todos los constructores, gets y sets,
 * hash y el toString de la clase
 * @author Joel Antonio Lopez Cota ID:228926 y David de Jesus Sotelo Palafox ID:229384
 */
@Entity
@DiscriminatorValue(value = "licencia")
public class Licencia extends Tramite implements Serializable { //PONER QUE EXTIENDE DE TRAMITE

    //Atributos
    @Column(name = "tipoLicencia", nullable = true, length = 13)
    @Enumerated(value = EnumType.STRING)
    private tipoLicencia tipo;
    @Column(name = "vigencia", nullable = true)
    private int vigencia;

    /**
     * Constructor por default de la clase Licencia
     */
    public Licencia() {

    }

    /**
     * 
     * Constructor de la clase licencia con sus respectivos atributos y con los 
     * atributos heredados de la clase "tramites" con su respectivo id.
     * @param tipo tipo de Licencia - Normal o Discapacitado.
     * @param vigencia vigencia de la licencia.
     * @param activa atributo booleano para identificar si la licencia se encuentra activa o inactiva.
     * @param id llave primaria de la clase licencia.
     * @param costo costo de la licencia dependiendo sus atributos.
     * @param fechaExpedicion fecha de expedicion de la licencia.
     * @param fechaVigencia fecha de vigencia de la licencia.
     * @param persona objeto persona a la que pertenece la licencia.
     */
    public Licencia(tipoLicencia tipo, int vigencia, boolean activa, Long id, float costo, Calendar fechaExpedicion, Calendar fechaVigencia, Persona persona) {
        super(id, costo, fechaExpedicion, fechaVigencia, persona,activa);
        this.tipo = tipo;
        this.vigencia = vigencia;
    }

    
    /**
     * Constructor de la clase licencia con sus respectivos atributos y con los 
     * atributos heredados de la clase "tramites" sin su id.
     * @param tipo tipo de Licencia - Normal o Discapacitado.
     * @param vigencia vigencia de la licencia.
     * @param activa atributo booleano para identificar si la licencia se encuentra activa o inactiva.
     * @param costo costo de la licencia dependiendo sus atributos.
     * @param fechaExpedicion fecha de expedicion de la licencia.
     * @param fechaVigencia fecha de vigencia de la licencia.
     * @param persona objeto persona a la que pertenece la licencia.
     */
    public Licencia(tipoLicencia tipo, int vigencia, boolean activa, float costo, Calendar fechaExpedicion, Calendar fechaVigencia, Persona persona) {
        super(costo, fechaExpedicion, fechaVigencia, persona,activa);
        this.tipo = tipo;
        this.vigencia = vigencia;
    }

    /**
     * 
     * Constructor con el tipo de la licencia y la vigencia
     * @param tipo tipo
     * @param vigencia  vigencia
     */
    public Licencia(tipoLicencia tipo, int vigencia) {
        this.tipo = tipo;
        this.vigencia = vigencia;
    }

    
    /**
     * 
     * Consturctor con los atributos de la clase y los supers
     * @param tipo
     * @param vigencia
     * @param id
     * @param costo
     * @param fechaExpedicion
     * @param fechaVigencia
     * @param persona
     * @param activo 
     */
    public Licencia(tipoLicencia tipo, int vigencia, Long id, float costo, Calendar fechaExpedicion, Calendar fechaVigencia, Persona persona, boolean activo) {
        super(id, costo, fechaExpedicion, fechaVigencia, persona, activo);
        this.tipo = tipo;
        this.vigencia = vigencia;
    }

    /**
     * 
     * Constructorcon sus atributos y los supers algunos
     * @param tipo
     * @param vigencia
     * @param costo
     * @param fechaExpedicion
     * @param fechaVigencia
     * @param persona
     * @param activo 
     */
    public Licencia(tipoLicencia tipo, int vigencia, float costo, Calendar fechaExpedicion, Calendar fechaVigencia, Persona persona, boolean activo) {
        super(costo, fechaExpedicion, fechaVigencia, persona, activo);
        this.tipo = tipo;
        this.vigencia = vigencia;
    }
    
    
    
    
    /**
     * Metodo para obtener el tipo de licencia.
     * @return tipo de la licencia.
     */
    public tipoLicencia getTipo() {
        return tipo;
    }
   
    /**
     * metodo para setear/actualizar el tipo de la licencia
     * @param tipo tipo de la licencia
     */
    public void setTipo(tipoLicencia tipo) {
        this.tipo = tipo;
    }

    /**
     * metodo para obtener la vigencia de la licencia
     * @return obtiene la vigencia
     */
    public int getVigencia() {
        return vigencia;
    }

    /**
     * metodo para setear/actualizar la vigencia de la licencia.
     * @param vigencia vigencia de la licencia.
     */
    public void setVigencia(int vigencia) {
        this.vigencia = vigencia;
    }

    /**
     * metodo que sobre escribe el toString.
     * @return toString de la licencia.
     */
    @Override
    public String toString() {
        return super.toString()+"Licencia{" + "tipo=" + tipo + ", vigencia=" + vigencia + '}';
    }
    

    

}
