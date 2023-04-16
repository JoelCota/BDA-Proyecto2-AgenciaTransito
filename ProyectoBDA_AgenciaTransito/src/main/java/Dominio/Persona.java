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
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * Clase de dominio "Persona" la cual se encarga de crear todos los atributos
 * existentes en la base de datos y aqui mismo se mapean para luego pasar los
 * datos a la base de datos, tambien aqui estan todos los constructores, gets y
 * sets, hash y el toString de la clase.
 *
 * @author Joel Antonio Lopez Cota ID:228926 y David de Jesus Sotelo Palafox
 * ID:229384
 */
@Entity
@Table(name = "personas")
public class Persona implements Serializable {

    /**
     * Es el identificador de la persona.
     */
    @Id
    @Column(name = "rfc", nullable = false, length = 13)
    private String RFC;
    /**
     * Es el numero de telefono de la persona.
     */
    @Column(name = "telefono", nullable = false, length = 20)
    private String telefono;
    /**
     * Es el nombre completo de la persona.
     */
    @Column(name = "nombreCompleto", nullable = false, length = 60)
    private String nombreCompleto;
    /**
     * Es la fecha de nacimiento de la persona.
     */
    @Column(name = "fechaNacimiento", nullable = false, length = 13)
    @Temporal(TemporalType.DATE)
    private Calendar fechaNacimiento;
    /**
     * Son la lista de tramites que le corresponden a la persona.
     */
    @OneToMany(mappedBy = "Persona")
    private List<Tramite> listaTramites;

    /**
     * Método constructor por defecto.
     */
    public Persona() {

    }

    /**
     * Método constructor que inicializa los valores de la clase persona.
     *
     * @param RFC es el RFC de la persona a agregar
     * @param telefono es el telefono de la persona
     * @param nombreCompleto es el nombre completo de la persona
     * @param fechaNacimiento es la fecha de nacimiento de la persona
     */
    public Persona(String RFC, String telefono, String nombreCompleto,
            Calendar fechaNacimiento) {
        this.RFC = RFC;
        this.telefono = telefono;
        this.nombreCompleto = nombreCompleto;
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * Método que permite obtener el RFC.
     *
     * @return el RFC de la persona
     */
    public String getRFC() {
        return RFC;
    }

    /**
     * Método que setea el RFC con el parametro.
     *
     * @param RFC es el RFC a setear
     */
    public void setRFC(String RFC) {
        this.RFC = RFC;
    }

    /**
     * Método para obtener el numero de telefono de la persona.
     *
     * @return el numero de telefono de la persona
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Método para setear el telefeno con el parametro.
     *
     * @param telefono el numero de telefono a setear
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Método para obtener el nombre completo de la persona.
     *
     * @return el nombre completo de la persona
     */
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    /**
     * Método para setear el nombre completo.
     *
     * @param nombreCompleto es el nombre completo a setear
     */
    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    /**
     * Método que permite obtener la fecha de nacimiento de la persona.
     *
     * @return la fecha de nacimiento de la persona
     */
    public Calendar getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * Método que permite setear la fecha de nacimiento.
     *
     * @param fechaNacimiento es la fecha a setear
     */
    public void setFechaNacimiento(Calendar fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * Método que permite obtener la lista de tramites de la persona.
     *
     * @return la lista de los tramites realizados por la persona
     */
    public List<Tramite> getListaTramites() {
        return listaTramites;
    }

    /**
     * Método que permite setear una lista de tramites.
     *
     * @param listaTramites es la lista de tramites a setear
     */
    public void setListaTramites(List<Tramite> listaTramites) {
        this.listaTramites = listaTramites;
    }

    /**
     * Metodo hash.
     *
     * @return el hash
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.RFC);
        return hash;
    }

    /**
     * Método que permite conocer si una persona es igual que otra.
     *
     * @param obj es el objeto a comparar
     * @return true si es igual, false en caso contrario
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
        final Persona other = (Persona) obj;
        return Objects.equals(this.RFC, other.RFC);
    }

    /**
     * Método toString que pone todos los datos de la persona en una string.
     *
     * @return la string con todos los datos de la persona
     */
    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return "RFC=" + RFC + ", NombreCompleto=" + nombreCompleto
                + ", Telefono=" + telefono + ", FechaNacimiento="
                + sdf.format(getFechaNacimiento().getTime());
    }

}
