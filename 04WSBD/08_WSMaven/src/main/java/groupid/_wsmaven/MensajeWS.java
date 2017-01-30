/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groupid._wsmaven;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;


/**
 *
 * @author ga.gutierrez
 */
    @Path("mensaje")
public class MensajeWS {
    
    @Path("/{param}")
    @GET
    public Response ImprimirMensaje(@PathParam("param")String param){
      String msj = "Your messaje is" + param;
      return Response.status(Response.Status.OK).entity(msj).build(); // Status es el codigo http del estatus del WS 200 ok,conflit
      
    }
}
