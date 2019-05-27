/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controladores;

import ec.edu.ups.Modelo.Veterinario;
import java.util.HashSet;
import java.util.Set;


/**
 *
 * @author Carlos
 */
public class ControladorVeterinario {
    private Set<Veterinario> lista;
    private int codigo;
    // Constructor\\\\\\\\\\\\\\\\\\\\\\
  public ControladorVeterinario() {
        lista = new HashSet<>();
        codigo = 1;
    }
    public int getCodigo(){
        return codigo;
    }
 public Veterinario readCedula(String cedula){
        for(Veterinario cliente : lista){
            if(cliente.getCedula().equals(cedula))
                return cliente;
        }
        return null;
    }
    public Set<Veterinario> getLista() {
        return lista;
    }
    /////////CRUD\\\\\\\\\\
    public void create(Veterinario objeto) {
        
        objeto.setCodigo(codigo);
         codigo++;
        lista.add(objeto);
       
    }
    public Veterinario read(int codigo) {
        for (Veterinario cliente : lista) {
            if (cliente.getCodigo() == codigo) {
                return cliente;
            }
        }
        return null;
    }
    public void update(Veterinario objeto) {
        for (Veterinario cliente : lista) {
           
            if(cliente.equals(objeto)){
                lista.remove(cliente);
                lista.add(objeto);
                break;
            }
        }
    }
    public void delete(int codigo) {
        for (Veterinario cliente : lista) {
           
            if(cliente.getCodigo()== codigo){
                lista.remove(cliente);
                break;
            }
        }
    }
}
