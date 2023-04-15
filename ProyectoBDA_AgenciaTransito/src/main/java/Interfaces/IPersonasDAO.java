/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import Dominio.Persona;
import excepciones.PersistenciaException;
import java.util.List;
 
/**
 * Interfaz para la clase de Persona, aqui se agregaron todos los metodos incluidos
 * en la clase Persona DAO
 * @author Joel Antonio Lopez Cota ID:228926 y David de Jesus Sotelo Palafox ID:229384
 */
public interface IPersonasDAO {
    
    /**
     * 
     * Metodo para agregar una nueva persona.
     * @param persona Objeto de persona.
     * @throws PersistenciaException Excepciones(evita errores).
     */
    
    public void agregarPersona (Persona persona) throws PersistenciaException;
    
    /**
     * 
     * Metodo para buscar una persona mediante su RFC.
     * @param RFC String RFC
     * @return retorna el objeto de la persona
     * @throws PersistenciaException Excepciones(evita errores).
     */
    
    public Persona buscarPersonaRFC (String RFC) throws PersistenciaException;
    
    /**
     * 
     * Metodo para crear las 20 personas hardcodeada.
     * @throws PersistenciaException Excepciones(evita errores).
     */
    
    public void invocarPersonas() throws PersistenciaException;
    public List<Persona> consultaPersonasTotal() throws PersistenciaException;
}
