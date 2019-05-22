/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controladores;

import ec.edu.ups.Modelo.Factura;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Domenica Cañizares
 */
public class ControladorFactura {
    private Set<Factura> lista;
    private int codigo;

    public int getCodigo() {
        return codigo;
    }
    
    public Set<Factura> getFactura(){
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
    
  
}
