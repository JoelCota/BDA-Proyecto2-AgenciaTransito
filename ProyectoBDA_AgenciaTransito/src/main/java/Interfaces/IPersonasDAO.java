/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import Dominio.Persona;
import excepciones.PersistenciaException;
import java.util.List;

/**
 *
 * @author deivi
 */
public interface IPersonasDAO {
    public void agregarPersona (Persona persona) throws PersistenciaException;
    public Persona buscarPersonaRFC (String RFC) throws PersistenciaException;
    public void invocarPersonas() throws PersistenciaException;
    public void eliminarPersonas() throws PersistenciaException;
    public List<Persona> consultaPersonasTotal() throws PersistenciaException;
}
