/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controladores;

import ec.edu.ups.Modelo.FDetalle;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Domenica Cañizares
 */
public class ControladorFacDetalle {
     private Set<FDetalle> lista;
    private int codigo;

    public Set<FDetalle> getLista() {
        return lista;
    }

    public int getCodigo() {
        return codigo;
    }

    public ControladorFacDetalle() {
        lista= new HashSet<>();
        codigo = 0;
    }
    
    public String getFecha(){
        java.util.Date fecha = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        String fechaT = formatoFecha.format(fecha.getTime());
        return fechaT;
    }
    
    //crear un nuevo objeto en la lista
    public void create(FDetalle objeto){
        codigo ++;
        objeto.setCodigo(codigo);
        lista.add(objeto);
    }
    
    //leer el codigo para buscar la factura
    public FDetalle read(int codigo){
        for (FDetalle fac : lista) {
            if (fac.getCodigo()== codigo) {
                return fac;
            }
        }
        return null;
    }
    
    //eliminar la factura si contiene un error
    public void delete(int codigo){
        for (FDetalle fac : lista) {
            if (fac.getCodigo()== codigo){
                lista.remove(fac);
                break;
            }
        }
    }
}
