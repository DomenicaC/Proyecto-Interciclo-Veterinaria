/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.Modelo;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Domenica Cañizares
 */
public class FFactura {
    //cosas factura
    private int ruc;
    private Date fecha;
    private double Subtotal;
    private double iva;
    private double total;
    
    //clases 
    private Veterinario vet;
    private Cliente cli;
    private Mascota masc;
    private List<FDetalle> detalle;

    public FFactura() {
        detalle = new ArrayList<>();
        fecha = new Date();
        iva = 0.12;
    }

    public FFactura(int ruc, Date fecha, double Subtotal, double iva, double total, Veterinario vet, Cliente cli, Mascota masc, List<FDetalle> detalle) {
        this.ruc = ruc;
        this.fecha = fecha;
        this.Subtotal = Subtotal;
        this.iva = iva;
        this.total = total;
        this.vet = vet;
        this.cli = cli;
        this.masc = masc;
        this.detalle = detalle;
    }

    public int getRuc() {
        return ruc;
    }

    public void setRuc(int ruc) {
        this.ruc = ruc;
    }

    public String getFecha() {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        String fechaTexto = formato.format(fecha.getTime());
        return fechaTexto;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getSubtotal() {
        return Subtotal;
    }

    public void setSubtotal(double Subtotal) {
        this.Subtotal = Subtotal;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Veterinario getVet() {
        return vet;
    }

    public void setVet(Veterinario vet) {
        this.vet = vet;
    }

    public Cliente getCli() {
        return cli;
    }

    public void setCli(Cliente cli) {
        this.cli = cli;
    }

    public Mascota getMasc() {
        return masc;
    }

    public void setMasc(Mascota masc) {
        this.masc = masc;
    }

    public List<FDetalle> getDetalle() {
        return detalle;
    }

    public void setDetalle(List<FDetalle> detalle) {
        this.detalle = detalle;
    }
    
    public void añadirFacDetalle(FDetalle facturaDetalle){
        detalle.add(facturaDetalle);
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + this.ruc;
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
        final FFactura other = (FFactura) obj;
        if (this.ruc != other.ruc) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "FFactura{" + "ruc=" + ruc + ", fecha=" + fecha + ", Subtotal=" + Subtotal + ", iva=" + iva + ", total=" + total + ", vet=" + vet + ", cli=" + cli + ", masc=" + masc + ", detalle=" + detalle + '}';
    }
}
