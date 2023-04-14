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
     *
     */
    public Licencia() {

    }

    public Licencia(tipoLicencia tipo, int vigencia, boolean activa, Long id, float costo, Calendar fechaExpedicion, Calendar fechaVigencia, Persona persona) {
        super(id, costo, fechaExpedicion, fechaVigencia, persona,activa);
        this.tipo = tipo;
        this.vigencia = vigencia;
    }

    public Licencia(tipoLicencia tipo, int vigencia, boolean activa, float costo, Calendar fechaExpedicion, Calendar fechaVigencia, Persona persona) {
        super(costo, fechaExpedicion, fechaVigencia, persona,activa);
        this.tipo = tipo;
        this.vigencia = vigencia;
    }
    
    public tipoLicencia getTipo() {
        return tipo;
    }
   
    public void setTipo(tipoLicencia tipo) {
        this.tipo = tipo;
    }

    public int getVigencia() {
        return vigencia;
    }

    public void setVigencia(int vigencia) {
        this.vigencia = vigencia;
    }

    @Override
    public String toString() {
        return super.toString()+"Licencia{" + "tipo=" + tipo + ", vigencia=" + vigencia + '}';
    }
    

    

}
