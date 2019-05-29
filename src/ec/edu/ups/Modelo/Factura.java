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
public class Factura {

    private double iva;
    private double total;
    private int ruc;
    private Date fecha;
    private Cliente cliente;
    private Veterinario vet;
    private Mascota masc;
    private List<FacturaDetalle> detalle;
    private double subtotal;

    public Factura() {
        detalle = new ArrayList<>();
        fecha = new Date();
        iva = 0.12;
    }

    //contructor
    public Factura(double iva, double total, int ruc, Date fecha, Cliente cliente, Veterinario vet, Mascota masc, List<FacturaDetalle> detalle, double subtotal) {
        this.iva = iva;
        this.total = total;
        this.ruc = ruc;
        this.fecha = fecha;
        this.cliente = cliente;
        this.vet = vet;
        this.masc = masc;
        this.detalle = detalle;
        this.subtotal = subtotal;
    }

    public Factura(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public void facDetalleA(FacturaDetalle facD) {
        detalle.add(facD);
    }

    public List<FacturaDetalle> getDetalles() {
        return detalle;
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

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Veterinario getVet() {
        return vet;
    }

    public void setVet(Veterinario vet) {
        this.vet = vet;
    }

    public Mascota getMasc() {
        return masc;
    }

    public void setMasc(Mascota masc) {
        this.masc = masc;
    }

    public List<FacturaDetalle> getDetalle() {
        return detalle;
    }

    public void setDetalle(List<FacturaDetalle> detalle) {
        this.detalle = detalle;
    }

    public void añadirFacturaDetalle(FacturaDetalle facturaDetalle) {
        detalle.add(facturaDetalle);
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + this.ruc;
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
        final Factura other = (Factura) obj;
        if (this.ruc != other.ruc) {
            return false;
        }
        return true;
    }

    public void delete(int codigo) {
        for (int i = 0; i < detalle.size(); i++) {
            if (detalle.get(i).getCodigo() == codigo) {
                detalle.remove(i);
            }
        }
    }

    @Override
    public String toString() {
        return "Factura{" + "iva=" + iva + ", total=" + total + ", ruc=" + ruc + ", fecha=" + fecha + ", cliente=" + cliente + ", vet=" + vet + ", masc=" + masc + ", detalle=" + detalle + ", subtotal=" + subtotal + '}';
    }
    
    
}
