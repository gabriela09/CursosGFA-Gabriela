/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculo;

/**
 *
 * @author ga.gutierrez
 */
public abstract class Vehiculo {
    
    private int capacidad_gas;
    private int num_asientos;
    private int num_llantas;
    private int id_vehiculo;

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
    
    
    public Vehiculo (int cap,int numAsientos, int numLlantas, int idVehiculo){
        this.capacidad_gas =cap;
        this.num_asientos = numAsientos;
        this.num_llantas=numLlantas;
        this.id_vehiculo=idVehiculo;
    
    }
    
    public abstract void mueveVehiculo();
    
    public abstract  void frenaVehiculo();
    
    
}
