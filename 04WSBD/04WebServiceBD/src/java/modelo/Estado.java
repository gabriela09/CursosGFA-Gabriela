/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author ga.gutierrez
 */
public class Estado {
    
    private int id_estado;
    private String nombre;
    private int municipios;
    private String comidatipica;
    private String  capital;
    private int poblacion;

    public Estado(int id_estado, String nombre, int municipios, String comidatipica, String capital, int poblacion) {
        this.id_estado = id_estado;
        this.nombre = nombre;
        this.municipios = municipios;
        this.comidatipica = comidatipica;
        this.capital = capital;
        this.poblacion = poblacion;
    }
    
    
    public Estado(){}
    

    public int getId_estado() {
        return id_estado;
    }

    public void setId_estado(int id_estado) {
        this.id_estado = id_estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMunicipios() {
        return municipios;
    }

    public void setMunicipios(int municipios) {
        this.municipios = municipios;
    }

    public String getComidatipica() {
        return comidatipica;
    }

    public void setComidatipica(String comidatipica) {
        this.comidatipica = comidatipica;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public int getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }
    
}
