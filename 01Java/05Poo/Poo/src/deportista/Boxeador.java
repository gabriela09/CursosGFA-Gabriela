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
public class Boxeador extends Persona  implements Deporte {

    private String peso;

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public Boxeador(String nombre, String apellidoM, String apellidoP, int edad, String peso) {
        super(nombre, apellidoM, apellidoP, edad);
        this.peso = peso;
    }

    @Override
    public void jugar() {
        System.out.println("deportista.Boxeador.jugar()");
    }

    @Override
    public void entrenar() {
        System.out.println("deportista.Boxeador.entrenar()");
    }

    @Override
    public void viajar() {
        System.out.println("deportista.Boxeador.viajar()");
    }

}
