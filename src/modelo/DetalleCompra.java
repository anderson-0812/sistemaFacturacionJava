/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author anderson
 */
@Entity
@Table(name = "detalleCompra")
public class DetalleCompra implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_detalle_compra;
    
    //DECLARACIÓN DE ATRIBUTOS
    @Column(name = "cantidad")
    private int cantidad;
    
    @Column(name = "detalle_compra", length = 200)
    private String detalle_compra;
    
    @Column(name = "precio_unitario")
    private double precio_unitario;

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getDetalle_compra() {
        return detalle_compra;
    }

    public void setDetalle_compra(String detalle_compra) {
        this.detalle_compra = detalle_compra;
    }

    public double getPrecio_unitario() {
        return precio_unitario;
    }

    public void setPrecio_unitario(double precio_unitario) {
        this.precio_unitario = precio_unitario;
    }

    public double getSubtotal_parcial_compra() {
        return subtotal_parcial_compra;
    }

    public void setSubtotal_parcial_compra(double subtotal_parcial_compra) {
        this.subtotal_parcial_compra = subtotal_parcial_compra;
    }
    
    @Column(name = "subtotal_parcial_compra")
    private double subtotal_parcial_compra;

    public Long getId_detalle_compra() {
        return id_detalle_compra;
    }

    public void setId_detalle_compra(Long id_detalle_compra) {
        this.id_detalle_compra = id_detalle_compra;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id_detalle_compra != null ? id_detalle_compra.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id_detalle_compra fields are not set
        if (!(object instanceof DetalleCompra)) {
            return false;
        }
        DetalleCompra other = (DetalleCompra) object;
        if ((this.id_detalle_compra == null && other.id_detalle_compra != null) || (this.id_detalle_compra != null && !this.id_detalle_compra.equals(other.id_detalle_compra))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.DetalleCompra[ id=" + id_detalle_compra + " ]";
    }
    
}
