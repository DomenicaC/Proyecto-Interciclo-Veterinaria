/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.Modelo;

/**
 *
 * @author Byron PC
 */
public class Mascota {

    private String nombre;
    private int codigo;
    private int edad;
    private double peso;
    private String especie;

    public Mascota() {

    }

    public Mascota(String nombre, int codigo, int edad, double peso, String especie) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.edad = edad;
        this.peso = peso;
        this.especie = especie;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    @Override
    public String toString() {
        return "Mascota{" + "nombre=" + nombre + ", codigo=" + codigo + ", edad=" + edad + ", peso=" + peso + ", especie=" + especie + '}';
    }

    
 
}
