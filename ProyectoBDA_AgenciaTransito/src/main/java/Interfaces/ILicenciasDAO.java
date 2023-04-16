package Interfaces;

import Dominio.Licencia;
import Dominio.Persona;
import excepciones.PersistenciaException;
import java.util.List;

/**
 * Interfaz para la clase de Licencias, aqui se agregaron todos los metodos
 * incluidos en la clase LicenciasDAO.
 *
 * @author Joel Antonio Lopez Cota ID:228926 y David de Jesus Sotelo Palafox
 * ID:229384
 */
public interface ILicenciasDAO {

    /**
     *
     * Metodo para agregar una licencia nueva.
     *
     * @param licencia objeto licencia.
     * @throws PersistenciaException salta la excepcion si hay error de
     * persistencia.
     */
    public void agregarLicencia(Licencia licencia) throws PersistenciaException;

    /**
     * Metodo para actualizar una licencia.
     *
     * @param licencia Objeto de licencia.
     * @throws PersistenciaException salta la excepcion si hay error de
     * persistencia.
     */
    public void actualizarLicencia(Licencia licencia)
            throws PersistenciaException;

    /**
     * Metood para buscar si la persona cuenta con una licencia.
     *
     * @param personaProspecto Es el objeto persona con el cual se va a buscar
     * @return la persona si cuenta con una licencia , null en caso contrario
     * @throws PersistenciaException salta la excepcion si hay error de
     * persistencia.
     */
    public Persona buscarLicenciaPersona(Persona personaProspecto)
            throws PersistenciaException;

    /**
     * Metodo que permite buscar todas las licencias de una persona.
     *
     * @param personaProspecto es la persona de la que se desean obtener todas
     * las licencias
     * @return la lista de licencias
     */
    public List<Licencia> listaLicencias(Persona personaProspecto);
}
