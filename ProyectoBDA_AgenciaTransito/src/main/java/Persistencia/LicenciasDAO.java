/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Dominio.Licencia;
import excepciones.PersistenciaException;
import javax.persistence.EntityManager;
import Interfaces.ILicenciasDAO;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author Joel Antonio Lopez Cota ID:228926 y David de Jesus Sotelo Palafox ID:229384
 */
public class LicenciasDAO implements ILicenciasDAO{
    ConexionBD conexion = new ConexionBD();

    @Override
    public void AgregarLicencia(Licencia licencia) throws PersistenciaException {
        EntityManager bd = conexion.obtenerConexion();
        
        try{
            bd.getTransaction().begin();//entre a la base de datos
            bd.persist(bd);
            bd.getTransaction().commit();//cerre conexion
            System.out.println("Se agrego exitosamente la licencia");
        }catch(Exception e){
            bd.getTransaction().rollback();
            throw new PersistenciaException("No se agrego la licencia" + e.getMessage());
        }
        finally{
            bd.close();
        }
    }

    @Override
    public void ActualizarLicencia(Licencia licencia) throws PersistenciaException {
        EntityManager bd = conexion.obtenerConexion();
        
        try {
            bd.getTransaction().begin();
            CriteriaBuilder builder = bd.getCriteriaBuilder();
            //Consultar Licencia
            CriteriaQuery consulta = builder.createQuery(Licencia.class);
            Root<Licencia> root = consulta.from(Licencia.class);
            consulta.select(root).where(builder.equal(root.get("id"),licencia.getId()));
            TypedQuery<Licencia> resultado = bd.createQuery(consulta);
            Licencia licenciaNew = resultado.getSingleResult();
            //Actualiza
            licenciaNew.setActiva(false);
            bd.merge(licenciaNew);//Se confirma el cambio a la base de datos.
            
            //mando lo datos a la base de datos
            bd.getTransaction().commit();
        }catch(Exception e){
           System.out.println("La licencia no se pudo actualizar "+e.getMessage());
        }finally{ 
            bd.close();
        }
    }
            
    
    
        
        
    
}
