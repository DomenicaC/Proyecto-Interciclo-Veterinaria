/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.Modelo;

import java.util.Objects;

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
/////////hascode
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.codigo;
        hash = 89 * hash + Objects.hashCode(this.nombreservicio);
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.precio) ^ (Double.doubleToLongBits(this.precio) >>> 32));
        return hash;
    }
//////////////equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Servicio other = (Servicio) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        if (Double.doubleToLongBits(this.precio) != Double.doubleToLongBits(other.precio)) {
            return false;
        }
        if (!Objects.equals(this.nombreservicio, other.nombreservicio)) {
            return false;
        }
        return true;
    }
    
}
