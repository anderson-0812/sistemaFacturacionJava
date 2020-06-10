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
@Table(name = "producto")
public class Producto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_producto;
    
    //DECLARACIÓN DE ATRIBUTOS
    @Column(name = "nombre_producto", length = 200)
    private String nombre_producto;
    
    @Column(name = "codigo_producto")
    private int codigo_producto;
    
    @Column(name = "detalle_producto", length = 200)
    private String detalle_producto;
    
    @Column(name = "stock_producto", length = 200)
    private int stock_producto;
    
    @Column(name = "precio_unitario")
    private double precio_unitario;
    
//    @Column(name = "categoria_producto", length = 200)
//    private String categoria_producto;
    
    @ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
    @JoinColumn(name = "categoria_producto", nullable = true, referencedColumnName = "id_categoria_producto")
    private CategoriaProducto categoria_producto_obj;

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public int getCodigo_producto() {
        return codigo_producto;
    }

    public void setCodigo_producto(int codigo_producto) {
        this.codigo_producto = codigo_producto;
    }

    public String getDetalle_producto() {
        return detalle_producto;
    }

    public void setDetalle_producto(String detalle_producto) {
        this.detalle_producto = detalle_producto;
    }

    public int getStock_producto() {
        return stock_producto;
    }

    public void setStock_producto(int stock_producto) {
        this.stock_producto = stock_producto;
    }

    public double getPrecio_unitario() {
        return precio_unitario;
    }

    public void setPrecio_unitario(double precio_unitario) {
        this.precio_unitario = precio_unitario;
    }

    public CategoriaProducto getCategoria_producto_obj() {
        return categoria_producto_obj;
    }

    public void setCategoria_producto_obj(CategoriaProducto categoria_producto_obj) {
        this.categoria_producto_obj = categoria_producto_obj;
    }

    public Long getId_producto() {
        return id_producto;
    }

    public void setId_producto(Long id_producto) {
        this.id_producto = id_producto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id_producto != null ? id_producto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id_producto fields are not set
        if (!(object instanceof Producto)) {
            return false;
        }
        Producto other = (Producto) object;
        if ((this.id_producto == null && other.id_producto != null) || (this.id_producto != null && !this.id_producto.equals(other.id_producto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Producto[ id=" + id_producto + " ]";
    }
    
}
