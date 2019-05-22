/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controladores;

import ec.edu.ups.Modelo.Servicio;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Carlos
 */
public class ControladorServicio {
    private Set<Servicio> lista;
    private int codigo;

    public Set<Servicio> getLista(){
        return lista;
    }
    
    public int getCodigo() {
        return codigo;
    }
    
    public ControladorServicio() {
        lista = new HashSet<>();
        codigo = 1;
    }
    
    public void create(Servicio servicio){
        servicio.setCodigo(codigo);
        codigo++;
        lista.add(servicio);
    }
    
    public Servicio read(int codigo){
        for (Servicio servicio : lista) {
            if(servicio.getCodigo() == codigo){
                return servicio;
            }
        }
        return null;
    }
    
    public void update(Servicio servicio){
        if(lista.contains(servicio)){
            lista.remove(servicio);
            lista.add(servicio);
        }
    }
    
    public void delete(int codigo){
        for (Servicio servicio : lista) {
            if(servicio.getCodigo() == codigo){
                lista.remove(servicio);
                break;
            }
        }
    }
    
    public void imprimir(){
        for (Servicio servicio : lista) {
            System.out.println(servicio.getNombreservicio());
        }
    }
}
