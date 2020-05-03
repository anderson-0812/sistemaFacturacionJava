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
@Table(name = "categoriaProducto")
public class CategoriaProducto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_categoria_producto;
    
    //DECLARACION DE ATRIBUTOS 
    @Column(name = "nombre_categoria", length = 200)
    private String nombre_categoria;
    
    @Column(name = "codigo")
    private int codigo;
    
    @Column(name = "descripcion_categoriap", length = 200)
    private String descripcion_categoriap;

    public String getNombre_categoria() {
        return nombre_categoria;
    }

    public void setNombre_categoria(String nombre_categoria) {
        this.nombre_categoria = nombre_categoria;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion_categoriap() {
        return descripcion_categoriap;
    }

    public void setDescripcion_categoriap(String descripcion_categoriap) {
        this.descripcion_categoriap = descripcion_categoriap;
    }

    public Long getId_categoria_producto() {
        return id_categoria_producto;
    }

    public void setId_categoria_producto(Long id_categoria_producto) {
        this.id_categoria_producto = id_categoria_producto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id_categoria_producto != null ? id_categoria_producto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id_categoria_producto fields are not set
        if (!(object instanceof CategoriaProducto)) {
            return false;
        }
        CategoriaProducto other = (CategoriaProducto) object;
        if ((this.id_categoria_producto == null && other.id_categoria_producto != null) || (this.id_categoria_producto != null && !this.id_categoria_producto.equals(other.id_categoria_producto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.CategoriaProducto[ id=" + id_categoria_producto + " ]";
    }
    
}
