/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10archivos;

import java.util.Scanner;

/**
 *
 * @author ea.salcedo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner s = new Scanner (System.in);
        Scanner s2 = new Scanner (System.in);
        
        System.out.println("Ingresa el código de Error:");
        int cError = s.nextInt();
        System.out.println("Ingresa la descripción de Error:");
        String descripcion= s2.nextLine();
        
        Error e1 = new Error(cError, descripcion);
        e1.escribir("C:\\Users\\ga.gutierrez\\Documents\\Curso Java\\CursosGFA-Gabriela\\01Java\\10Archivos\\10Archivos\\errores.txt");
        
        
        /// Interfaz 
        
        Error e= new Error();
        e.leer("C:\\Users\\ga.gutierrez\\Documents\\Curso Java\\CursosGFA-Gabriela\\01Java\\10Archivos\\10Archivos\\errores.txt", 1484418303691l);
        System.out.println(e);
        
        
        
    }
    
}
