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
public abstract class Vehiculo {
    
    private int capacidad_gas;
    private int num_asientos;
    private int num_llantas;
    private int id_vehiculo;
    private String tipoVehiculo;

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public int getCapacidad_gas() {
        return capacidad_gas;
    }

    public void setCapacidad_gas(int capacidad_gas) {
        this.capacidad_gas = capacidad_gas;
    }

    public int getNum_asientos() {
        return num_asientos;
    }

    public void setNum_asientos(int num_asientos) {
        this.num_asientos = num_asientos;
    }

    public int getNum_llantas() {
        return num_llantas;
    }

    public void setNum_llantas(int num_llantas) {
        this.num_llantas = num_llantas;
    }

    public int getId_vehiculo() {
        return id_vehiculo;
    }

    public void setId_vehiculo(int id_vehiculo) {
        this.id_vehiculo = id_vehiculo;
    }
    
    
    public Vehiculo (int cap,int numAsientos, int numLlantas, int idVehiculo, String tipoVehiculo){
        this.capacidad_gas =cap;
        this.num_asientos = numAsientos;
        this.num_llantas=numLlantas;
        this.id_vehiculo=idVehiculo;
        this.tipoVehiculo= tipoVehiculo;
    
    }
    
  public String toString(){
    return  " \n Vehiculo ID: " +getId_vehiculo() + " \n " +
              "Capacidad gas:" + getCapacidad_gas()  + " \n " +
              "Numero asientos:" + getNum_asientos() + " \n " +
              "Numero llantas:" + getNum_llantas() + " \n " +
              "Tipo Vehiculo:" + getTipoVehiculo()+ " \n " ;
            
      
   }
  
  public String  imprimir(Vehiculo vh){
    String cad =   "Indentificador Vehiculo :</td><td> " + vh.getId_vehiculo() + "</td></tr>" +
                   "<h1><tr><td>Tipo:</td><td> " + vh.getTipoVehiculo() + "</td></tr></h1>" +
                   "<h1><tr><td>Numero Asientos:</td><td> " + vh.getNum_asientos() + "</td></tr></h1>"+
                   "<h1><tr><td>Numero de llantas:</td><td> " + vh.getNum_llantas() + "</td></tr></h1>"+
                   "<h1><tr><td>Capacidad Gas:</td><td> " + vh.getCapacidad_gas() + "</td></tr></h1>";
           
     return cad;
  
  };
    
    public abstract void mueveVehiculo();
    
    public abstract  void frenaVehiculo();
    
    
}
