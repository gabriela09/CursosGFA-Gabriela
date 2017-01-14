/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg08ejercicio_modular;

import automovil.automovil;
import java.util.Scanner;
import automovil.automovil;
import vehiculo.Vehiculo;

/**
 *
 * @author ga.gutierrez
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Elija la operacion 1.-Registra Vehiculo  2.-Elimina Vehiculo 3.-Buscar 4.- Consultar todo 5.-Salir");

        switch (Integer.parseInt(s.nextLine())) {
            case 1:
                System.out.println("Ingresa datos de vehiculo:");
                
                 System.out.println("Identificador ");
                int idVehiculo = Integer.parseInt(s.nextLine());
                
                System.out.println("Capacidad");
                int cap = Integer.parseInt(s.nextLine());
                
                System.out.println("Numero de asientos");
                int numAsientos = Integer.parseInt(s.nextLine());
                
                 System.out.println("Numero de llantas");
                int numLlantas = Integer.parseInt(s.nextLine());
                
              System.out.println("Elija tipo Vehiculo  1.-Automovil  2.-Avion 3.-Lancha  4.-Motocicleta");
                   
                switch (Integer.parseInt(s.nextLine())) {
                    case 1:
                        System.out.println("Número de puertas:");
                        int numPuertas = Integer.parseInt(s.nextLine());
                       
                        System.out.println("Número de cilindros:");
                        int numCilindros = Integer.parseInt(s.nextLine());
                       
                         System.out.println("Reproductor de sonido");
                         String reproductorSonido = s.nextLine();
                       
                        automovil a = new automovil(cap, numAsientos, numLlantas, idVehiculo, numPuertas, numCilindros, reproductorSonido);
                                //cap, Integer.parseInt(s.nextLine()), Integer.parseInt(s.nextLine()), Integer.parseInt(s.nextLine()), Integer.parseInt(s.nextLine()), Integer.parseInt(s.nextLine()), s.nextLine());
                        
                        System.out.println("" +a.getNum_cilindros() + a.getNum_puertas());
                        break;

                }

                break;
            case 2:
                // System.out.println("La media es:" + ope.media(array));
                break;
            case 3:
                // System.out.println("El numero mayor es " + ope.mayor(array));
                break;
        }
        
        
        

    }

}
