/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto27;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ga.gutierrez
 */
public class Reto27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);

        char[] array = new char[5];
        int numeroMayor = 0;
        int numeroMenor = 0;
        int numeroRes = 0;
        String cadena;

        System.out.println("Ingresa numero:");
        array = s.next().toCharArray();

        Arrays.sort(array);

        Operaciones o = new Operaciones();
        numeroMayor = o.Asendiente(array);
        numeroMenor = o.Desendiente(array);
        numeroRes = o.resta(numeroMenor, numeroMayor);

        System.out.println("Resta " + numeroMenor + "-" + numeroMayor + "=" +numeroRes);

        while (numeroRes != 6174) {
            cadena = String.valueOf(numeroRes);

            array = cadena.toCharArray();
            Arrays.sort(array);
            numeroMayor = o.Asendiente(array);
            numeroMenor = o.Desendiente(array);
            numeroRes = o.resta(numeroMenor, numeroMayor);
            System.out.println("Resta " + numeroMenor + "-" + numeroMayor + "=" +numeroRes);

        }

    }

}
