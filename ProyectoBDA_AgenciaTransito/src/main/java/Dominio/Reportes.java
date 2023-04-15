package Dominio;

import java.util.Calendar;
import java.util.Date;
/**
* Reportes.java
* Apr 14, 2023 5:06:18 PM
*/ 

/**
 *
 * 
 * @author Joel Antonio Lopez Cota ID:228926
 */
public class Reportes {
    private String nombreCompleto;
    private String tipoTramite;
    private Date fechaExpedicion;
    private float costo;
    /**
     * 
     */
    public Reportes(){
       
    }

    public Reportes(String nombreCompleto, String tipoTramite, Date fechaExpedicion, float costo) {
        this.nombreCompleto = nombreCompleto;
        this.tipoTramite = tipoTramite;
        this.fechaExpedicion = fechaExpedicion;
        this.costo = costo;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getTipoTramite() {
        return tipoTramite;
    }

    public void setTipoTramite(String tipoTramite) {
        this.tipoTramite = tipoTramite;
    }

    public Date getFechaExpedicion() {
        return fechaExpedicion;
    }

    public void setFechaExpedicion(Date fechaExpedicion) {
        this.fechaExpedicion = fechaExpedicion;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }
    
     
}
