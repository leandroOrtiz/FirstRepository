/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

/**
 *
 * @author lab.informatica12
 */
public class Empleado {
    
    private String nombre;
    private int cedula, telefono;
    
    public Empleado(String nombre, int cedula, int telefono){
        
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
        
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public int getCedula(){
        return cedula;
    }
    
    public int getTelefono(){
        return telefono;
    }
   
    
    
}
