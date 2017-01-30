/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Time;
import java.sql.Date;

/**
 *
 * @author ga.gutierrez
 */
public class Corrida {
    
    private  int id_servicio;
    private String origen;
    private String destino;
    private String fecha_salida;
    private String hora_salida;
    private String fecha_llegada;
    private String hora_llegada;
    private int numero_escalas;

    public String getFecha_salida() {
        return fecha_salida;
    }

    public void setFecha_salida(String fecha_salida) {
        this.fecha_salida = fecha_salida;
    }

    public String getHora_salida() {
        return hora_salida;
    }

    public void setHora_salida(String hora_salida) {
        this.hora_salida = hora_salida;
    }

    public String getFecha_llegada() {
        return fecha_llegada;
    }

    public void setFecha_llegada(String fecha_llegada) {
        this.fecha_llegada = fecha_llegada;
    }

    public String getHora_llegada() {
        return hora_llegada;
    }

    public void setHora_llegada(String hora_llegada) {
        this.hora_llegada = hora_llegada;
    }

    public int getNumero_escalas() {
        return numero_escalas;
    }

    public void setNumero_escalas(int numero_escalas) {
        this.numero_escalas = numero_escalas;
    }
    

    
    public int getId_servicio() {
        return id_servicio;
    }

    public void setId_servicio(int id_servicio) {
        this.id_servicio = id_servicio;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    
    public Corrida(int id_servicio, String origen, String destino, String fecha_salida, String hora_salida, String fecha_llegada, String hora_llegada,int num_escalas) {
        this.id_servicio = id_servicio;
        this.origen = origen;
        this.destino = destino;
        this.fecha_salida = fecha_salida;
        this.hora_salida = hora_salida;
        this.fecha_llegada = fecha_llegada;
        this.hora_llegada = hora_llegada;
        this.numero_escalas=num_escalas;
    }

  
    
    public Corrida(){}

   
    
    
    
}
