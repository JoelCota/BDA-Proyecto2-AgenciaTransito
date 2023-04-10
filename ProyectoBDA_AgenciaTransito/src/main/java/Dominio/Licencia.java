/**
* Licencia.java
* Apr 8, 2023 2:11:53 PM
*/ 

package Dominio;


import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

/**
 *
 * 
 * @author Joel Antonio Lopez Cota ID:228926
 */
@Entity
@Table(name="licencias")
public class Licencia extends Tramite implements Serializable  { //PONER QUE EXTIENDE DE TRAMITE

    //Atributos
    @Column(name="tipoLicencia",nullable=false,length=13)
    @Enumerated(value=EnumType.STRING)
    private tipoLicencia tipo;

    /**
     * 
     */
    public Licencia(){

    }

    public tipoLicencia getTipo() {
        return tipo;
    }

    public void setTipo(tipoLicencia tipo) {
        this.tipo = tipo;
    }

    
}
