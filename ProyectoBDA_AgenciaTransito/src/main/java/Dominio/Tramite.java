/**
 * Tramite.java
 * Apr 8, 2023 2:11:24 PM
 */
package Dominio;

import java.io.Serializable;
import java.util.Calendar;
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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * Clase de dominio "Tramite" la cual se encarga de crear todos los atributos
 * existentes en la base de datos y aqui mismo se mapean para luego pasar los
 * datos a la base de datos, tambien aqui estan todos los constructores, gets y
 * sets, hash y el toString de la clase.
 *
 * @author Joel Antonio Lopez Cota ID:228926 y David de Jesus Sotelo Palafox
 * ID:229384
 */
@Entity
@Table(name = "tramites")
@DiscriminatorColumn(name = "tipoTramite")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Tramite implements Serializable {

    /**
     * Es el identificador del tramite.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    /**
     * Es el costo del tramite.
     */
    @Column(name = "costo", nullable = false)
    private float costo;
    /**
     * Es la fecha de expedicion del tramite.
     */
    @Column(name = "fechaExpedicion", nullable = false)
    @Temporal(TemporalType.DATE)
    private Calendar fechaExpedicion;
    /**
     * Es la fecha de vigencia del tramite.
     */
    @Column(name = "fechaVigencia", nullable = false)
    @Temporal(TemporalType.DATE)
    private Calendar fechaVigencia;
    /**
     * Es la persona que realizo el tramite.
     */
    @ManyToOne
    @JoinColumn(name = "rfc", nullable = false)
    private Persona persona;
    /**
     * Es el estado del tramite.
     */
    @Column(name = "activo", nullable = false)
    private boolean activa;
    /**
     * Es el tipo de tramite que es.
     */
    @Column(name = "tipoTramite", insertable = false, updatable = false)
    private String tipoTramite;

    /**
     *
     * Constructor por default.
     */
    public Tramite() {

    }

    /**
     * Constructor con sus respectivos atributos.
     *
     * @param id Es el id que pertenece el tramite
     * @param costo Es el costo que tiene el tramite
     * @param fechaExpedicion Es la fecha de expedicion del tramite
     * @param fechaVigencia Es la fecha de la vigencia del tramite
     * @param persona Es la persona que genero el tramite
     * @param activo Es el estado del tramite
     */
    public Tramite(Long id, float costo, Calendar fechaExpedicion,
            Calendar fechaVigencia, Persona persona, boolean activo) {
        this.id = id;
        this.costo = costo;
        this.fechaExpedicion = fechaExpedicion;
        this.fechaVigencia = fechaVigencia;
        this.persona = persona;
        this.activa = activo;
    }

    /**
     * Constucto de trasmite sin el id.
     *
     * @param costo Es el costo que tiene el tramite
     * @param fechaExpedicion Es la fecha de expedicion del tramite
     * @param fechaVigencia Es la fecha de la vigencia del tramite
     * @param persona Es la persona que genero el tramite
     * @param activo Es el estado del tramite
     */
    public Tramite(float costo, Calendar fechaExpedicion,
            Calendar fechaVigencia, Persona persona, boolean activo) {
        this.costo = costo;
        this.fechaExpedicion = fechaExpedicion;
        this.fechaVigencia = fechaVigencia;
        this.persona = persona;
        this.activa = activo;

    }

    /**
     * Metodo para obtener el id.
     *
     * @return el id del tramite
     */
    public Long getId() {
        return id;
    }

    /**
     * Metodo para setear el id.
     *
     * @param id es el id a setear
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Metodo para obtener el costo del tramite.
     *
     * @return el costo del tramtie
     */
    public float getCosto() {
        return costo;
    }

    /**
     * Metodo para setear el costo del tramite.
     *
     * @param costo es el costo del tramite a setear
     */
    public void setCosto(float costo) {
        this.costo = costo;
    }

    /**
     *
     * Metodo para obtener la fecha de expedicion.
     *
     * @return la fecha de expedicion del tramite
     */
    public Calendar getFechaExpedicion() {
        return fechaExpedicion;
    }

    /**
     *
     * Metodo para setear la fecha de expedicion.
     *
     * @param fechaExpedicion es la fecha de expedicion a setear
     */
    public void setFechaExpedicion(Calendar fechaExpedicion) {
        this.fechaExpedicion = fechaExpedicion;
    }

    /**
     *
     * Metodo para obtener la fecha de vigencia.
     *
     * @return la fecha de vigencia del tramite
     */
    public Calendar getFechaVigencia() {
        return fechaVigencia;
    }

    /**
     *
     * Metodo para setear fecha de vigencia.
     *
     * @param fechaVigencia es la fecha de vigencia del tramite a setear
     */
    public void setFechaVigencia(Calendar fechaVigencia) {
        this.fechaVigencia = fechaVigencia;
    }

    /**
     * Metodo para obtener a la persona.
     *
     * @return la persona a la cual le pertenece el trmaite
     */
    public Persona getPersona() {
        return persona;
    }

    /**
     * Metodo para setear persona.
     *
     * @param persona es la persona a setear
     */
    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    /**
     *
     * Metodo para obtener si el tramite esta activo.
     *
     * @return true is es activo, false en caso contrario
     */
    public boolean isActiva() {
        return activa;
    }

    /**
     * Metodo para setear si es activa.
     *
     * @param activa true si es activo, false en caso contrario
     */
    public void setActiva(boolean activa) {
        this.activa = activa;
    }

    /**
     * Metodo que permite obtener el tipo de tramite del tramite.
     *
     * @return Licencia si el tramite es de licencia y Placa si es perteneciente
     * a placas
     */
    public String getTipoTramite() {
        return tipoTramite;
    }

    /**
     * Metodo que permite setear el tipo de tramite al cual pertenece.
     *
     * @param tipoTramite es el tipo de tramite al cual pertenece el tramite
     */
    public void setTipoTramite(String tipoTramite) {
        this.tipoTramite = tipoTramite;
    }

    /**
     * Metodo hash.
     *
     * @return el hash
     */
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    /**
     * Método que permite conocer si un objeto es igual que otro.
     *
     * @param object el objeto a comparar
     * @return true si es igual, false en caso contrario
     */
    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Tramite)) {
            return false;
        }
        Tramite other = (Tramite) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    /**
     * Metodo toString que permite generar una string con todos los atributos de
     * la clase.
     *
     * @return una string con todos los atributos
     */
    @Override
    public String toString() {
        return "Tramite{" + "id=" + id + ", costo=" + costo
                + ", fechaExpedicion=" + fechaExpedicion + ", fechaVigencia="
                + fechaVigencia + ", persona=" + persona + ", activa=" + activa
                + ", tipoTramite=" + tipoTramite + '}';
    }

}
