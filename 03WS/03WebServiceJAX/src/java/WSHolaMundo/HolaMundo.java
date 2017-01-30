/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WSHolaMundo;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 *
 * @author ga.gutierrez
 */
@WebService

public interface HolaMundo {
  @WebMethod
  public String getHolaMundo(String s);
    
}
