/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11funcioneslamda;

/**
 *
 * @author ga.gutierrez
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /* Cambiar jdk 8 para las expreciones lamda 
        
        Matematicas suma = (float num1, float num2)->a+b;
        Matematicas resta = (float num1, float num2)->a-b;
        Matematicas multiplicacion = (float num1, float num2)->a*b;
        Matematicas division = (float num1, float num2)->a/b;*/
        
        
       
    }
    
    public static float Operar(float a, float b,Matematicas operacion){
       return  operacion.Operacion(a, b);
    }
}
