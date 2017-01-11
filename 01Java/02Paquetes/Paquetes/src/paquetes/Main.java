/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetes;

import java.util.Scanner;
import matematicas.Matematicas;

/**
 *
 * @author ga.gutierrez
 */
public class Main {

    /**
     * float a,b;
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float c, b;
        Matematicas a = new Matematicas();
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Ingresa numero");
        c = lector.nextFloat();
        
        System.out.println("Ingresa numero");
        b = lector.nextFloat();
        
        System.out.println("Suma:" + a.suma(c, b) + "\r\n"
                + "Resta" + a.resta(c, b) + "\r\n"
                + "Multiplicar" + a.multiplicacion(c, b) + "\r\n"
                + "Division " + a.division(c, b)
        );
        
       System.out.println(""+ Matematicas.suma(1, 2));
 
        
    }
    
}
