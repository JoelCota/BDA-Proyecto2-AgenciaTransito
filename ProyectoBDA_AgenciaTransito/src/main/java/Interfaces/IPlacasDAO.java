/**
 * IPlacasDAO.java
 * Apr 13, 2023 5:54:54 PM
 */
package Interfaces;

import Dominio.Persona;
import Dominio.Placa;
import excepciones.PersistenciaException;
import java.util.List;

/**
 * Interfaz para la clase de placas, aqui se agregaron todos los metodos
 * incluidos en la clase PlacasDAO.
 *
 * @author Joel Antonio Lopez Cota ID:228926
 */
public interface IPlacasDAO {

    /**
     * Metodo para generar las placas nuevas.
     *
     * @param placa la placa que se se desea insertar
     * @throws PersistenciaException salta la excepcion si hay error de
     * persistencia.
     */
    public void generarPlaca(Placa placa) throws PersistenciaException;

    /**
     * Metodo para actualizar las placas.
     *
     * @param placa es la placa que se desea actualizar
     * @throws PersistenciaException salta la excepcion si hay error de
     * persistencia.
     */
    public void actualizar(Placa placa) throws PersistenciaException;

    /**
     * Metodo para conocer si hay una persona la cual cuenta con una placa
     * activa del mismo carro.
     *
     * @param serie es la serie de la placa
     * @return la placa que cuenta que esta activa
     * @throws PersistenciaException salta la excepcion si hay error de
     * persistencia.
     */
    public Placa buscarPersonaSerie(String serie) throws PersistenciaException;

    /**
     * Metodo para buscar todas las placas de una persona.
     *
     * @param personaProspecto es la persona a la cual pertenecen las placas.
     * @return la lista de las placas que pertenecen a la persona del parametro.
     */
    public List<Placa> listaPlacas(Persona personaProspecto);

    /**
     * Metodo para buscar todas las placas existentes.
     *
     * @return la lista de todas las placas existentes.
     */
    public List<Placa> listaPlacas();
}
