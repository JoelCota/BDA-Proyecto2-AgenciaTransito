/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;
import Dominio.Licencia;
import Dominio.Persona;
import excepciones.PersistenciaException;
/**
 * Interfaz para la clase de Licencias, aqui se agregaron todos los metodos incluidos
 * en la clase Licencias DAO
 * @author Joel Antonio Lopez Cota ID:228926 y David de Jesus Sotelo Palafox ID:229384
 */
public interface ILicenciasDAO {
    
    /**
     * 
     * Metodo para agregar una licencia nueva.
     * @param licencia objeto licencia.
     * @throws PersistenciaException Excepciones(evita errores).
     */
    
    public void agregarLicencia(Licencia licencia) throws PersistenciaException;
    
    /**
     * Metodo para actualizar una licencia.
     * @param licencia Objeto de licencia.
     * @throws PersistenciaException Excepciones(evita errores).
     */
    
    public void actualizarLicencia(Licencia licencia) throws PersistenciaException;
     public Persona buscarLicenciaRFC(Persona personaProspecto) throws PersistenciaException;
}
