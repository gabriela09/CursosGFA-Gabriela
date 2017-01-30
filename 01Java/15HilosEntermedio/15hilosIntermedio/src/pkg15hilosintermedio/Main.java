/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg15hilosintermedio;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author ga.gutierrez
 */
public class Main {

    /**
     * @param args the command line arguments
     */
     static   List<Autobus> autobuses = Arrays.asList(
         new Autobus(1, "ON", "MEX", new int[]{10,30,50}),
         new Autobus(2, "GTO", "PTO", new int[]{1,3,5}),
         new Autobus(3, "ZAC", "MEX", new int[]{4,2,1})
       );
     
    public static void main(String[] args) {
        // TODO code application logic here
        int terminales =2;
          long  tiempo = System.currentTimeMillis();
          ExecutorService ejecutor = Executors.newFixedThreadPool(terminales);
               
        autobuses.forEach(autobus->{
        
            Runnable terminal = new Terminal (autobus,tiempo);
            ejecutor.execute(terminal);
        
        
        });
        
        ejecutor.shutdown();
       while (!ejecutor.isTerminated()){
          
       }  
       
        System.out.println("Proceso terminado");
    }
    
}
