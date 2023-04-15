/**
 * Tramite.java
 * Apr 8, 2023 2:11:24 PM
 */
package Dominio;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * Clase de dominio "Tramite". La cual se encarga de crear todos los atributos
 * existentes en la base de datos y aqui mismo se mapean para luego pasar los
 * datos a la base de datos, tambien aqui estan todos los constructores, gets y
 * sets, hash y el toString de la clase
 *
 * @author Joel Antonio Lopez Cota ID:228926 y David de Jesus Sotelo Palafox
 * ID:229384
 */
@Entity
@Table(name = "tramites")
@DiscriminatorColumn(name = "tipoTramite")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Tramite implements Serializable {

    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "costo", nullable = false)
    private float costo;
    @Column(name = "fechaExpedicion", nullable = false)
    @Temporal(TemporalType.DATE)
    private Calendar fechaExpedicion;
    @Column(name = "fechaVigencia", nullable = false)
    @Temporal(TemporalType.DATE)
    private Calendar fechaVigencia;
    @ManyToOne
    @JoinColumn(name = "rfc", nullable = false)
    private Persona persona;
    @Column(name = "activo", nullable = false)
    private boolean activa;

    /**
     *
     * Constructor por default
     */
    public Tramite() {

    }

    /**
     * 
     * Constructor con sus respectivos atributos
     * @param id llave primaria
     * @param costo
     * @param fechaExpedicion
     * @param fechaVigencia
     * @param persona
     * @param activo 
     */
    public Tramite(Long id, float costo, Calendar fechaExpedicion, Calendar fechaVigencia, Persona persona, boolean activo) {
        this.id = id;
        this.costo = costo;
        this.fechaExpedicion = fechaExpedicion;
        this.fechaVigencia = fechaVigencia;
        this.persona = persona;
        this.activa = activo;
    }

    /**
     * 
     * Constucto de trasmite sin el id
     * @param costo
     * @param fechaExpedicion
     * @param fechaVigencia
     * @param persona
     * @param activo 
     */
    public Tramite(float costo, Calendar fechaExpedicion, Calendar fechaVigencia, Persona persona,boolean activo) {
        this.costo = costo;
        this.fechaExpedicion = fechaExpedicion;
        this.fechaVigencia = fechaVigencia;
        this.persona = persona;
        this.activa = activo;

    }

    /**
     * Metodo para obtener el id
     * @return 
     */
    public Long getId() {
        return id;
    }

    /**
     * Setear id
     * @param id 
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 
     * obtener costos
     * @return 
     */
    public float getCosto() {
        return costo;
    }

    /**
     * 
     * setear costos
     * @param costo 
     */
    public void setCosto(float costo) {
        this.costo = costo;
    }

    /**
     * 
     * obtener fecha de expedicion
     * @return 
     */
    public Calendar getFechaExpedicion() {
        return fechaExpedicion;
    }

    /**
     * 
     * setear fecha de expedicion
     * @param fechaExpedicion 
     */
    public void setFechaExpedicion(Calendar fechaExpedicion) {
        this.fechaExpedicion = fechaExpedicion;
    }

    /**
     * 
     * obtener fecha de vigencia
     * @return 
     */
    public Calendar getFechaVigencia() {
        return fechaVigencia;
    }

    /**
     * 
     * setear fecha de vigencia
     * @param fechaVigencia 
     */
    public void setFechaVigencia(Calendar fechaVigencia) {
        this.fechaVigencia = fechaVigencia;
    }

    /**
     * obtener persona
     * @return 
     */
    public Persona getPersona() {
        return persona;
    }

    /**
     * setear persona
     * @param persona 
     */
    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    /**
     * 
     * obtener si es activa
     * @return 
     */
    public boolean isActiva() {
        return activa;
    }

    /**
     * s
     * setear si es activa
     * @param activa 
     */
    public void setActiva(boolean activa) {
        this.activa = activa;
    }

    /**
     * hashcode
     * @return 
     */
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    /**
     * metodo equals
     * @param object
     * @return 
     */
    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tramite)) {
            return false;
        }
        Tramite other = (Tramite) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Tramite{" + "id=" + id + ", costo=" + costo + ", fechaExpedicion=" + fechaExpedicion + ", fechaVigencia=" + fechaVigencia + ", persona=" + persona + ", activa=" + activa + '}';
    }

    
}
