package Dominio;

import java.util.Calendar;
import java.util.Date;
import java.util.Objects;
/**
* Reportes.java
* Apr 14, 2023 5:06:18 PM
*/ 

/**
 *
 * Clase encargada de los reportes
 * @author Joel Antonio Lopez Cota ID:228926 y David de Jesus Sotelo Palafox ID:229384
 */
public class Reportes {
    private String nombreCompleto;
    private String tipoTramite;
    private Date fechaExpedicion;
    private float costo;

    /**
     * Constructor por default
     */
    
    public Reportes(){
       
    }

    /**
     * Consutrctor con todos sus atributos
     * @param nombreCompleto
     * @param tipoTramite
     * @param fechaExpedicion
     * @param costo 
     */
    public Reportes(String nombreCompleto, String tipoTramite, Date fechaExpedicion, float costo) {
        this.nombreCompleto = nombreCompleto;
        this.tipoTramite = tipoTramite;
        this.fechaExpedicion = fechaExpedicion;
        this.costo = costo;
    }

    /**
     * Constructor sin sus costes
     * @param nombreCompleto
     * @param tipoTramite
     * @param fechaExpedicion 
     */
    public Reportes(String nombreCompleto, String tipoTramite, Date fechaExpedicion) {
        this.nombreCompleto = nombreCompleto;
        this.tipoTramite = tipoTramite;
        this.fechaExpedicion = fechaExpedicion;
    }
    
/**
 * Metodo para obtener el nombre completo
 * @return 
 */    

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    /**\
     * 
     * Metodo para setear el nombre completo
     * @param nombreCompleto 
     */
    
    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    /**
     * 
     * Metodo para obtener el tipo del tramite
     * @return tramite
     */
    
    public String getTipoTramite() {
        return tipoTramite;
    }

    /**
     * 
     * Metodo para setear el tipo del tramite
     * @param tipoTramite 
     */
    
    public void setTipoTramite(String tipoTramite) {
        this.tipoTramite = tipoTramite;
    }
    
    
    /**
     * 
     * Metodo para obtneer la fecha de expedicion
     * @return 
     */
    
    public Date getFechaExpedicion() {
        return fechaExpedicion;
    }

    /**
     * 
     * Metodo que se encarga de setear la fecha de expedicion.
     * @param fechaExpedicion 
     */
    
    public void setFechaExpedicion(Date fechaExpedicion) {
        this.fechaExpedicion = fechaExpedicion;
    }

    /**
     * 
     * Metodo para obtener el costo
     * @return 
     */
    
    public float getCosto() {
        return costo;
    }

    /**
     * Metodo para setear el costo.
     * @param costo 
     */
    
    public void setCosto(float costo) {
        this.costo = costo;
    }

    /**
     * 
     * Metodo hascode
     * @return 
     */
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + Objects.hashCode(this.nombreCompleto);
        hash = 73 * hash + Objects.hashCode(this.tipoTramite);
        hash = 73 * hash + Objects.hashCode(this.fechaExpedicion);
        hash = 73 * hash + Float.floatToIntBits(this.costo);
        return hash;
    }

    /**
     * 
     * Metodo equals
     * @param obj
     * @return 
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
        final Reportes other = (Reportes) obj;
        if (Float.floatToIntBits(this.costo) != Float.floatToIntBits(other.costo)) {
            return false;
        }
        if (!Objects.equals(this.nombreCompleto, other.nombreCompleto)) {
            return false;
        }
        if (!Objects.equals(this.tipoTramite, other.tipoTramite)) {
            return false;
        }
        return Objects.equals(this.fechaExpedicion, other.fechaExpedicion);
    }

    /**
     * 
     * toString de la clase
     * @return 
     */
    @Override
    public String toString() {
        return "Reportes{" + "nombreCompleto=" + nombreCompleto + ", tipoTramite=" + tipoTramite + ", fechaExpedicion=" + fechaExpedicion + ", costo=" + costo + '}';
    }
    
    
     
}
