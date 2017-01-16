/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lancha;

import com.sun.corba.se.spi.orb.Operation;
import pkg08ejercicio_modular.Operaciones;

/**
 *
 * @author ga.gutierrez
 */
public class Lancha extends vehiculo.Vehiculo implements Operaciones{
   private String tipoMadera;
   private  int numeroVelas;

    public String getTipoMadera() {
        return tipoMadera;
    }

    public void setTipoMadera(String tipoMadera) {
        this.tipoMadera = tipoMadera;
    }

    public int getNumeroVelas() {
        return numeroVelas;
    }

    public void setNumeroVelas(int numeroVelas) {
        this.numeroVelas = numeroVelas;
    }
   
   public void flotarLachar(){}
   
   public void alzarVelas(){}
   
   
   
    public Lancha(int cap, int numAsientos, int numLlantas,int idVehiculo,String tipoMadera, int numeroVelas) {
        super(cap, numAsientos, numLlantas, idVehiculo);
        this.numeroVelas =numeroVelas;
        this.tipoMadera=tipoMadera;
    }

    @Override
    public void mueveVehiculo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void frenaVehiculo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Operaciones Registra() {
      return this;
    }

    @Override
    public int ObtieneID() {
     return  getId_vehiculo();
    }
    
     public String toString(){
     return  " \n Vehiculo ID: " +getId_vehiculo() + " \n " +
              "Capacidad gas:" +getCapacidad_gas()  + " \n " +
              "Numero asientos:" +getNum_asientos() + " \n " +
              "Numero llantas:" +getNum_llantas() + " \n " +
              "Tipo de madera:" +getTipoMadera() + " \n " +
              "Numero de velas:" +getNumeroVelas() + " \n " ;
     }

    
}
