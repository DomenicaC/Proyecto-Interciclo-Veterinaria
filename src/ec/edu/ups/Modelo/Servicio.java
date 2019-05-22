/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.Modelo;

/**
 *
 * @author Carlos
 */
public class Servicio {
    private int codigo;
    private String nombreservicio;
    private double precio;
    
    /////constructor////////////
    public Servicio(){
        
    }
    public Servicio(int codigo, String nombreservicio, double precio) {
        this.codigo = codigo;
        this.nombreservicio = nombreservicio;
        this.precio = precio;
    }
    ///////getters//////

    public int getCodigo() {
        return codigo;
    }

    public String getNombreservicio() {
        return nombreservicio;
    }

    public double getPrecio() {
        return precio;
    }
    ////////settters//////////

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombreservicio(String nombreservicio) {
        this.nombreservicio = nombreservicio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    ////toString////

    @Override
    public String toString() {
        return "Servicio{" + "codigo=" + codigo + ", nombreservicio=" + nombreservicio + ", precio=" + precio + '}';
    }
    
}
