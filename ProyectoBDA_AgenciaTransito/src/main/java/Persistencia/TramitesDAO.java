/**
* TramitesDAO.java
* Apr 13, 2023 2:30:50 AM
*/ 

package Persistencia;

//Imports
import Dominio.Placa;
import Dominio.Tramite;
import Interfaces.ITramitesDAO;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * Clase DAO donde se hacen todos las consultas que tienen que ver con la tabla de
 * "Tramites" para la base de datos.
 * @author Joel Antonio Lopez Cota ID:228926 y David de Jesus Sotelo Palafox ID:229384
 */
public class TramitesDAO implements ITramitesDAO{
    //Conexion a la base de datos.
    ConexionBD conexion = new ConexionBD();

    
}
