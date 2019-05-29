/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.Modelo;

/**
 *
 * @author Domenica Cañizares
 */
public class FacturaDetalle {

    private Servicio serv;

    private int codigo;
    private int cantidad;
    private double subtotal2;
    private double total3;

    public FacturaDetalle() {
    }

    public FacturaDetalle(Servicio serv,int codigo, int cantidad, double subtotal2, double total3) {
        this.serv = serv;
        this.codigo = codigo;
        this.cantidad = cantidad;
        this.subtotal2 = subtotal2;
        this.total3 = total3;
    }
    
     public Servicio getServ() {
     return serv;
     }

     public void setServ(Servicio serv) {
     this.serv = serv;
     }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getSubtotal() {
        return subtotal2;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal2 = subtotal2;
    }

    public double getTotal() {
        return total3;
    }

    public void setTotal(double total) {
        this.total3 = total3;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.codigo;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final FacturaDetalle other = (FacturaDetalle) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "FacturaDetalle{" + "serv=" + serv + ", codigo=" + codigo + ", cantidad=" + cantidad + ", subtotal=" + subtotal2 + ", total=" + total3 + '}';
    }
    
    
}
