/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import Dominio.Automovil;
import excepciones.PersistenciaException;

/**
 * Interfaz para la clase de Autmoviles, aqui se agregaron todos los metodos
 * incluidos en la clase automovil DAO
 *
 * @author Joel Antonio Lopez Cota ID:228926 y David de Jesus Sotelo Palafox
 * ID:229384
 */
public interface IAutomovilesDAO {

    /**
     * Metodo para agregar un autmovil.
     *
     * @param automovil objeto automovil.
     * @throws PersistenciaException Excepciones(evita errores).
     */
    public void agregar(Automovil automovil) throws PersistenciaException;

    /**
     *
     * Metodo para consultar el automovil
     *
     * @param numSerie es el numero de la serie del auto
     * @return el automovil que cuenta con el parametro de la serie
     * @throws PersistenciaException
     */
    public Automovil consultarAutomovil(String numSerie) throws PersistenciaException;
;

}
