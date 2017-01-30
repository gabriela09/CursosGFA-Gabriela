/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Time;
import java.util.Date;

/**
 *
 * @author ga.gutierrez
 */
public class Corrida2 {
    
    
     private  int id_servicio;
    private String origen;
    private String destino;
    private Date fecha_salida;
    private Time hora_salida;
    private Date fecha_llegada;
    private Time hora_llegada;
    private int numero_escalas;

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

    public Date getFecha_salida() {
        return fecha_salida;
    }

    public void setFecha_salida(Date fecha_salida) {
        this.fecha_salida = fecha_salida;
    }

    public Time getHora_salida() {
        return hora_salida;
    }

    public void setHora_salida(Time hora_salida) {
        this.hora_salida = hora_salida;
    }

    public Date getFecha_llegada() {
        return fecha_llegada;
    }

    public void setFecha_llegada(Date fecha_llegada) {
        this.fecha_llegada = fecha_llegada;
    }

    public Time getHora_llegada() {
        return hora_llegada;
    }

    public void setHora_llegada(Time hora_llegada) {
        this.hora_llegada = hora_llegada;
    }

    public int getNumero_escalas() {
        return numero_escalas;
    }

    public void setNumero_escalas(int numero_escalas) {
        this.numero_escalas = numero_escalas;
    }

    public Corrida2(int id_servicio, String origen, String destino, Date fecha_salida, Time hora_salida, Date fecha_llegada, Time hora_llegada, int numero_escalas) {
        this.id_servicio = id_servicio;
        this.origen = origen;
        this.destino = destino;
        this.fecha_salida = fecha_salida;
        this.hora_salida = hora_salida;
        this.fecha_llegada = fecha_llegada;
        this.hora_llegada = hora_llegada;
        this.numero_escalas = numero_escalas;
    }
    
    
    public Corrida2(){}
    
}
