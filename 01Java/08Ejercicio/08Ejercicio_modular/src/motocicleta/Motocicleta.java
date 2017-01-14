/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package motocicleta;

/**
 *
 * @author ga.gutierrez
 */
public class Motocicleta extends vehiculo.Vehiculo{

    private int num_Parillas;

   
    public void ejecutaCaballito(){}
    
    
    public Motocicleta(int cap, int numAsientos, int numLlantas, int idVehiculo) {
        super(cap, numAsientos, numLlantas, idVehiculo);
    }

    
    
    
    
    @Override
    public void mueveVehiculo() {
        System.out.println("motocicleta.Motocicleta.mueveVehiculo()");
    
    }

    @Override
    public void frenaVehiculo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
