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
     */
    public Tramite() {

    }

    public Tramite(Long id, float costo, Calendar fechaExpedicion, Calendar fechaVigencia, Persona persona, boolean activo) {
        this.id = id;
        this.costo = costo;
        this.fechaExpedicion = fechaExpedicion;
        this.fechaVigencia = fechaVigencia;
        this.persona = persona;
        this.activa = activo;
    }

    public Tramite(float costo, Calendar fechaExpedicion, Calendar fechaVigencia, Persona persona,boolean activo) {
        this.costo = costo;
        this.fechaExpedicion = fechaExpedicion;
        this.fechaVigencia = fechaVigencia;
        this.persona = persona;
        this.activa = activo;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public Calendar getFechaExpedicion() {
        return fechaExpedicion;
    }

    public void setFechaExpedicion(Calendar fechaExpedicion) {
        this.fechaExpedicion = fechaExpedicion;
    }

    public Calendar getFechaVigencia() {
        return fechaVigencia;
    }

    public void setFechaVigencia(Calendar fechaVigencia) {
        this.fechaVigencia = fechaVigencia;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public boolean isActiva() {
        return activa;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

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
        return "Dominio.Tramite[ id=" + id + " ]";
    }
}
