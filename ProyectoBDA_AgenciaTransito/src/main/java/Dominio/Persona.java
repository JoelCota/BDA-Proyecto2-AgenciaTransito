/**
 * Persona.java
 * Apr 8, 2023 1:42:53 PM
 */
package Dominio;


import java.io.Serializable;
import java.util.Calendar;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 *
 * @author Joel Antonio Lopez Cota ID:228926
 */
@Entity
@Table(name = "personas")
public class Persona implements Serializable {

    //Atributos
    @Id
    @Column(name = "rfc", nullable = false, length = 13)
    private String RFC;
    @Column(name = "telefono", nullable = false, length = 20)
    private String telefono;
    @Column(name = "nombreCompleto", nullable = false, length = 60)
    private String nombreCompleto;
    @Column(name = "fechaNacimiento", nullable = false, length = 13)
    @Temporal(TemporalType.DATE)
    private Calendar fechaNacimiento;

    /**
     *
     */
    public Persona() {

    }

    public String getRFC() {
        return RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public Calendar getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Calendar fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.RFC);
        return hash;
    }

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
        final Persona other = (Persona) obj;
        return Objects.equals(this.RFC, other.RFC);
    }

    @Override
    public String toString() {
        return "Persona{" + "RFC=" + RFC + ", telefono=" + telefono + ", nombreCompleto=" + nombreCompleto + ", fechaNacimiento=" + fechaNacimiento + '}';
    }

    }
