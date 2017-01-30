/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg15hilosintermedio;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ga.gutierrez
 */
public class Terminal  implements Runnable{
     private Autobus autobus;
     private long tiempoInicial;
   
    private static final String[] mensajes = {"Decenso","Espera","Acenso"};
   
   
     public Terminal(Autobus autobus, long tiempoInicial) {
        this.autobus = autobus;
        this.tiempoInicial = tiempoInicial;
    }

    public Autobus getAutobus() {
        return autobus;
    }

    public void setAutobus(Autobus autobus) {
        this.autobus = autobus;
    }

    public long getTiempoInicial() {
        return tiempoInicial;
    }

    public void setTiempoInicial(long tiempoInicial) {
        this.tiempoInicial = tiempoInicial;
    }

    @Override
    public void run() {
   System.out.println("Autobus con el numero: " + autobus.getNumeroAutobus() + " se comenzo en el tiempo  " + ((System.currentTimeMillis() - tiempoInicial) / 1000));
        
        for(int i=0; i< autobus.getTiempos().length;i++)
        {
            esperarSegundos(autobus.getTiempos()[i]);
            System.out.println(mensajes[i] +" : " + autobus.getNumeroAutobus() +"  tiempo : "+((System.currentTimeMillis()-tiempoInicial)/1000));
        }
        
        System.out.println("El autobus  " + autobus.getNumeroAutobus() +"  partio de su destino" + autobus.getDestino()+ " - " + autobus.getOrigen());
    
    
    }
    
      private void esperarSegundos(int seg)
    {
       try {
           Thread.sleep(seg*1000);
       } catch (InterruptedException ex) {
           Logger.getLogger(Terminal.class.getName()).log(Level.SEVERE, null, ex);
       }
    }
    
}
