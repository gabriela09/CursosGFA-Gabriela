/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclos;

import java.util.Scanner;

/**
 *
 * @author ga.gutierrez
 */
public class Ciclos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String[] array = new String[5];
        String cad ="";

        Scanner s = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese nombre");
            array[i] = s.nextLine();
        }

        for (int i = 0; i < array.length; i++) {
            cad = cad + array[i];
            System.out.println(array[i]);
        };

        System.out.println(cad);
        
        
        /// Define el arreglo
        
        
        

    }

}
