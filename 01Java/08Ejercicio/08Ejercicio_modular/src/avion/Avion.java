/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avion;

/**
 *
 * @author ga.gutierrez
 */
public class Avion  extends  vehiculo.Vehiculo{
    
    private int numeroAlas;
    private String tipoTimon;
    
    public void despligaAvion(){
    
    };
    
    public void  aterizaAvion(){
    };
    

    public Avion(int cap, int numAsientos, int numLlantas,int idVehiculo) {
        super(cap, numAsientos, numLlantas, idVehiculo);
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
    
}
