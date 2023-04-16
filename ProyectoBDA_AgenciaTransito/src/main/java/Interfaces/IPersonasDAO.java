package Interfaces;

import Dominio.Persona;
import excepciones.PersistenciaException;
import java.util.List;

/**
 * Interfaz para la clase de Persona, aqui se agregaron todos los metodos
 * incluidos en la clase PersonasDAO.
 *
 * @author Joel Antonio Lopez Cota ID:228926 y David de Jesus Sotelo Palafox
 * ID:229384
 */
public interface IPersonasDAO {

    /**
     * Metodo para agregar una nueva persona.
     *
     * @param persona Objeto de persona.
     * @throws PersistenciaException salta la excepcion si hay error de
     * persistencia.
     */
    public void agregarPersona(Persona persona) throws PersistenciaException;

    /**
     * Metodo para buscar una persona mediante su RFC.
     *
     * @param RFC String RFC
     * @return retorna el objeto de la persona
     * @throws PersistenciaException salta la excepcion si hay error de
     * persistencia.
     */
    public Persona buscarPersonaRFC(String RFC) throws PersistenciaException;

    /**
     * Metodo para crear las 20 personas hardcodeada.
     *
     * @throws PersistenciaException salta la excepcion si hay error de
     * persistencia.
     */
    public void invocarPersonas() throws PersistenciaException;

    /**
     * Metodo para consultar todas las personas existentes.
     *
     * @return una lista con todas las personas existentes
     * @throws PersistenciaException salta la excepcion si hay error de
     * persistencia.
     */
    public List<Persona> consultaPersonasTotal() throws PersistenciaException;

    /**
     * Metodo para consultar las personas por el nombre.
     *
     * @param nombre el nombre de la persona
     * @return una lista de las coincidencias del nombre
     */
    public List<Persona> buscarPersonasPorNombre(String nombre);

    /**
     * Metodo para consultar una lista de personas por año de nacimiento
     * @param anio es el año de nacimiento
     * @return la lista de las personas con el año de nacido igual
     */
    public List<Persona> buscarFecha(int anio);
}
