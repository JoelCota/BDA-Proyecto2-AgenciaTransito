package Dominio;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;

/**
 *
 * Clase de dominio "Transporte" la cual hereda de tramite y se encarga de
 * gestionar todos los atributos pertenecientes a dicha clase
 *
 * @author Joel Antonio Lopez Cota ID:228926 y David de Jesus Sotelo Palafox
 * ID:229384
 */
@Entity
@DiscriminatorColumn(name = "tipoTransporte")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Transporte implements Serializable {
    /**
     * Es el identificador del transporte
     */
    @Id
    @Column(name = "numSerie", nullable = false, length = 7)
    private String numSerie;
    /**
     * Es el modelo del transporte
     */
    @Column(name = "modelo", nullable = false, length = 20)
    private String modelo;
    /**
     * Es la linea del transporte
     */
    @Column(name = "linea", nullable = false, length = 20)
    private String linea;
    /**
     * Es la marca del transporte
     */
    @Column(name = "marca", nullable = false, length = 20)
    private String marca;
    /**
     * Es el color del transporte
     */
    @Column(name = "color", nullable = false, length = 20)
    private String color;
    /**
     * Es la lista de placas que tiene el transporte
     */
    @OneToMany(mappedBy = "transporte")
    private List<Placa> listaPlacas;

    /**
     * Constructor por defecto.
     */
    public Transporte() {
    }

    /**
     * Consutructor de lka clase con todos sus atributos incluido la lista de
     * placas.
     *
     * @param numSerie Numero de serie
     * @param modelo Modelo del vehiculo
     * @param linea Linea del vehiculo
     * @param marca Marca del vehiculo
     * @param color Color del vehiculo
     * @param listaPlacas Placas del vehiculo
     */
    public Transporte(String numSerie, String modelo, String linea,
            String marca, String color, List<Placa> listaPlacas) {
        this.numSerie = numSerie;
        this.modelo = modelo;
        this.linea = linea;
        this.marca = marca;
        this.color = color;
        this.listaPlacas = listaPlacas;
    }

    /**
     *
     * Consutructor de lka clase con todos sus atributos con excepcion de la
     * lista de placas.
     *
     * @param numSerie Numero de serie
     * @param modelo Modelo del vehiculo
     * @param linea Linea del vehiculo
     * @param marca Marca del vehiculo
     * @param color Color del vehiculo
     */
    public Transporte(String numSerie, String modelo, String linea,
            String marca, String color) {
        this.numSerie = numSerie;
        this.modelo = modelo;
        this.linea = linea;
        this.marca = marca;
        this.color = color;
    }

    /**
     * Constructor por numero de serie
     *
     * @param numSerie el numero de serie del transporte
     */
    public Transporte(String numSerie) {
        this.numSerie = numSerie;
    }

    /**
     * Metodo para obtener el numero de serie.
     *
     * @return el numero de serie del transporte
     */
    public String getNumSerie() {
        return numSerie;
    }

    /**
     * Metodo para setear el numero de serie.
     *
     * @param numSerie es el numero de serie a setear
     */
    public void setNumSerie(String numSerie) {
        this.numSerie = numSerie;
    }

    /**
     * Metodo para obtener el modelo del transporte.
     *
     * @return el modelo del transporte
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Metodo para setear el modelo del transporte.
     *
     * @param modelo el modelo del transporte
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * Metodo para obtener la linea del transporte.
     *
     * @return la linea del transporte
     */
    public String getLinea() {
        return linea;
    }

    /**
     * Metodo para setear la licencia del transporte.
     *
     * @param linea es la linea del transporte
     */
    public void setLinea(String linea) {
        this.linea = linea;
    }

    /**
     * Metodo para obtener la marca del transporte.
     *
     * @return la marca del transporte
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Metodo para la setear la marca del transporte.
     *
     * @param marca es la marca del transporte
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Metodo para obtener el color del transporte.
     *
     * @return el color del transporte
     */
    public String getColor() {
        return color;
    }

    /**
     * Metodo para setear el color del transporte.
     *
     * @param color es el color del transporte
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Metodo para obtener la lista de placas del transporte.
     *
     * @return Es la lista de placas las cuales pertenecen al transporte
     */
    public List<Placa> getListaPlacas() {
        return listaPlacas;
    }

    /**
     * Metodo para setear la lista de placas del transporte.
     *
     * @param listaPlacas es la lista de placas a setear
     */
    public void setListaPlacas(List<Placa> listaPlacas) {
        this.listaPlacas = listaPlacas;
    }

    /**
     * Metodo HashCode.
     *
     * @return el hash
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.numSerie);
        return hash;
    }

    /**
     * Metodo que permite conocer si un objeto es igual que otro.
     *
     * @param obj el objeto a comparar
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
        final Transporte other = (Transporte) obj;
        return Objects.equals(this.numSerie, other.numSerie);
    }

    /**
     * Metodo toString que regresa una string con todos los atributos.
     *
     * @return una string con todos los atributos
     */
    @Override
    public String toString() {
        return "Transporte{" + "numSerie=" + numSerie + ", modelo="
                + modelo + ", linea=" + linea + ", marca=" + marca + ", color="
                + color + ", listaPlacas=" + listaPlacas + '}';
    }

}
