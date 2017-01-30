/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import java.sql.Date;
import java.sql.SQLException;
import java.sql.Time;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import model.Corrida;

/**
 *
 * @author ga.gutierrez
 */

@WebService
public class CorridaWSImpl implements CorridasWS{

    @Override
     @WebMethod
    public boolean AgregarCorrida(Corrida c) {
        try {
            return  BD.CorridaBD.AgregarCorrida(c);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CorridaWSImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CorridaWSImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    }


    @Override
     @WebMethod
    public boolean EliminarCorrida(int id_corrida) {
      
        try {
            return BD.CorridaBD.EliminarCorrida(id_corrida);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CorridaWSImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CorridaWSImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    }

    @Override
     @WebMethod
    @WebResult(name="corrida")
    public Corrida[] ConsultarCorrida(String fecha_max, String hora_max) {
        
        try {
           return BD.CorridaBD.BuscarCorrida(fecha_max, hora_max);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CorridaWSImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CorridaWSImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
        
    }
    
    

    

 
}
