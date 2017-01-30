/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import BD.BDCorrida;
import com.google.gson.Gson;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Time;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import modelo.Corrida;
import modelo.Corrida2;

/**
 *
 * @author ga.gutierrez
 */
@Path("/")
public class CoridaWS {

    @Path("Insertar")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Gson insertar(@QueryParam("id") int id,
            @QueryParam("origen") String origen,
            @QueryParam("destino") String destino,
            @QueryParam("fechaSalida") String fechaSalida,
            @QueryParam("horaSalida") String horaSalida,
            @QueryParam("fechaLlegada") String fechaLlegada,
            @QueryParam("horaLlegada") String horaLlegada,
            @QueryParam("escalas") int escalas) throws SQLException, ClassNotFoundException {

        Corrida corrida = new Corrida(id, origen, destino, fechaSalida, horaSalida, fechaLlegada, horaLlegada, escalas);
        boolean regi = BDCorrida.insertaCorrida(corrida);

        Corrida2 corrida2;
        corrida2 = new Corrida2(id, origen, destino, Date.valueOf(fechaSalida), Time.valueOf(horaSalida), Date.valueOf(fechaLlegada), Time.valueOf(horaLlegada), escalas);

        final Gson gson = new Gson();

        gson.toJson(corrida2);

        return gson;

    }
    
    @Path("Consulta/{id}") //Para el envio de parametros
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Corrida Consulta(@PathParam("id")int id) throws ClassNotFoundException, SQLException{
    
      return BDCorrida.BuscarCorrida(id); //PETICION http://localhost:8100/07RestCorridas/rest/Consulta/1
        
    
    }
    
    
    
}
