/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;
import Dominio.Licencia;
import excepciones.PersistenciaException;
/**
 *
 * @author deivi
 */
public interface ILicenciaDAO {
    
    public void AgregarLicencia(Licencia licencia) throws PersistenciaException;
    public void ActualizarLicencia(Licencia licencia) throws PersistenciaException;
    
}
