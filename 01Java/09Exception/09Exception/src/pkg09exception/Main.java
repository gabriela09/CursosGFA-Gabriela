/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg09exception;

import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ac.barrios
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
            String nombre = "Cristina";
            ArrayList<String> a = null;
            try {
                a.add("d");
                int num = Integer.parseInt(nombre);
                System.out.println(args[1]);
            } catch (ArrayIndexOutOfBoundsException ex) {
                System.out.println("Posición del arreglo no válida");
            } catch (NumberFormatException ex) {
                System.out.println("Formato no válido");
            } catch (Exception ex) {  // execpcion general
                ex.printStackTrace();
                System.out.println("Excepcion general ");
            }
            
            System.out.println("Final");
            
            
            
            // excepcion de fecha
            
            Boleto b = new Boleto();
            Date d = new  Date("09/09/1990");
        
        try {
            b.setFecha(d);
                
        } catch (fechaInvalidaException ex) {
            ex.printStackTrace();
            System.out.println("Fecha invalida");
        }finally{
             System.out.println("Fecha finally");
         }
        
    
   
     
     
  }
}