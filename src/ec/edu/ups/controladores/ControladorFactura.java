/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controladores;

import ec.edu.ups.Modelo.FFactura;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Domenica Cañizares
 */
public class ControladorFactura {
    private Set<FFactura> lista;
    private int codigo;

    public int getCodigo() {
        return codigo;
    }
    
    public Set<FFactura> getFFactura(){
        return lista;
    }
    
    public ControladorFactura() {
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
    public void create(FFactura objeto){
        codigo ++;
        objeto.setRuc(codigo);
        lista.add(objeto);
    }
    
    //leer el codigo para buscar la factura
    public FFactura read(int codigo){
        for (FFactura fac : lista) {
            if (fac.getRuc()== codigo) {
                return fac;
            }
        }
        return null;
    }
    
    //eliminar la factura si contiene un error
    public void delete(int codigo){
        for (FFactura fac : lista) {
            if (fac.getRuc()== codigo){
                lista.remove(fac);
                break;
            }
        }
    }
}
