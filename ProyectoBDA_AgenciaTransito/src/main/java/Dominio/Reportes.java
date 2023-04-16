package Dominio;

import java.util.Objects;

/**
 * Reportes.java Apr 14, 2023 5:06:18 PM
 */
/**
 * Clase de dominio "Reportes" la cual sirve para generar todos los atributos
 * necesarios para crear un reporte.
 *
 * @author Joel Antonio Lopez Cota ID:228926 y David de Jesus Sotelo Palafox
 * ID:229384
 */
public class Reportes {
    /**
     * Es el nombre completo de la persona de la cual se quiere generar un reporte.
     */
    private String nombreCompleto;
    /**
     * Es el tipo de tramite que realizo la persona de la cual se quiere generar un reporte.
     */
    private String tipoTramite;
    /**
     * Es la fecha expedicion del tramite que realizo la persona de la cual se quiere generar un reporte.
     */
    private String fechaExpedicion;
    /**
     * Es el costo del tramite que realizo la persona de la cual se quiere generar un reporte.
     */
    private float costo;

    /**
     * Constructor por default.
     */
    public Reportes() {

    }

    /**
     * Consutrctor con todos sus atributos.
     *
     * @param nombreCompleto El nombre completo de la persona que genera el
     * tramite
     * @param tipoTramite El tipo de tramite al que pertenece
     * @param fechaExpedicion La fecha en la que se realizo el tramite
     * @param costo El costo que tuvo el tramite
     */
    public Reportes(String nombreCompleto, String tipoTramite,
            String fechaExpedicion, float costo) {
        this.nombreCompleto = nombreCompleto;
        this.tipoTramite = tipoTramite;
        this.fechaExpedicion = fechaExpedicion;
        this.costo = costo;
    }

    /**
     * Metodo para obtener el nombre completo.
     *
     * @return el nombre completo de la persona
     */
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    /**
     * Metodo para setear el nombre completo.
     *
     * @param nombreCompleto el nombre completo de la persona
     */
    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    /**
     * Metodo para obtener el tipo del tramite.
     *
     * @return el tipo de tramite al que pertenece
     */
    public String getTipoTramite() {
        return tipoTramite;
    }

    /**
     * Metodo para setear el tipo del tramite.
     *
     * @param tipoTramite es el tipo de tramite al que pertenece el tramite
     */
    public void setTipoTramite(String tipoTramite) {
        this.tipoTramite = tipoTramite;
    }

    /**
     * Metodo para obtnener la fecha de expedicion.
     *
     * @return la fecha en la cual se expidio el tramite
     */
    public String getFechaExpedicion() {
        return fechaExpedicion;
    }

    /**
     * Metodo para setear la fecha de expedicion.
     *
     * @param fechaExpedicion es la fecha de expedicion del tramite
     */
    public void setFechaExpedicion(String fechaExpedicion) {
        this.fechaExpedicion = fechaExpedicion;
    }

    /**
     * Metodo para obtener el costo del tramite.
     *
     * @return el costo del tramite
     */
    public float getCosto() {
        return costo;
    }

    /**
     * Metodo para setear el costo del tramite.
     *
     * @param costo es el costo a setear del tramite
     */
    public void setCosto(float costo) {
        this.costo = costo;
    }

    /**
     * Método hascode.
     *
     * @return el hash
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
     * Metodo que permite conocer si un Reporte es igual que otro.
     *
     * @param obj el reporte a comparar
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
        final Reportes other = (Reportes) obj;
        if (Float.floatToIntBits(this.costo)
                != Float.floatToIntBits(other.costo)) {
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
     * Metodo toString que permite generar una string con todos los atributos de
     * la clase.
     *
     * @return una string con todos los atributos
     */
    @Override
    public String toString() {
        return "Reportes{" + "nombreCompleto=" + nombreCompleto
                + ", tipoTramite=" + tipoTramite + ", fechaExpedicion="
                + fechaExpedicion + ", costo=" + costo + '}';
    }

}
