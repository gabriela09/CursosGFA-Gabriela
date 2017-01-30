/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WSHolaMundo;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author ga.gutierrez
 */
  @WebService
public class HolaMundoImpl implements HolaMundo{

    @Override
    public String getHolaMundo(@WebParam(name="nombre") String s) {
        
      return  "hola" +s;
    
    }

 

  
    
}
