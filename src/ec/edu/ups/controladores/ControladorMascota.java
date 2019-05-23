/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controladores;

import ec.edu.ups.Modelo.Mascota;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Byron PC
 */
public class ControladorMascota {
    private Set<Mascota> lista;
    private int codigo;

  public Set<Mascota> getLista(){
        return lista;
  }
  public int getCodigo() {
        return codigo;
    }
    
    public ControladorMascota() {
        lista = new HashSet<>();
        codigo = 1;
    }
        
     public void create(Mascota mascota){
        mascota.setCodigo(codigo);
        codigo++;
        lista.add(mascota);
    }
    
    public Mascota read(int codigo){
        for (Mascota mascota : lista) {
            if(mascota.getCodigo() == codigo){
                return mascota;
            }
        }
        return null;
    }
    
  
    
    public void update(Mascota mascota){
        if(lista.contains(mascota)){
            lista.remove(mascota);
            lista.add(mascota);
        }
    }
    
    public void delete(int codigo){
        for (Mascota mascota : lista) {
            if(mascota.getCodigo() == codigo){
                lista.remove(mascota);
                break;
            }
        }
    }
    
    public void imprimir(){
        for (Mascota mascota : lista) {
            System.out.println(mascota.getNombre());
        }
    }
    
}
