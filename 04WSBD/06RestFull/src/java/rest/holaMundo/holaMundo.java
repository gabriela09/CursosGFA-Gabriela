/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest.holaMundo;

/**
 *
 * @author ga.gutierrez
 */
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author ga.gutierrez
 */
@Path("/HolaMundo")
public class holaMundo {
    
    
 @GET
 @Produces(MediaType.TEXT_PLAIN)
    public String holaMundoText(){
     return "Hola mundo texto";
    }
    
 @GET
 @Produces(MediaType.TEXT_XML)   
    public String holaMundoXMl(){
    
    return "<?xml version=\"1.0\">"+"<hola>Hola mundo xml  </hola>";
    }
    
 @GET
 @Produces(MediaType.TEXT_HTML)   
    public String holaMundoHTML(){
    
    return  "<html><body><h1>Hola mundo html </h1></body></html>";
    }
   
    @GET
 @Produces(MediaType.APPLICATION_JSON)
    public String holaMundoJson(){
     return "{ \"name\":\"John\", \"age\":31, \"city\":\"New York\" }";
    
    }
}
