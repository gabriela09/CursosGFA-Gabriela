/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lancha;

/**
 *
 * @author ga.gutierrez
 */
public class Lancha extends vehiculo.Vehiculo {
   private String tipoMadera;
   private  int numeroVelas;
   
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

    
}
