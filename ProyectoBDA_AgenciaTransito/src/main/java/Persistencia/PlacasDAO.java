/**
* PlacasDAO.java
* Apr 12, 2023 12:25:47 AM
*/ 

package Persistencia;
//importanciones

import Dominio.Licencia;
import Dominio.Placa;
import Interfaces.IPlacasDAO;
import excepciones.PersistenciaException;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * 
 * @author deivi
 */
public class PlacasDAO implements IPlacasDAO {
ConexionBD conexion = new ConexionBD();
    /**
     * 
     */
    public PlacasDAO(){

    }

    @Override
    public void generarPlaca(Placa placa) throws PersistenciaException {
        EntityManager bd = conexion.obtenerConexion();

        try {
            bd.getTransaction().begin();//entre a la base de datos
            bd.persist(placa);
            bd.getTransaction().commit();//cerre conexion
        } catch (Exception e) {
            bd.getTransaction().rollback();
            throw new PersistenciaException("No se puedo guardar la persona." + e.getMessage());
        } finally {
            bd.close();
        }
    }

    @Override
    public void actualizar(Placa placa) throws PersistenciaException {
        EntityManager bd = conexion.obtenerConexion();
        
        try {
            bd.getTransaction().begin();
            CriteriaBuilder builder = bd.getCriteriaBuilder();
            //Consultar Licencia
            CriteriaQuery consulta = builder.createQuery(Licencia.class);
            Root<Placa> root = consulta.from(Placa.class);
            consulta.select(root).where(builder.equal(root.get("id"),placa.getId()));
            TypedQuery<Placa> resultado = bd.createQuery(consulta);
            Placa placaNew = resultado.getSingleResult();
            //Actualiza
            placaNew.setActivo(false);
            bd.merge(placaNew);//Se confirma el cambio a la base de datos.
            
            //mando lo datos a la base de datos
            bd.getTransaction().commit();
        }catch(Exception e){
           System.out.println("La placa no se pudo actualizar "+e.getMessage());
        }finally{ 
            bd.close();
        }

    }

    
}
