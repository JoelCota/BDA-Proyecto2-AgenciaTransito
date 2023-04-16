package Interfaces;

import Dominio.Automovil;
import excepciones.PersistenciaException;

/**
 * Interfaz para la clase de Autmoviles, aqui se agregaron todos los metodos
 * incluidos en la clase AutomovilesDAO.
 *
 * @author Joel Antonio Lopez Cota ID:228926 y David de Jesus Sotelo Palafox
 * ID:229384
 */
public interface IAutomovilesDAO {

    /**
     * Metodo para agregar un autmovil.
     *
     * @param automovil el automovil a agregar.
     * @throws PersistenciaException salta la excepcion si hay error de
     * persistencia.
     */
    public void agregar(Automovil automovil) throws PersistenciaException;

    /**
     * Metodo para consultar el automovil.
     *
     * @param numSerie es el numero de la serie del automovil.
     * @return el automovil que cuenta con el parametro de la serie, null en
     * caso de no encontrar nada
     * @throws PersistenciaException salta la excepcion si hay error de
     * persistencia.
     */
    public Automovil consultarAutomovil(String numSerie) throws
            PersistenciaException;
;

}
