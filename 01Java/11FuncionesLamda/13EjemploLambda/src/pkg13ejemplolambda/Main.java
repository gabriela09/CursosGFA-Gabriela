/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg13ejemplolambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import operadores.Operador;

/**
 *
 * @author ga.gutierrez
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    static List<Operador> lista = Arrays.asList(new Operador("Operador 0", 3400, true),
            new Operador("Operador 1", 3500, false),
            new Operador("Operador 2", 3400, true));

    public static void main(String[] args) {
        // TODO code application logic here
      filtroAntiguo();
      
      
      //Funcion landba
      System.out.println("Funcion lambda");
      filtroNuevo();
    }

    public static void filtroAntiguo() {
        List<Operador> operadores = new ArrayList<Operador>();
        // For mejorado eich
        for (Operador ope : lista) {  //Tipo de dato, lista  tipo de dato,Arreglo
            if (ope.isStatus()) {  // solo a las cvariables bollean les pone isStatus 
                operadores.add(ope);

            }
        }
        
        Imprirmir(operadores);

    }
    
    
    public static void Imprirmir(List<Operador> ope){
    
        for (Operador op: ope){
            System.out.println("Operadores" + op);
        }
    
    }
    
    public static void filtroNuevo(){
    List<Operador> operdaores = lista.stream().filter(op-> op.isStatus()).collect(Collectors.toList()); 
    //Predicate regresa y enviar inforacion a  la funcion 
    // Provider : solo regresa  informacion 
    // Consumer solo consume la funcion no regresa nada 
    
    
       // Imprirmir(operdaores);
       
        imprimirNuevo(operdaores);
    }
    
    public static void imprimirNuevo(List<Operador> ope){
        System.out.println("\"----------Lista Filtrada-------------\"");
         ope.forEach(op-> System.out.println(op));  //For mejorado para imprimir funcion lambada consumer solo consume la funcion no regresa nada 
    
    }

}
