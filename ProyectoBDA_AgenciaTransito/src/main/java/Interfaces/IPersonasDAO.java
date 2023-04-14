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
    public void agregarPersona (Persona persona) throws PersistenciaException;
    public Persona buscarPersonaRFC (String RFC) throws PersistenciaException;
    public void invocarPersonas() throws PersistenciaException;
    public List<Persona> consultaPersonasTotal() throws PersistenciaException;
}
