/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;

import Operaciones.Operaciones;
import java.util.Scanner;
import ejercicio.Ejercicio;

/**
 *
 * @author ga.gutierrez
 */
public class Ejercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        System.out.println("Longitud del arreglo");

        int[] array = new int[Integer.parseInt(s.nextLine())];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Ingrese datos del arreglo");
            array[i] = Integer.parseInt(s.nextLine());
        }

        System.out.println("Elija la operacion 1.Suma 2.-Calcular media 3.- Número Mayor");

        Operaciones ope = new Operaciones();

        switch (Integer.parseInt(s.nextLine())) {
            case 1:
                System.out.println("La suma es " + ope.suma(array));
                break;
            case 2:
                System.out.println("La media es:" + ope.media(array));
                break;
            case 3:
                System.out.println("El numero mayor es " + ope.mayor(array));
                break;
        }

    }

}
