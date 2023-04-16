/**
 * TramitesDAO.java
 * Apr 15, 2023 7:32:06 PM
 */
package Interfaces;

import Dominio.Tramite;
import java.util.Date;
import java.util.List;

/**
 * Interfaz para la clase de tramites, aqui se agregaron todos los metodos
 * incluidos en la clase TramitesDAO.
 *
 * @author Joel Antonio Lopez Cota ID:228926
 */
public interface ITramitesDAO {

    /**
     * Metodo para consultar todos los tramites por nombre de usuario similar.
     *
     * @param nombre es el nombre del cliente
     * @return la lista de tramites de todos los usuarios con nombre similar
     */
    public List<Tramite> consultaListaTramitesNombre(String nombre);

    /**
     * Metodo para consultar todos los tramites por periodo de tiempo.
     *
     * @param fechaInicio es la fecha de inicio del periodo
     * @param fechaFin es la fecha de fin del periodo
     * @return la lista de tramites de todos los usuarios que tienen un tramite
     * realizado durante el periodo
     */
    public List<Tramite> consultarListaTramitesPorFechas(Date fechaInicio,
            Date fechaFin);

    /**
     * Metodo para consultar todos los tramites realizados.
     *
     * @return todos los tramites realizados
     */
    public List<Tramite> consultaListaTramites();
}
