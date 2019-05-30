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
public class FDetalle {
    //cosas de la facturaD
    private int codigo;
    private int cantidad;
    private int totalCP;

    //clase
    private Servicio serv;
    
    public FDetalle() {
    }

    //constructor

    public FDetalle(int codigo, int cantidad, int totalCP, Servicio serv) {
        this.codigo = codigo;
        this.cantidad = cantidad;
        this.totalCP = totalCP;
        this.serv = serv;
    }

    //get and set
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

    public int getTotalCP() {
        return totalCP;
    }

    public void setTotalCP(int totalCP) {
        this.totalCP = totalCP;
    }

    public Servicio getServ() {
        return serv;
    }

    public void setServ(Servicio serv) {
        this.serv = serv;
    }

    @Override
    public int hashCode() {
        int hash = 5;
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
        final FDetalle other = (FDetalle) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "FDetalle{" + "codigo=" + codigo + ", cantidad=" + cantidad + ", totalCP=" + totalCP + ", serv=" + serv + '}';
    }
    
}
