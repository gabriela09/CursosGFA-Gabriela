/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deportista;

import persona.Persona;

/**
 *
 * @author ga.gutierrez
 */
public class futbolista extends  Persona implements Deporte{
    private String posicion;
    private int dorsal;

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(short dorsal) {
        this.dorsal = dorsal;
    }
    
    public futbolista(String nombre,String apellidoM,String apellidoP,int edad,String posicion,int dorsal){
       super(nombre, apellidoM, apellidoP, edad);
        this.posicion = posicion;
        this.dorsal = dorsal;
    }
    
    @Override  //sobrescritura del metodo persona, si no lo sobre escribimos tomara los metodos de la clase persona
    public void  hablar(){
        System.out.println("Se hiso  lo que pudo");
    }
    
    @Override
    public void comer(){
        System.out.println("Todos comen sano");
    }
    
    
    public String toString(){ //sobre escritura del metodo toString ,para poder regresar el objeto 
       return "Returnt objeto" +getNombre()+getApellidoM()+getApellidoP()+getEdad()+posicion+dorsal;
    }

    @Override
    public void jugar() {
        System.out.println("deportista.futbolista.jugar()");
    }

    @Override
    public void entrenar() {
        System.out.println("deportista.futbolista.entrenar()");
    }

    @Override
    public void viajar() {
        System.out.println("deportista.futbolista.viajar()");
    }
    
}
