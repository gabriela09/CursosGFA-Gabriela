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
public class Operador extends Empleado{

    public Operador(String nombre, String apellidoM, String apellidoP, int edad, int cveEmpleado, float salario) {
        super(nombre, apellidoM, apellidoP, edad, cveEmpleado, salario);
    }

    @Override
    public void trabajar() {
        System.out.println("Conduce las unidades");// throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void transporteTorta() {
        System.out.println("Compran la torta en el comedor");// throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
