/**
* IPlacasDAO.java
* Apr 13, 2023 5:54:54 PM
*/ 

package Interfaces;

import Dominio.Persona;
import Dominio.Placa;
import excepciones.PersistenciaException;

/**
 * Descripción de la interface: 
 *
 * @author Joel Antonio Lopez Cota ID:228926
 */
public interface IPlacasDAO {
    public void generarPlaca(Placa placa)throws PersistenciaException;
    public void actualizar(Placa placa) throws PersistenciaException;
}
