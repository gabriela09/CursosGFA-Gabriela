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
public class Avion  extends  Vehiculo {
    
    private int numeroAlas;
    private String tipoTimon;

    public int getNumeroAlas() {
        return numeroAlas;
    }

    public void setNumeroAlas(int numeroAlas) {
        this.numeroAlas = numeroAlas;
    }

    public String getTipoTimon() {
        return tipoTimon;
    }

    public void setTipoTimon(String tipoTimon) {
        this.tipoTimon = tipoTimon;
    }
    
    public void despligaAvion(){
    
    };
    
    public void  aterizaAvion(){
    };
    

    public Avion(int cap, int numAsientos, int numLlantas,int idVehiculo,String tipoVehiculo,int numeroAlas,String tipoTimon) {
        super(cap, numAsientos, numLlantas, idVehiculo,tipoVehiculo);
        this.numeroAlas=numeroAlas;
        this.tipoTimon=tipoTimon;
    }

    @Override
    public void mueveVehiculo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void frenaVehiculo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
     public String toString(){
     return  " \n Vehiculo ID: " +getId_vehiculo() + " \n " +
              "Capacidad gas:" + getCapacidad_gas()  + " \n " +
              "Numero asientos:" + getNum_asientos() + " \n " +
              "Numero llantas:" + getNum_llantas() + " \n " +
              "Numero Alas:" + getNumeroAlas() + " \n " +
              "Tipo de timon:" + getTipoTimon() + " \n " ;
     }
}
