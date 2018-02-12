/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;
//import java.util.Scanner;
import javax.swing.JOptionPane;

import datos.*;
/**
 *
 * @author lab.informatica12
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       String nombre;
       int cedula, telefono, hora, valorHora;
        
        /*Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese nombre del Empleado:");
        nombre = (entrada.nextLine());
        System.out.print("Ingrese cedula:");
        cedula = Integer.parseInt(entrada.nextLine());
        System.out.print("Ingrese telefono:");
        telefono = Integer.parseInt(entrada.nextLine());
        System.out.print("Ingrese hora:");
        hora = Integer.parseInt(entrada.nextLine());
        System.out.print("Ingrese valor de la hora:");
        valorHora = Integer.parseInt(entrada.nextLine());
        entrada.close();        */
       
       try {
    	   nombre = JOptionPane.showInputDialog("Ingrese el nombre del empleado");
           cedula = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cedula:"));
           telefono = Integer.parseInt(JOptionPane.showInputDialog("Ingrese telefono"));
           hora = Integer.parseInt(JOptionPane.showInputDialog("Ingrese hora"));
           valorHora = Integer.parseInt(JOptionPane.showInputDialog("Ingrese valor de la hora"));
           
           Sueldo empleado1 = new Sueldo(nombre, cedula, telefono, hora, valorHora);
           
           System.out.print("Los datos del empleado son "
                   + "\nNombre: " + empleado1.getNombre() 
                   + "\nCedula: " + empleado1.getCedula()
                   + "\nTelefono: " + empleado1.getTelefono()
                   + "\nHora laborada: " + empleado1.getHora()
                   + "\nValor hora: " + empleado1.getValorHora()
                   + "\nTotal devengado: " + empleado1.getS()
           ); 
       }
       catch (NumberFormatException e){
    	   JOptionPane.showMessageDialog(null, "No puede ingresar textos. Debe ingresar un número.","Error",JOptionPane.WARNING_MESSAGE);
       }
        
        
        
       
    }
    
}
