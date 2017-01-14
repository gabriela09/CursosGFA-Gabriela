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
public class Desarollador extends Empleado{
    
    private String lenguaje;
    private int AnioExperencia;

    public Desarollador(String nombre, String apellidoM, String apellidoP, int edad, int cveEmpleado, float salario,String len, int anio) {
        super(nombre, apellidoM, apellidoP, edad, cveEmpleado, salario);
        this.lenguaje=len;
        this.AnioExperencia=AnioExperencia;
    }

    @Override
    public void trabajar() {
        System.out.println("Programan sistemas ");
    
    }

    @Override
    public void transporteTorta() {
       
        System.out.println("Transportan en sobres amarillos");
    }
    
}
