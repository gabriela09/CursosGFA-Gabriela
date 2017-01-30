/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.Corrida;

/**
 *
 * @author ga.gutierrez
 */
public class CorridaBD {

    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver"; // constantes  
    private static final String URL = "jdbc:mysql://localhost:3306/servicios";
    private static final String User = "root";
    private static final String Pass = "123456";

    static public boolean AgregarCorrida(Corrida c) throws ClassNotFoundException, SQLException {

        Class.forName(JDBC_DRIVER);
        Connection conexion = DriverManager.getConnection(URL, User, Pass);
        Statement consulta = conexion.createStatement();
        String qry = String.format("INSERT TSERVIC (ID_SERVICIO,ORIGEN,DESTINO,FECHA_SALIDA,HORA_SALIDA,FECHA_LLEGADA,HORA_LLEGADA,NUMERO_ESCALAS) VALUES ('%d','%s','%s','%s','%s','%s','%s','%d')",
                c.getId_servicio(), c.getOrigen(), c.getDestino(), c.getFecha_salida(), c.getHora_salida(), c.getFecha_llegada(), c.getHora_llegada(), c.getNumero_escalas());

        int re = consulta.executeUpdate(qry);
        conexion.close();
        consulta.close();

        if (re == 1) {
            return true;
        }
        return false;

    }
    
    
    public static Corrida[] BuscarCorrida(String Fecha,String hora) throws ClassNotFoundException, SQLException {

        String qry = "SELECT * FROM TSERVIC  WHERE TIMESTAMP ( '"+Fecha+"','"+hora+"' )  BETWEEN TIMESTAMP(FECHA_SALIDA,HORA_SALIDA) AND TIMESTAMP(FECHA_LLEGADA,HORA_LLEGADA)";
        Class.forName(JDBC_DRIVER);
        Connection conexion = DriverManager.getConnection(URL, User, Pass);
        Statement consulta = conexion.createStatement();
        ResultSet res = consulta.executeQuery(qry);
         ArrayList<Corrida> lista = new ArrayList<Corrida>();
         
         while (res.next()) {
            Corrida co = new Corrida(res.getInt("ID_SERVICIO"), res.getString("ORIGEN"), res.getString("DESTINO"), res.getString("FECHA_SALIDA")
                    , res.getString("HORA_SALIDA"), res.getString("FECHA_LLEGADA"), res.getString("HORA_LLEGADA"), res.getInt("NUMERO_ESCALAS"));
            lista.add(co);
        }
        Corrida[] arr = new Corrida[lista.size()];
        

        res.close();
        consulta.close();
        conexion.close();
        
        
        return lista.toArray(arr);

     
    }
    
      static public boolean EliminarCorrida(int id) throws ClassNotFoundException, SQLException {

        Class.forName(JDBC_DRIVER);
        Connection conexion = DriverManager.getConnection(URL, User, Pass);
        Statement consulta = conexion.createStatement();
        String qry = "delete from tservic where id_servicio = " + id ;
        int re = consulta.executeUpdate(qry);
        conexion.close();
        consulta.close();

        if (re == 1) {
            return true;
        }
        return false;

    }

}
