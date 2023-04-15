/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Dominio;

/**
 * Clase de dominio de tipo enum en la cual se guardan todos los tipos de licencias
 * existentes en el sistema.
 * @author Joel Antonio Lopez Cota ID:228926 y David de Jesus Sotelo Palafox ID:229384
 */
public enum tipoLicencia {
    NORMAL,DISCAPACITADO;
    
    @Override    
    public String toString() {
        return "tipoLicencia{" + '}';
    }

    /**
     * Metodo para obtener el tipo
     * @return 
     */
    
    public static tipoLicencia getNORMAL() {
        return NORMAL;
    }

    /**
     * metodo para obtener el tipo
     * @return 
     */
    
    public static tipoLicencia getDISCAPACITADO() {
        return DISCAPACITADO;
    }
    
    
}
