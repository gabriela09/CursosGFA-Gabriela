package automovil;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ga.gutierrez
 */
public class automovil  extends vehiculo.Vehiculo{
   
    private int num_puertas;
    private int num_cilindros;
    private String reproductor_Sonido;

    public int getNum_puertas() {
        return num_puertas;
    }

    public void setNum_puertas(int num_puertas) {
        this.num_puertas = num_puertas;
    }

    public int getNum_cilindros() {
        return num_cilindros;
    }

    public void setNum_cilindros(int num_cilindros) {
        this.num_cilindros = num_cilindros;
    }

    public String getReproductor_Sonido() {
        return reproductor_Sonido;
    }

    public void setReproductor_Sonido(String reproductor_Sonido) {
        this.reproductor_Sonido = reproductor_Sonido;
    }
    
    public void estacionaAutomovil(){
        System.out.println("automovil.estacionaAutomovil()");
    }
    
    public void abreCajuela(){
        System.out.println("automovil.abreCajuela()");
    }
    
    public void automovil(){}
    
    
    public automovil(int cap, int numAsientos, int numLlantas,int idVehiculo ,int numPuertas,int numCilindros, String reproductorSonido ) {
        super(cap, numAsientos, numLlantas, idVehiculo);
        this.num_puertas = numPuertas;
        this.num_cilindros = numCilindros;
        this.reproductor_Sonido = reproductorSonido;
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
