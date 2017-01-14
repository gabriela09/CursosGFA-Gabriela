/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona;

/**
 *
 * @author ga.gutierrez
 */
public class Persona {

    private String nombre;
    private int edad;
    private String apellidoM;
    private String apellidoP;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getApellidoM() {
        return apellidoM;
    }

    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public Persona(String nombre, String apellidoM, String apellidoP, int edad) {
        this.nombre = nombre;
        this.apellidoM = apellidoM;
        this.apellidoP = apellidoP;
        this.edad = edad;
    }

    public Persona(String nombreCompleto) {
        String[] nc = nombreCompleto.split(" ");
        this.nombre = nc[0];
        this.apellidoM = nc[1];
        this.apellidoP = nc[2];
        this.edad = 1;
    }

    public void hablar() {
        System.out.println("Hola mi nombre es" + nombre + apellidoM + apellidoP);

    }

    public void comer() {
        System.out.println("Que vamos a comer?");
    }
}
