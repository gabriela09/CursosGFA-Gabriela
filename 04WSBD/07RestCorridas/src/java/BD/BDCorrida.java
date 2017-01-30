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
import modelo.Corrida;

/**
 *
 * @author ga.gutierrez
 */
public class BDCorrida {

    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver"; // constantes  
    private static final String URL = "jdbc:mysql://localhost:3306/servicios";
    private static final String User = "root";
    private static final String Pass = "123456";

    private Connection conexion;
    private Statement consulta;
    private ResultSet resultado;

    public void DesconectaBD() throws SQLException {

        conexion.close();
        consulta.close();
        //resultado.close();

    }

    public static boolean insertaCorrida(Corrida c) throws SQLException, ClassNotFoundException {
        String qry = String.format("INSERT TSERVIC (ID_SERVICIO,ORIGEN,DESTINO,FECHA_SALIDA,HORA_SALIDA,FECHA_LLEGADA,HORA_LLEGADA,NUMERO_ESCALAS) VALUES ('%d','%s','%s','%s','%s','%s','%s','%d')",
                c.getId_servicio(), c.getOrigen(), c.getDestino(), c.getFecha_salida(), c.getHora_salida(), c.getFecha_llegada(), c.getHora_llegada(), c.getNumero_escalas());

        Class.forName(JDBC_DRIVER);
        Connection conexion = DriverManager.getConnection(URL, User, Pass);
        Statement consulta = conexion.createStatement();

        int res = consulta.executeUpdate(qry);

        return res == 1;

    }

    public static Corrida BuscarCorrida(int id) throws ClassNotFoundException, SQLException {

        String qry = "Select * from tservic where id_servicio = " + id;
        Class.forName(JDBC_DRIVER);
        Connection conexion = DriverManager.getConnection(URL, User, Pass);
        Statement consulta = conexion.createStatement();
        ResultSet res = consulta.executeQuery(qry);

        Corrida c =null; // new Corrida();

        if (res.next()) {
            c= new Corrida();
            c.setId_servicio(res.getInt("ID_SERVICIO"));
            c.setOrigen(res.getString("ORIGEN"));
            c.setDestino(res.getString("DESTINO"));
            c.setFecha_salida(res.getString("FECHA_SALIDA"));
            c.setHora_salida(res.getString("HORA_SALIDA"));
            c.setFecha_salida(res.getString("FECHA_LLEGADA"));
            c.setHora_salida(res.getString("HORA_LLEGADA"));
            c.setNumero_escalas(res.getInt("NUMERO_ESCALAS"));
        }

        res.close();
        consulta.close();
        conexion.close();
        
        
        

        return c;
    }
}
