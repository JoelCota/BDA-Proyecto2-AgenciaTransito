/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;
import Dominio.Licencia;
import excepciones.PersistenciaException;
/**
 * Interfaz para la clase de Licencias, aqui se agregaron todos los metodos incluidos
 * en la clase Licencias DAO
 * @author Joel Antonio Lopez Cota ID:228926 y David de Jesus Sotelo Palafox ID:229384
 */
public interface ILicenciasDAO {
    
    public void agregarLicencia(Licencia licencia) throws PersistenciaException;
    public void actualizarLicencia(Licencia licencia) throws PersistenciaException;
    
}
