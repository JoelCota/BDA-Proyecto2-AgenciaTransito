/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;

/**
 *
 * Clase de dominio "Transporte". La cual se encarga de crear todos los
 * atributos existentes en la base de datos y aqui mismo se mapean para luego
 * pasar los datos a la base de datos, tambien aqui estan todos los
 * constructores, gets y sets, hash y el toString de la clase
 *
 * @author Joel Antonio Lopez Cota ID:228926 y David de Jesus Sotelo Palafox
 * ID:229384
 */
@Entity
@DiscriminatorColumn(name = "tipoTransporte")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Transporte implements Serializable {

    @Id 
    @Column(name = "numSerie", nullable = false, length = 7)
    private String numSerie;
    @Column(name = "modelo", nullable = false, length = 20)
    private String modelo;
    @Column(name = "linea", nullable = false, length = 20)
    private String linea;
    @Column(name = "marca", nullable = false, length = 20)
    private String marca;
    @Column(name = "color", nullable = false, length = 20)
    private String color;
    @OneToMany(mappedBy = "transporte")
    private List<Placa> listaPlacas;

    /**
     * Consutrcotr por default
     */
    public Transporte() {
    }

    /**
     * Consutructor de lka clase con todos sus atributos incluido la lista de placas.
     * @param numSerie Numero de serie
     * @param modelo Modelo del vehiculo
     * @param linea Linea del vehiculo
     * @param marca Marca del vehiculo
     * @param color Color del vehiculo
     * @param listaPlacas Placas del vehiculo
     */
    public Transporte(String numSerie, String modelo, String linea, String marca, String color, List<Placa> listaPlacas) {
        this.numSerie = numSerie;
        this.modelo = modelo;
        this.linea = linea;
        this.marca = marca;
        this.color = color;
        this.listaPlacas = listaPlacas;
    }

    /**
     * 
     * Consutructor de lka clase con todos sus atributos con excepcion de la lista de placas.
     * @param numSerie Numero de serie
     * @param modelo Modelo del vehiculo
     * @param linea Linea del vehiculo
     * @param marca Marca del vehiculo
     * @param color Color del vehiculo
     */
    public Transporte(String numSerie, String modelo, String linea, String marca, String color) {
        this.numSerie = numSerie;
        this.modelo = modelo;
        this.linea = linea;
        this.marca = marca;
        this.color = color;
    }

    /**
     * 
     * Constructor por puro numero de serie
     * @param numSerie 
     */
    public Transporte(String numSerie) {
        this.numSerie = numSerie;
    }

    
    
    /**
     * 
     * Metodo para obtener el numero de serie.
     * @return 
     */
    public String getNumSerie() {
        return numSerie;
    }

    /**
     * \
     * Metodo para setear el numero de serie
     * @param numSerie 
     */
    public void setNumSerie(String numSerie) {
        this.numSerie = numSerie;
    }

    /**
     * Metodo para obtener el modelo
     * @return 
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Metodo para setear el modelo.
     * @param modelo Modelo
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * Metodo para obtener la linea
     * @return Linea
     */
    public String getLinea() {
        return linea;
    }

    /**
     * Metodo para setear la licencia.
     * @param linea Linea
     */
    public void setLinea(String linea) {
        this.linea = linea;
    }

    public String getMarca() {
        return marca;
    }

    /**
     * Metodo para la setear la marca del vehiculo
     * @param marca marca 
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Metodo para obtener el color del vehiculo
     * @return color
     */
    public String getColor() {
        return color;
    }

    /**
     * Metodo para setear el color del vehiculo
     * @param color 
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Metodo para obtener la lista de placas del vehiculo
     * @return Lista de placas
     */
    public List<Placa> getListaPlacas() {
        return listaPlacas;
    }

    /**
     * Metodo para setear la lista de placas del vehiculo
     * @param listaPlacas lista de placas
     */
    public void setListaPlacas(List<Placa> listaPlacas) {
        this.listaPlacas = listaPlacas;
    }

    /**
     * Metodo HashCode
     * @return 
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.numSerie);
        return hash;
    }

    /**
     * Metodo para el equals
     * @param obj objeto
     * @return  si es o no igual
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

    @Override
    public String toString() {
        return "Transporte{" + "numSerie=" + numSerie + ", modelo=" + modelo + ", linea=" + linea + ", marca=" + marca + ", color=" + color + ", listaPlacas=" + listaPlacas + '}';
    }

    
}
