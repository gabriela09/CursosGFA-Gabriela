/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleado;

/**
 *
 * @author ga.gutierrez
 */
public abstract class Empleado extends persona.Persona {

    private int cveEmpleado;
    private float salario;

    public Empleado(String nombre, String apellidoM, String apellidoP, int edad, int cveEmpleado, float salario) {
        super(nombre, apellidoM, apellidoP, edad);
        this.cveEmpleado = cveEmpleado;
        this.salario = salario;
        trabajar(); // Se puede invocar sobre el mismo contructor 
    }

    public abstract void trabajar();  // Las funciones abstracta solo se define en la clase y en las clases que se utiliza se pone el cuerpo de la funcion 
                                       //Obliga a que las clases hijas los complementen 

    public abstract void transporteTorta();

}
