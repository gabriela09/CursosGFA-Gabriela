/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10archivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.Date;

/**
 *
 * @author ea.salcedo
 */
public class Error implements Escribible {

    private long timeStamp;
    private int codigoError;
    private String descripcion;

    public Error(int codigoError, String descripcion) {
        this.timeStamp = new Date().getTime();
        this.codigoError = codigoError;
        this.descripcion = descripcion;
    }

    /*  @Override
    /* public void escribir(String url) {
        FileWriter fw;
        try{
            fw = new FileWriter(url,true);
        String linea = timeStamp + " | " + codigoError + " | " + descripcion + "\n";
            fw.append(linea);
            fw.close();
        }
        catch (IOException ex){
            
            System.out.println("El Archivo no existe");
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }  */
    public void escribir(String url) {
        try {
            FileOutputStream fo = new FileOutputStream(url, true);
            OutputStreamWriter os = new OutputStreamWriter(fo, "UTF-8");
            BufferedWriter bw = new BufferedWriter(os); // Hasta cerrar  el archivo se graba en el archivo 

            String linea = timeStamp + "-" + codigoError + "-" + descripcion + "r\n";
            bw.write(linea);
            bw.close(); // Hasta cerrar  el archivo se graba en el archivo 

        } catch (FileNotFoundException ex) {
            System.out.println("Archivo no encotrado ");
        } catch (UnsupportedEncodingException ex) {
            System.out.println("Error de codificacion");
        } catch (IOException ex) {
            System.out.println("Error de entrada y salida IO");
        } catch (Exception ex) {
            System.out.println("Cuaquier otra excepcion");
        }

    }

    public long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }

    public int getCodigoError() {
        return codigoError;
    }

    public void setCodigoError(int codigoError) {
        this.codigoError = codigoError;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public Escribible leer(String url, long timeStamp) {
        try {
        FileReader fl = new FileReader(url); // 
        BufferedReader rd = new BufferedReader(fl); 
        String linea;
        
        while((linea =rd.readLine()) !=null){
            String[] sl = linea.split("-");
            
            if (Long.parseLong(sl[0])==timeStamp){
              this.timeStamp = timeStamp;
              this.codigoError =Integer.parseInt(sl[1]);
              this.descripcion =sl[2];
              return this; // retorna el objeto 
            }
        } 
        
        }
        catch (FileNotFoundException ex){
            System.out.println("archivo  no encontrado necesario para FIlereader");
        }
        catch (IOException ex){
            System.out.println("Error de IO al utilizar el readline");
        
        }
        return null;

    }
    
    
    public Error(){
    }
    
    public String toString(){
      return  timeStamp + " | " + codigoError + " | " + descripcion ;
    }

}
