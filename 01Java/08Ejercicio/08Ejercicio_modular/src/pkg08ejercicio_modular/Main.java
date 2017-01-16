/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg08ejercicio_modular;

import automovil.automovil;
import java.util.Scanner;
import automovil.automovil;
import avion.Avion;
import java.util.ArrayList;
import lancha.Lancha;
import motocicleta.Motocicleta;
import vehiculo.Vehiculo;

/**
 *
 * @author ga.gutierrez
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    static Scanner s = new Scanner(System.in);
    static ArrayList<Operaciones> Vehiculos = new ArrayList<Operaciones>();
    static int opcion;

    public static void main(String[] args) {

        menu();

        while (opcion != 5) {
            switch (opcion) {
                case 1:
                    System.out.println("Ingresa datos de vehiculo:");

                    System.out.println("Identificador ");
                    int idVehiculo = Integer.parseInt(s.nextLine());

                    System.out.println("Capacidad");
                    int cap = Integer.parseInt(s.nextLine());

                    System.out.println("Numero de asientos");
                    int numAsientos = Integer.parseInt(s.nextLine());

                    System.out.println("Numero de llantas");
                    int numLlantas = Integer.parseInt(s.nextLine());

                    System.out.println("Elija tipo Vehiculo  1.-Automovil  2.-Avion 3.-Lancha  4.-Motocicleta");

                    switch (Integer.parseInt(s.nextLine())) {
                        case 1:
                            System.out.println("Numero de puertas:");
                            int numPuertas = Integer.parseInt(s.nextLine());

                            System.out.println("Numero de cilindros:");
                            int numCilindros = Integer.parseInt(s.nextLine());

                            System.out.println("Reproductor de sonido");
                            String reproductorSonido = s.nextLine();

                            automovil a = new automovil(cap, numAsientos, numLlantas, idVehiculo, numPuertas, numCilindros, reproductorSonido);

                            Vehiculos.add(a);
                            menu();
                            break;
                        case 2:
                            System.out.println("Numero de alas:");
                            int numAlas = Integer.parseInt(s.nextLine());

                            System.out.println("Tipo de timon:");
                            String tipoTimon = s.nextLine();

                            Avion avi = new Avion(cap, numAsientos, numLlantas, idVehiculo, numAlas, tipoTimon);
                            Vehiculos.add(avi);
                            menu();

                            break;
                        case 3:
                            System.out.println("Tipo madera:");
                            String tipoMadera = s.nextLine();

                            System.out.println("Numero de velas:");
                            int numeroVelas = Integer.parseInt(s.nextLine());

                            Lancha lan = new Lancha(cap, numAsientos, numLlantas, idVehiculo, tipoMadera, numeroVelas);

                            Vehiculos.add(lan);
                            menu();
                            break;
                        case 4:
                            System.out.println("Numero de parillas:");
                            int numeroParillas = Integer.parseInt(s.nextLine());

                            Motocicleta moto = new Motocicleta(cap, numAsientos, numLlantas, idVehiculo, numeroParillas);

                            Vehiculos.add(moto);
                            menu();

                            break;

                    }

                    break;
                case 2:
                    int id_remove;
                    System.out.print("Introduce ID: ");
                    id_remove = buscar(Integer.parseInt(s.nextLine()));
                    Vehiculos.remove(id_remove);
                    menu();
                    break;
                case 3:
                    int id;
                    System.out.print("Introduce ID: ");
                    id = buscar(Integer.parseInt(s.nextLine()));
                    System.out.println(Vehiculos.get(id));
                    menu();
                    break;
                case 4:
                    System.out.println(Vehiculos);
                    menu();
                    break;

            }
        }

    }

    public static int buscar(int id) {
        for (int i = 0; i < Vehiculos.size(); i++) {
            if (Vehiculos.get(i).ObtieneID() == id) {
                return i;
            }
        }
        return 0;
    }

    public static void menu() {
        System.out.println("Elija la operacion 1.-Registra Vehiculo  2.-Elimina Vehiculo 3.-Buscar 4.- Consultar todo 5.-Salir");
        opcion = Integer.parseInt(s.nextLine());
    }
}
