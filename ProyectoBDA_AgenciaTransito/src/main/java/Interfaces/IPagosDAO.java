/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import Dominio.Pagos;
import excepciones.PersistenciaException;

/**
 *
 * @author deivi
 */
public interface IPagosDAO {
    public void agregar(Pagos pagos)throws PersistenciaException;
}
