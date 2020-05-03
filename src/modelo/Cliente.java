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
@Table(name="cliente")
public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_cliente;
    
    //DECLARACION DE ATRIBUTOS 
    @Column(name="nombre_cliente", length = 200)
    private String nombre_cliente;
    
    @Column(name="apellidos_cliente", length = 200)
    private String apellidos_cliente;
    
    @Column(name="direccion_cliente", length = 200)
    private String direccion_cliente;
    
    @Column(name="telefono_cliente", length = 200)
    private String telefono_cliente;
    
    @Column(name="email_cliente", length = 200)
    private String email_cliente;
    
    @Column(name="cedula_cliente", length = 10, unique = true)
    private String cedula_cliente;
    
    @Column(name="ruc_cliente", length = 13, unique = true)
    private String ruc_cliente;

    public String getNombre_cliente() {
        return nombre_cliente;
    }

    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    public String getApellidos_cliente() {
        return apellidos_cliente;
    }

    public void setApellidos_cliente(String apellidos_cliente) {
        this.apellidos_cliente = apellidos_cliente;
    }

    public String getDireccion_cliente() {
        return direccion_cliente;
    }

    public void setDireccion_cliente(String direccion_cliente) {
        this.direccion_cliente = direccion_cliente;
    }

    public String getTelefono_cliente() {
        return telefono_cliente;
    }

    public void setTelefono_cliente(String telefono_cliente) {
        this.telefono_cliente = telefono_cliente;
    }

    public String getEmail_cliente() {
        return email_cliente;
    }

    public void setEmail_cliente(String email_cliente) {
        this.email_cliente = email_cliente;
    }

    public String getCedula_cliente() {
        return cedula_cliente;
    }

    public void setCedula_cliente(String cedula_cliente) {
        this.cedula_cliente = cedula_cliente;
    }

    public String getRuc_cliente() {
        return ruc_cliente;
    }

    public void setRuc_cliente(String ruc_cliente) {
        this.ruc_cliente = ruc_cliente;
    }

    public Long getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(Long id_cliente) {
        this.id_cliente = id_cliente;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id_cliente != null ? id_cliente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id_cliente fields are not set
        if (!(object instanceof Cliente)) {
            return false;
        }
        Cliente other = (Cliente) object;
        if ((this.id_cliente == null && other.id_cliente != null) || (this.id_cliente != null && !this.id_cliente.equals(other.id_cliente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Cliente[ id=" + id_cliente + " ]";
    }
    
}
