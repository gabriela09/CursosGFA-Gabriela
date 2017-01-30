/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import db.EstadoBD;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import modelo.Estado;

/**
 *
 * @author ga.gutierrez
 */

   @WebService
public class EstadosWsImpl implements EstadosWS{

    @Override
    @WebMethod
    public String getCapital(String s) throws ClassNotFoundException, SQLException {
      
    return  EstadoBD.getCapital(s);
    }

    @Override
    @WebMethod
    public int getPoblacion(String s) throws ClassNotFoundException, SQLException {
     return  EstadoBD.getPoblacion(s);
     
    }
     
    

    @Override
    @WebMethod
     @WebResult(name="estado")
    public Estado[] obtieneEstados() {
        try {
            return  EstadoBD.getEstados();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EstadosWsImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(EstadosWsImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }

    

 



  
    
}
