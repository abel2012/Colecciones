/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpmislata.Colecciones.Datos;

/**
 *
 * @author alumno
 */
public class Coche {
    
    private Marca marca;
    private String modelo;
    private int cilindrada;
    private Persona propietario;
    
    
    public Coche(){}
    
    public Coche(Marca marca,String modelo,int cilindrada){
    
        this.marca=marca;
        this.modelo=modelo;
        this.cilindrada=cilindrada;
        
    
    }

    /**
     * @return the marca
     */
    public Marca getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the cilindrada
     */
    public int getCilindrada() {
        return cilindrada;
    }

    /**
     * @param cilindrada the cilindrada to set
     */
    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    /**
     * @return the dniPropietario
     */
    

    /**
     * @return the propietario
     */
    public Persona getPropietario() {
        return propietario;
    }

    /**
     * @param propietario the propietario to set
     */
    public void setPropietario(Persona propietario) {
        this.propietario = propietario;
    }
    
    
}


