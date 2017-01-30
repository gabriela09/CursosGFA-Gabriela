/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto29;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

/**
 *
 * @author ga.gutierrez
 */
public class Reto29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, IOException {
        // TODO code application logic here
        
        String url ="C:\\Users\\ga.gutierrez\\Documents\\Curso Java\\ArchivoReto.txt";
        FileOutputStream fo = new FileOutputStream(url, true);
        OutputStreamWriter os = new OutputStreamWriter(fo, "UTF-8");
        BufferedWriter bw = new BufferedWriter(os); // Hasta cerrar  el archivo se graba en el archivo 
         
         Scanner s = new Scanner (System.in);
         System.out.println("Ingresa texto:");
         String cad = s.nextLine() + "r\n";
        
        
            bw.write(cad);
            bw.close(); // Hasta cerrar  el archivo se graba en el archivo 

       //Leer archivo 
       System.out.println( "Lectura de archivo:"); 
       
        FileReader fl = new FileReader(url); // 
        BufferedReader rd = new BufferedReader(fl); 
        String linea;
        
        while((linea =rd.readLine()) !=null){
           System.out.println( linea); 
       
        }
        
        
            
    }
    
}
