/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.Estado;


/**
 *
 * @author ga.gutierrez
 */
public class EstadoBD {
    
    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver"; // constantes  
    private static final String URL = "jdbc:mysql://localhost:3306/estadosmexico";
    private static final String User = "root";
    private static final String Pass = "123456";
    
  static  public String getCapital(String nombre) throws ClassNotFoundException, SQLException{
        
       Class.forName(JDBC_DRIVER);
        Connection conexion =  DriverManager.getConnection(URL,User,Pass);
        Statement consulta = conexion.createStatement();
        ResultSet resultado = consulta.executeQuery("SELECT capital FROM estados where nombre= '" + nombre +"'");
        String capital = null;
        
       if (resultado.next()){
         capital = resultado.getString("capital");
        } 
       
       conexion.close();
       consulta.close();
       resultado.close();
       
       return capital;
    
        
    }
    
   static public int getPoblacion(String nombreEstado) throws ClassNotFoundException, SQLException{
    Class.forName(JDBC_DRIVER);
        Connection conexion =  DriverManager.getConnection(URL,User,Pass);
        Statement consulta = conexion.createStatement();
        ResultSet resultado = consulta.executeQuery("SELECT poblacion FROM estados where nombre= '" + nombreEstado +"'");
        int poblacion = 0;
        
       if (resultado.next()){
         poblacion = Integer.parseInt(resultado.getString("poblacion"));
        } 
       
       conexion.close();
       consulta.close();
       resultado.close();
       
       return poblacion;
    
    }

    public static Estado[] getEstados() throws ClassNotFoundException, SQLException {
        
          Class.forName(JDBC_DRIVER);
        Connection conexion =  DriverManager.getConnection(URL,User,Pass);
        Statement consulta = conexion.createStatement();
        ResultSet resultado = consulta.executeQuery("SELECT * FROM estados");
         ArrayList<Estado> lista = new ArrayList<Estado>();
         
         while (resultado.next()) {
            Estado e = new Estado(resultado.getInt("id_Estado"), resultado.getString("nombre"),
                     resultado.getInt("municipios"), resultado.getString("capital"), resultado.getString("comida_tipica"), resultado.getInt("poblacion"));
            
            lista.add(e);
        }
        Estado[] arr = new Estado[lista.size()];
        return lista.toArray(arr);
    }
    
    
    
}
