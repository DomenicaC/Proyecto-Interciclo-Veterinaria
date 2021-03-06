/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.Modelo;
import java.util.Objects;

/**
 *
 * @author erics
 */
public class Cliente extends Persona {
    private String direccion;
    private String telefono;
    private String genero;
    private Persona persona;
    
    public Cliente (){
        
    }
    
    //Constructor

    public Cliente(String direccion, String telefono, String genero, Persona persona) {
        this.direccion = direccion;
        this.telefono = telefono;
        this.genero = genero;
        this.persona = persona;
    }
    
       // get and set 
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
        // hascode y el equals
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.direccion);
        hash = 29 * hash + Objects.hashCode(this.telefono);
        hash = 29 * hash + Objects.hashCode(this.genero);
        hash = 29 * hash + Objects.hashCode(this.persona);
        return hash;
    }

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
        final Cliente other = (Cliente) obj;
        if (!Objects.equals(this.direccion, other.direccion)) {
            return false;
        }
        if (!Objects.equals(this.telefono, other.telefono)) {
            return false;
        }
        if (!Objects.equals(this.genero, other.genero)) {
            return false;
        }
        if (!Objects.equals(this.persona, other.persona)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return super.toString()+ "Cliente{" + "direccion=" + direccion + ", telefono=" + telefono + ", genero=" + genero + ", persona=" + persona + '}';
    }
    
     
}
