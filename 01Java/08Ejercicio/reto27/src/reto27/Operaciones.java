/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto27;

import java.util.Arrays;

/**
 *
 * @author ga.gutierrez
 */
public class Operaciones {
    
     public  int Asendiente(char[] arr) {
        String numMayor = "";

        for (int i = 0; i < arr.length; i++) {
            numMayor += arr[i];

        }

        return Integer.parseInt(numMayor);

    }

    public  int Desendiente(char[] arr) {
        String numMenor = "";
        for (int i = arr.length-1; i >= 0; i--) {
            numMenor += arr[i];
        }

        return Integer.parseInt(numMenor);

    }
    
    public int resta(int numeroMayor, int numeroMenor){
      int res =0;
      res = numeroMayor -numeroMenor;
      
      return res;
              
    }
    
  
    
}
