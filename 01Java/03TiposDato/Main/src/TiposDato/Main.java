/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TiposDato;

/**
 *
 * @author ga.gutierrez
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean bandera= true;
        byte b = 127;
        short s= 27333;
        int entero = 1;
        float flotante = 1.9f;
        double d= 12.99;
        char c = 'C';
        long l = 1222222222222222222l;
        
        
        String cadena1= "";
        String cadena2="";
        String cadena3="";
        
        System.out.println(cadena1+ cadena2 );
        System.out.println(cadena1.length() +  "\r\n" +
                           cadena1.toLowerCase() +  "\r\n" +
                           cadena1.toUpperCase());
    }
    
}
