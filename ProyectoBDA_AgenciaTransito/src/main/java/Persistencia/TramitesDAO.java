/**
 * TramitesDAO.java
 * Apr 13, 2023 2:30:50 AM
 */
package Persistencia;

import Dominio.Licencia;
import Dominio.Persona;
import Dominio.Placa;
import Interfaces.ITramitesDAO;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

/**
 * Clase DAO donde se hacen todos las consultas que tienen que ver con la tabla de
 * "Tramites" para la base de datos.
 * @author Joel Antonio Lopez Cota ID:228926 y David de Jesus Sotelo Palafox ID:229384
 */
public class TramitesDAO implements ITramitesDAO {

    ConexionBD conexion = new ConexionBD();

    /**
     *
     */
    public TramitesDAO() {

    }

     

}
