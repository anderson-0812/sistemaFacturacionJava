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
@Table(name = "ccompra")
public class CCompra implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_compra;
    
    //DECLARACIÓN DE ATRIBUTOS
    @Column(name = "numero_factura", length = 200)
    private String numero_factura;
    
    @Column(name = "fecha_factura", length = 100)
    private String fecha_factura;
    
    @Column(name = "total")
    private double total; 
    
    @ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
    @JoinColumn(name = "proveedor", nullable = true, referencedColumnName = "id_proveedor")
    private Proveedor proveedor;

    public String getNumero_factura() {
        return numero_factura;
    }

    public void setNumero_factura(String numero_factura) {
        this.numero_factura = numero_factura;
    }

    public String getFecha_factura() {
        return fecha_factura;
    }

    public void setFecha_factura(String fecha_factura) {
        this.fecha_factura = fecha_factura;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public Long getId_compra() {
        return id_compra;
    }

    public void setId_compra(Long id_compra) {
        this.id_compra = id_compra;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id_compra != null ? id_compra.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id_compra fields are not set
        if (!(object instanceof CCompra)) {
            return false;
        }
        CCompra other = (CCompra) object;
        if ((this.id_compra == null && other.id_compra != null) || (this.id_compra != null && !this.id_compra.equals(other.id_compra))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.CCompra[ id=" + id_compra + " ]";
    }
    
}
