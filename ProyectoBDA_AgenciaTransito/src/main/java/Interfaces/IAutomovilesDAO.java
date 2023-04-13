/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import Dominio.Automovil;
import excepciones.PersistenciaException;

/**
 *
 * @author deivi
 */
public interface IAutomovilesDAO {
    public void agregar(Automovil automovil) throws PersistenciaException;
    public void actualizar(Automovil automovil) throws PersistenciaException;
}
