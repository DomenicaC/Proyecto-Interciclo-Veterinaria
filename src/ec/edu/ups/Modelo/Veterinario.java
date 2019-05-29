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
public class Veterinario extends Persona{
    private double sueldo;
    private String titulo;
    
    ////consturctores////

    public Veterinario() {
    }

    public Veterinario(double sueldo, String titulo) {
        this.sueldo = sueldo;
        this.titulo = titulo;
    }

    public Veterinario(double sueldo, String titulo, int codigo, String nombre, String apellido, String cedula, int edad) {
        super(codigo, nombre, apellido, cedula, edad);
        this.sueldo = sueldo;
        this.titulo = titulo;
    }
/////////////gettters

    public double getSueldo() {
        return sueldo;
    }

    public String getTitulo() {
        return titulo;
    }
     //////////setters////

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    ////////toString////

    @Override
    public String toString() {
        return super.toString()+"Veterinario{" + "sueldo=" + sueldo + ", titulo=" + titulo + '}';
    }
    //////hashcode///////

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.sueldo) ^ (Double.doubleToLongBits(this.sueldo) >>> 32));
        hash = 37 * hash + Objects.hashCode(this.titulo);
        return hash;
    }
/////////equals///////
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
        final Veterinario other = (Veterinario) obj;
        if (Double.doubleToLongBits(this.sueldo) != Double.doubleToLongBits(other.sueldo)) {
            return false;
        }
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        return true;
    }
    
    
}
