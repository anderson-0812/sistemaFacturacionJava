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
@Table(name = "venta")
public class Venta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_venta;
    
    //DECLARACIÓN DE ATRIBUTOS
    @Column(name = "fecha_venta", length = 100)
    private String fecha_venta;
    
    @Column(name = "numero_venta")
    private int  numero_venta;
    
    @Column(name = "total_venta")
    private double total_venta;
    
    @Column(name = "iva_venta")
    private double iva_venta;
    
    @Column(name = "subtotal_venta")
    private double subtotal_venta;
    
    @Column(name = "subtotal_venta")
    private String descuento_venta;

    public Long getId_venta() {
        return id_venta;
    }

    public void setId_venta(Long id_venta) {
        this.id_venta = id_venta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id_venta != null ? id_venta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id_venta fields are not set
        if (!(object instanceof Venta)) {
            return false;
        }
        Venta other = (Venta) object;
        if ((this.id_venta == null && other.id_venta != null) || (this.id_venta != null && !this.id_venta.equals(other.id_venta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Venta[ id=" + id_venta + " ]";
    }
    
}
