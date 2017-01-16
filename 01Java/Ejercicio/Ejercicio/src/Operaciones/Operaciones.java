/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operaciones;

/**
 *
 * @author ga.gutierrez
 */
public class Operaciones {

    int suma;
    int mayor;

    public int suma(int a[]) {
        for (int i = 0; i < a.length; i++) {
<<<<<<< HEAD
            suma += a[i]; // suma = suma o suma+=
=======
            suma += a[i];
>>>>>>> b1b311a97ec518af58712a1604bab33325ba90e1
        }
        return suma;
    }

    public int media(int a[]) {
        suma(a);
        return suma / a.length;
    }

    public int mayor(int a[]) {
        for (int i = 0; i < a.length; i++) {

            if (i == 0) {
                mayor = a[i];
            }

            if (mayor < a[i]) {

                mayor = a[i];
            }

        }

        return mayor;
    }

    public Operaciones() {
    }

}
