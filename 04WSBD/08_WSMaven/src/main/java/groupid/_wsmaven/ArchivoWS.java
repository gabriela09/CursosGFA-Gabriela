/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groupid._wsmaven;

import java.io.File;
import java.net.URL;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 *
 * @author ga.gutierrez
 */
@Path("html")
public class ArchivoWS {
  
    @GET
    @Path("/{nombre}")
    public Response ObtenerArchivo( @PathParam("nombre") String nombre){
        
        ClassLoader cl = getClass().getClassLoader();
        
       try { 
       String ruta = cl.getResource("/html/"+nombre+".html").getFile();
       File archivo = new File( ruta.replace("%20", " "));
       
       
//       File archivo = new File( cl.getResource("/html/"+nombre+".html").getFile());
         return Response.status(Response.Status.OK).entity(archivo).build();
    
           } catch (NullPointerException e){
                String ruta2 = cl.getResource("/html/404.html").getFile();
               File archivo2 = new File( ruta2.replace("%20", " "));
           return Response.status(Response.Status.OK).entity(archivo2).build();
     
    }
  }
    
    
}
