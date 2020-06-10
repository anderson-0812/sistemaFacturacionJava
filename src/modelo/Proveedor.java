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
@Table(name = "proveedor")
public class Proveedor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_proveedor;
    
    //DECLARACION DE ATRIBUTOS
    @Column(name="nombre_comercial", length = 200)
    private String nombre_comercial;
    
    @Column(name="cogigo_proveedor", length = 200)
    private int cogigo_proveedor;
    
    @Column(name="ruc", length = 200)
    private String ruc;
    
    @Column(name="telefono", length = 10)
    private String telefono;
    
    @Column(name="correo", length = 200)
    private String correo;
    
    @Column(name="entidad_bancaria", length = 200)
    private String entidad_bancaria;
    
    @Column(name="numero_cuenta", length = 200)
    private String numero_cuenta;
    
    @Column(name="direccion", length = 300)
    private String direccion;

    public String getNombre_comercial() {
        return nombre_comercial;
    }

    public void setNombre_comercial(String nombre_comercial) {
        this.nombre_comercial = nombre_comercial;
    }

    public int getCogigo_proveedor() {
        return cogigo_proveedor;
    }

    public void setCogigo_proveedor(int cogigo_proveedor) {
        this.cogigo_proveedor = cogigo_proveedor;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getEntidad_bancaria() {
        return entidad_bancaria;
    }

    public void setEntidad_bancaria(String entidad_bancaria) {
        this.entidad_bancaria = entidad_bancaria;
    }

    public String getNumero_cuenta() {
        return numero_cuenta;
    }

    public void setNumero_cuenta(String numero_cuenta) {
        this.numero_cuenta = numero_cuenta;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Long getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(Long id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id_proveedor != null ? id_proveedor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id_proveedor fields are not set
        if (!(object instanceof Proveedor)) {
            return false;
        }
        Proveedor other = (Proveedor) object;
        if ((this.id_proveedor == null && other.id_proveedor != null) || (this.id_proveedor != null && !this.id_proveedor.equals(other.id_proveedor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Proveedor[ id=" + id_proveedor + " ]";
    }
    
}
