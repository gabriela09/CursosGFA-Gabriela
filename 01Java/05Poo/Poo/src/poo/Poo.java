/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import deportista.Boxeador;
import deportista.Deporte;
import deportista.futbolista;
import empleado.Desarollador;
import empleado.Operador;
import persona.Persona;

/**
 *
 * @author ga.gutierrez
 */
public class Poo {

    /**
     * @param args the command line arguments
     */
     public  static void pruebaInterfaz(Deporte d){
           d.entrenar();
        }   
        
      public  static void pruebaHerencia(Persona d){
           d.hablar();
        } 
      
      
    public static void main(String[] args) {
       
       
        // TODO code application logic here
        Persona p = new Persona("Gabriela gutierrez espinosa 20");
        p.setEdad(30);
        System.out.println("Nombre:" + p.getNombre() + "  ApellidoM: " + p.getApellidoM() + "  ApellidoP: " + p.getApellidoP() + " Edad:" + p.getEdad());

        Persona p2 = new Persona("Gabriela", "Gutierrez", "Espinosa", 20);
        System.out.println("Nombre:" + p2.getNombre() + " ApellidoM: " + p2.getApellidoM() + " ApellidoP: " + p2.getApellidoP() + " Edad:" + p2.getEdad());
        p2.hablar();
        p2.comer();

        futbolista f = new futbolista("Nacho", "Gonsalez", "Gutierrez", 30, "Defensa", 30);
        f.hablar();
        f.comer();
        System.out.println("Informacion  del objeto :" + f);  ///f.toString()
        System.out.println("Informacion  del objeto :" + p);  ///como no esta implementada la funcion tostring solo se imprime el Nombre objeto y la posicion 
        
        
        // implementacion de las clases abstracta 
        
        Desarollador d = new Desarollador("Lola", "Martinez", "Lopez", 26, 995903, 9000, "Java", 2016);
          d.trabajar();
          d.transporteTorta();
          
        Operador o = new  Operador("Juan", "Lopez", "Martinez", 40, 9940, 1000);
          o.trabajar();
          o.transporteTorta();
          
          
          // Implentacion 
          System.out.println("Interfaz ");
         Boxeador b = new Boxeador("Raul", "Marquez", "Espinosa", 20, "Pluma");
           b.entrenar();
           b.hablar();
        
          
             //Prueba de interfaz
           
           System.out.println("Nuevo contructor donde enviamos una clase a la interfaz");
            pruebaInterfaz(b);
      
            
            //Prueba contructor de hablar 
          System.out.println("Nuevo contructor donde enviamos una clase a la interfaz");
            pruebaHerencia(b);
      
            
    }

}
