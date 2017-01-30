/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg15hilosintermedio;

/**
 *
 * @author ga.gutierrez
 */
public class Autobus {
    
     private int numeroAutobus;
    private String origen;
    private String destino;
    private int[] tiempos;
    
  public Autobus(int numeroAutobus, String origen, String destino, int[] tiempos) {
        this.numeroAutobus = numeroAutobus;
        this.origen = origen;
        this.destino = destino;
        this.tiempos = tiempos;
    }
  
    public int getNumeroAutobus() {
        return numeroAutobus;
    }

    public void setNumeroAutobus(int numeroAutobus) {
        this.numeroAutobus = numeroAutobus;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int[] getTiempos() {
        return tiempos;
    }

    public void setTiempos(int[] tiempos) {
        this.tiempos = tiempos;
    }
    
}
