/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import Dominio.Pagos;
import excepciones.PersistenciaException;

/**
 * Interfaz para la clase de Pagos, aqui se agregaron todos los metodos incluidos
 * en la clase pagos DAO
 * @author Joel Antonio Lopez Cota ID:228926 y David de Jesus Sotelo Palafox ID:229384
 */
public interface IPagosDAO {
    public void agregar(Pagos pagos)throws PersistenciaException;
}
