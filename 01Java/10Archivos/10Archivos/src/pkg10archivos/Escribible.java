/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10archivos;

/**
 *
 * @author ea.salcedo
 */
public interface Escribible {
    public void escribir(String url);
    public Escribible leer(String url,long timeStamp);  // retorna un objeto del tipo de la clase que lo implemente 
    
}
