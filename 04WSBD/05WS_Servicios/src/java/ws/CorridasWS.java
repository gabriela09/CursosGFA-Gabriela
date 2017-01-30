/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import java.sql.Date;
import java.sql.Time;
import javax.jws.WebMethod;
import javax.jws.WebService;
import model.Corrida;

/**
 *
 * @author ga.gutierrez
 */


 @WebService
public interface CorridasWS {
    
     @WebMethod
     public boolean AgregarCorrida(Corrida c);
     
     @WebMethod
     public boolean EliminarCorrida(int id_corrida);
     
     @WebMethod
     public Corrida[] ConsultarCorrida(String fecha_max,String hora_max);
}
