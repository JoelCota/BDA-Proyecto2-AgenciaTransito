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
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;

/**
 * 
 * Clase de dominio "Transporte". La cual se encarga de crear todos los atributos
 * existentes en la base de datos y aqui mismo se mapean para luego pasar los
 * datos a la base de datos, tambien aqui estan todos los constructores, gets y sets,
 * hash y el toString de la clase
 * @author Joel Antonio Lopez Cota ID:228926 y David de Jesus Sotelo Palafox ID:229384
 */
@Entity
@DiscriminatorColumn (name = "tipoTransporte")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Transporte implements Serializable {

    //Atributos
    @Id
    @Column(name = "numSerie", nullable = false,length=7)
    private String numSerie;
    @Column(name = "modelo", nullable = false, length = 20)
    private String modelo;
    @Column(name = "linea", nullable = false, length = 20)
    private String linea;
    @Column(name = "marca", nullable = false, length = 20)
    private String marca;
    @Column(name = "color", nullable = false, length = 20)
    private String color;
   @OneToMany(mappedBy= "transporte",cascade=CascadeType.PERSIST)
    private List<Placa> listaPlacas;

   
    public String getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(String numSerie) {
        this.numSerie = numSerie;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getLinea() {
        return linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public List<Placa> getListaPlacas() {
        return listaPlacas;
    }

    public Transporte() {
    }

    public Transporte(String numSerie, String modelo, String linea, String marca, String color, List<Placa> listaPlacas) {
        this.numSerie = numSerie;
        this.modelo = modelo;
        this.linea = linea;
        this.marca = marca;
        this.color = color;
        this.listaPlacas = listaPlacas;
    }

    public Transporte(String numSerie, String modelo, String linea, String marca, String color) {
        this.numSerie = numSerie;
        this.modelo = modelo;
        this.linea = linea;
        this.marca = marca;
        this.color = color;
    }

    
    
    public void setListaPlacas(List<Placa> listaPlacas) {
        this.listaPlacas = listaPlacas;
    }
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.numSerie);
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
        final Transporte other = (Transporte) obj;
        return Objects.equals(this.numSerie, other.numSerie);
    }

}
