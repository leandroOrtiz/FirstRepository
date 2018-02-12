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
public class Sueldo extends Empleado{
    
    private int hora, valorHora, s;
     
    public Sueldo(String nombre, int cedula, int telefono, int hora, int valorHora){
        super(nombre, cedula, telefono);
        this.hora = hora;
        this.valorHora = valorHora;
    }
    
    public int getHora(){
        return hora;
    }
    
    public int getValorHora(){
        return valorHora;
    }
    
    public int getS(){
        s = hora * valorHora;
        return s;
    }
    
}
