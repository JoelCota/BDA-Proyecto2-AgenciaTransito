/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import Dominio.Placa;
import excepciones.PersistenciaException;

/**
 *
 * @author deivi
 */
public interface IPlacasDAO {
    public void generarPlaca(Placa placa)throws PersistenciaException;
    public void actualizar(Placa placa) throws PersistenciaException;
}
