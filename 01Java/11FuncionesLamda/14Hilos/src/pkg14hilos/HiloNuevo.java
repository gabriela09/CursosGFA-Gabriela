/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg14hilos;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ga.gutierrez
 */
public class HiloNuevo  implements  Runnable{
    int id_hilo;
    
  public HiloNuevo(int id){
   this.id_hilo=id;
  }
    @Override
    public void run() {
        System.out.println("Comienza la ejecucion del hilo 3 seg" + id_hilo );
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
         System.out.println("Finalizo hilo  3 seg" + id_hilo );
        
    }
    
}
