/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;



/**
 *
 * @author ga.gutierrez
 */
public class Motocicleta extends Vehiculo {

    private int num_Parillas;

    public int getNum_Parillas() {
        return num_Parillas;
    }

    public void setNum_Parillas(int num_Parillas) {
        this.num_Parillas = num_Parillas;
    }

   
    public void ejecutaCaballito(){}
    
    
    public Motocicleta(int cap, int numAsientos, int numLlantas, int idVehiculo,String tipoVehiculo, int numParillas) {
        super(cap, numAsientos, numLlantas, idVehiculo, tipoVehiculo);
        this.num_Parillas = numParillas;
    }

    
    
    
    
    @Override
    public void mueveVehiculo() {
        System.out.println("motocicleta.Motocicleta.mueveVehiculo()");
    
    }

    @Override
    public void frenaVehiculo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
     public String toString(){
     return  " \n Vehiculo ID: " +getId_vehiculo() + " \n " +
              "Capacidad gas:" +getCapacidad_gas()  + " \n " +
              "Numero asientos:" +getNum_asientos() + " \n " +
              "Numero llantas:" +getNum_llantas() + " \n " +
              "Numero de parillas:" +num_Parillas + " \n " ;
             
     }
}
