/**
 * Persona.java
 * Apr 8, 2023 1:42:53 PM
 */
package Dominio;


import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * Clase de dominio "Persona". La cual se encarga de crear todos los atributos
 * existentes en la base de datos y aqui mismo se mapean para luego pasar los
 * datos a la base de datos, tambien aqui estan todos los constructores, gets y sets,
 * hash y el toString de la clase
 * @author Joel Antonio Lopez Cota ID:228926 y David de Jesus Sotelo Palafox ID:229384
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

     @OneToMany(mappedBy = "Persona")
    private List<Tramite> listaTramites;

     
     
    /**
     *
     */
    public Persona() {

    }
    
    public Persona(String RFC) {
        this.RFC = RFC;
    }
    
     public Persona(String RFC, String telefono, String nombreCompleto, Calendar fechaNacimiento, List<Tramite> listaTramites) {
        this.RFC = RFC;
        this.telefono = telefono;
        this.nombreCompleto = nombreCompleto;
        this.fechaNacimiento = fechaNacimiento;
        this.listaTramites = listaTramites;
    }

    public Persona(String RFC, String telefono, String nombreCompleto, Calendar fechaNacimiento) {
        this.RFC = RFC;
        this.telefono = telefono;
        this.nombreCompleto = nombreCompleto;
        this.fechaNacimiento = fechaNacimiento;
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

    public List<Tramite> getListaTramites() {
        return listaTramites;
    }

    public void setListaTramites(List<Tramite> listaTramites) {
        this.listaTramites = listaTramites;
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
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return "RFC=" + RFC  + ", NombreCompleto=" + nombreCompleto + ", Telefono=" + telefono +", FechaNacimiento=" + sdf.format(getFechaNacimiento().getTime());
    }

    
    
    
    

    
    
    }
