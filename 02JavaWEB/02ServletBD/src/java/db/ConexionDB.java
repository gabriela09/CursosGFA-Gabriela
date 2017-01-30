/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.naming.spi.DirStateFactory;
import model.Autobus;
import model.Avion;
import model.Motocicleta;
import model.Vehiculo;

/**
 *
 * @author ga.gutierrez
 */
public class ConexionDB {

    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver"; // constantes  
    private static final String URL = "jdbc:mysql://localhost:3306/gfajava";
    private static final String User = "root";
    private static final String Pass = "123456";
    
    private Connection conexion;
    private Statement consulta;
     ResultSet resultado;
    
    public boolean registraAutobus(Autobus b) throws ClassNotFoundException, SQLException{
      Class.forName(JDBC_DRIVER);
        Connection conexion =  DriverManager.getConnection(URL,User,Pass);
        Statement consulta = conexion.createStatement();
        String qry = String.format("INSERT INTO AUTOBUS(NUM_AUTOBUS,SIGLAS,MODELO,CAPACIDAD,BASE) VALUES ('%d','%s','%d','%d','%s')", b.getNum_autobus(),b.getSiglas(),b.getModelo(),b.getCapacidad(),b.getBase());
        int c = consulta.executeUpdate(qry);
        //consulta.execute(qry);
        conexion.close();
        consulta.close();
        
        if (c ==1)
         return true;
        else 
            return false;
    }
    
    public void ConexionBD() throws ClassNotFoundException, SQLException{
        Class.forName(JDBC_DRIVER);
        conexion =  DriverManager.getConnection(URL,User,Pass);
        consulta = conexion.createStatement();
        
      
    }
    
    
    public void DesconectaBD() throws SQLException{
    
       conexion.close();
       consulta.close();
       //resultado.close();
    
    }
    public boolean AgregaBD(String cad) throws ClassNotFoundException, SQLException{
    
       ConexionBD();
       int res = consulta.executeUpdate(cad);
       DesconectaBD();
        
        if (res ==1)
         return true;
        else 
         return false;
    
    }
    
    public boolean EliminaBD(int id_vehiculo) throws ClassNotFoundException, SQLException{
       ConexionBD();
       int res = consulta.executeUpdate("DELETE from VEHICULO WHERE ID_VEHICULO =" +id_vehiculo);
       DesconectaBD();
       
       if (res ==1)
         return true;
        else 
         return false;
    
               
    }
    
    public boolean ArmaCad(Vehiculo v, int tipo) throws ClassNotFoundException, SQLException{
    String qry= null;
    
     qry = String.format("INSERT INTO VEHICULO(ID_VEHICULO,NUM_ASIENTOS,NUM_LLANTAS,CAPACIDAD_GAS,TIPO_VEHICULO) VALUES ('%d','%d','%d','%d','%s')",v.getId_vehiculo(),v.getNum_asientos(),v.getNum_llantas(),v.getCapacidad_gas(),v.getTipoVehiculo());
     AgregaBD(qry);           
        
       switch (tipo) {
                case 1:
                  qry = String.format("INSERT INTO AVION(PK_AVION,FK_VEHICULO,NUMERO_ALAS,TIPO_TIMON) VALUES ('%d','%d','%d','%s')",v.getId_vehiculo(),v.getId_vehiculo(),((Avion)v).getNumeroAlas(),((Avion)v).getTipoTimon());
                 break;  
                case 2:
                  qry = String.format("INSERT INTO MOTOCICLETA(PK_MOTOCICLETA,FK_VEHICULO,NUMERO_PARILLAS) VALUES ('%d','%d','%d')",v.getId_vehiculo(),v.getId_vehiculo(),((Motocicleta)v).getNum_Parillas());
                 break;
       }
      
        AgregaBD(qry);
        
       return true;
    }
    
    public Vehiculo BuscarVehiculo(int id_vehiculo) throws SQLException, ClassNotFoundException{
    String sql;
    String tipo=null;
     
    
    sql = "SELECT * FROM VEHICULO WHERE ID_VEHICULO = " + id_vehiculo;
    ConexionBD();
    ResultSet resultado = consulta.executeQuery(sql);
    resultado.next();
    tipo =resultado.getString("TIPO_VEHICULO");
    int capacidad_gas = resultado.getInt("CAPACIDAD_GAS");
    int num_asientos =resultado.getInt("NUM_ASIENTOS");
    int num_llantas=resultado.getInt("NUM_LLANTAS");
 
   
    ResultSet resultado2 ;
    
    Vehiculo vh =null;
    
     switch (tipo) {
                case "AVION":
                  sql = String.format("SELECT * FROM AVION WHERE FK_VEHICULO = " +id_vehiculo);
                  resultado2 = consulta.executeQuery(sql);
                  resultado2.next();
                  vh =    new Avion(capacidad_gas, num_asientos, num_llantas, id_vehiculo, tipo , resultado2.getInt("NUMERO_ALAS"), resultado2.getString("TIPO_TIMON"));  
                    
                 break;
                case "MOTOCICLETA":
                  sql = String.format("SELECT * FROM MOTOCICLETA WHERE FK_VEHICULO = " +id_vehiculo);
                  resultado2 = consulta.executeQuery(sql);
                  resultado2.next();
                  vh =    new Motocicleta(capacidad_gas, num_asientos, num_llantas, id_vehiculo, tipo , resultado2.getInt("NUMERO_PARILLAS"));  
                  
                  break;
                 
                
       }
      
     
     return vh;     
        
        
    }
    
    

    public List<Autobus> getAutobuses() throws ClassNotFoundException, SQLException {  // enviar la excepcion de donde se invoque 

        Class.forName(JDBC_DRIVER);
        Connection conexion =  DriverManager.getConnection(URL,User,Pass);
        Statement consulta = conexion.createStatement();
        ResultSet resultado = consulta.executeQuery("Select * from autobus");
        
        
        ArrayList<Autobus> lista = new ArrayList<>();
        Autobus bus = null ;
        
        while(resultado.next()){
            bus = new  Autobus();
//         int num_autobus = resultado.getInt("Num Autobus");
//         String siglas  = resultado.getString("Siglas");
//         int modelo = resultado.getInt("Modelo");
//         int capacidad = resultado.getByte("capacidad");
//         String base = resultado.getString("Base");

            bus.setNum_autobus(resultado.getInt("NUM_AUTOBUS")); //Campos BD
            bus.setSiglas(resultado.getString("SIGLAS"));
            bus.setModelo(resultado.getInt("MODELO"));
            bus.setCapacidad(resultado.getInt("CAPACIDAD"));
            bus.setBase(resultado.getString("BASE"));
            
            lista.add(bus);

        }
        
        resultado.close();
        consulta.close();
        conexion.close();
        
        return lista;
    }
}
