/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg14hilos;

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
       /* HiloNuevo h = new HiloNuevo(1);
        h.run();*/
        
        for (int i=0; i<5 ;i++){
            HiloNuevo hilo = new HiloNuevo(i+1);
             //hilo.run();  //Ejecucion de hilos controlado 
             
            // hilos  
             Thread t = new Thread(hilo);
             t.start();
             
         } 
        
    }
    
}
