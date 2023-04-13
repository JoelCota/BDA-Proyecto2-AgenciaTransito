/**
* TramitesDAO.java
* Apr 13, 2023 2:30:50 AM
*/ 

package Persistencia;

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
 * 
 * @author Joel Antonio Lopez Cota ID:228926
 */
public class TramitesDAO implements ITramitesDAO{
ConexionBD conexion = new ConexionBD();

    /**
     * 
     */
    public TramitesDAO(){

    }
}
