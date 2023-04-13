/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import Dominio.Persona;
import Dominio.Placa;
import excepciones.PersistenciaException;

/**
 * Interfaz para la clase de Placas, aqui se agregaron todos los metodos incluidos
 * en la clase Placas DAO
 * @author Joel Antonio Lopez Cota ID:228926 y David de Jesus Sotelo Palafox ID:229384
 */
public interface IPlacasDAO {
    public void generarPlaca(Placa placa)throws PersistenciaException;
    public void actualizar(Placa placa,Persona persona) throws PersistenciaException;
}
