/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author anderson
 */
@Entity
@Table(name = "detalleVenta")
public class DetalleVenta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_detalleVenta;
    
    @Column(name = "cantidad_producto", length = 20)
    private int cantidad_producto;
    
    @Column(name = "detalle_producto", length = 200)
    private String detalle_producto;
    
    @Column(name = "valor_unitario")
    private double valor_unitario;
    
    @Column(name = "subtotal_parcial")
    private double subtotal_parcial;
    
    @ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
    @JoinColumn(name = "id_venta_detalle", nullable = true, referencedColumnName = "id_venta")
    private Venta objetoVenta;
    
    @ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
    @JoinColumn(name = "id_producto", nullable = true, referencedColumnName = "id_producto")
    private Producto objetoProducto;

    public int getCantidad_producto() {
        return cantidad_producto;
    }

    public void setCantidad_producto(int cantidad_producto) {
        this.cantidad_producto = cantidad_producto;
    }

    public String getDetalle_producto() {
        return detalle_producto;
    }

    public void setDetalle_producto(String detalle_producto) {
        this.detalle_producto = detalle_producto;
    }

    public double getValor_unitario() {
        return valor_unitario;
    }

    public void setValor_unitario(double valor_unitario) {
        this.valor_unitario = valor_unitario;
    }

    public double getSubtotal_parcial() {
        return subtotal_parcial;
    }

    public void setSubtotal_parcial(double subtotal_parcial) {
        this.subtotal_parcial = subtotal_parcial;
    }

    public Venta getObjetoVenta() {
        return objetoVenta;
    }

    public void setObjetoVenta(Venta objetoVenta) {
        this.objetoVenta = objetoVenta;
    }

    public Producto getObjetoProducto() {
        return objetoProducto;
    }

    public void setObjetoProducto(Producto objetoProducto) {
        this.objetoProducto = objetoProducto;
    }

    public Long getId_detalleVenta() {
        return id_detalleVenta;
    }

    public void setId_detalleVenta(Long id_detalleVenta) {
        this.id_detalleVenta = id_detalleVenta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id_detalleVenta != null ? id_detalleVenta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id_detalleVenta fields are not set
        if (!(object instanceof DetalleVenta)) {
            return false;
        }
        DetalleVenta other = (DetalleVenta) object;
        if ((this.id_detalleVenta == null && other.id_detalleVenta != null) || (this.id_detalleVenta != null && !this.id_detalleVenta.equals(other.id_detalleVenta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.DetalleVenta[ id=" + id_detalleVenta + " ]";
    }
    
}
