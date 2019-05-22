/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controladores;

import ec.edu.ups.modelo.Cliente;
import ec.edu.ups.modelo.Persona;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author erics
 */
public class ControladorPersona {
    private Set<Persona> lista;
    private int codigo;

    public Set<Persona> getLista(){
        return lista;
    }
    
    public int getCodigo() {
        return codigo;
    }
    
    public ControladorPersona() {
        lista = new HashSet<>();
        codigo = 1;
    }
    
    public void create(Persona persona){
        persona.setCodigo(codigo);
        codigo++;
        lista.add(persona);
    }
    
    public Persona read(int codigo){
        for (Persona persona : lista) {
            if(persona.getCodigo() == codigo){
                return persona;
            }
        }
        return null;
    }
    
    public Persona readCedula(String cedula){
        for (Persona persona : lista) {
            if(persona.getCedula().equals(cedula)){
                return persona;
            }
        }
        return null;
    }
    
    public void update(Persona persona){
        if(lista.contains(persona)){
            lista.remove(persona);
            lista.add(persona);
        }
    }
    
    public void delete(int codigo){
        for (Persona persona : lista) {
            if(persona.getCodigo() == codigo){
                lista.remove(persona);
                break;
            }
        }
    }
    
    public void imprimir(){
        for (Persona persona : lista) {
            System.out.println(persona.getNombre());
        }
    }
    
    
    
}
