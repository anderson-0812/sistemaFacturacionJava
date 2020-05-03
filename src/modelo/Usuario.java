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
@Table(name = "usuario")
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_usuario;
    //DECLARACIÓN DE ATRIBUTOS
    @Column(name="nombre_usuario", length = 200)
    private String nombre_usuario;
    
    @Column(name="apellido_usuario", length = 200)
    private String apellido_usuario;
    
    @Column(name="cedula_usuario", length = 10, unique = true)
    private String cedula_usuario;
    
    @Column(name="email_usuario", length = 200)
    private String email_usuario;
    
    @Column(name="email_usuario", length = 10)
    private String telefono_usuario;

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getApellido_usuario() {
        return apellido_usuario;
    }

    public void setApellido_usuario(String apellido_usuario) {
        this.apellido_usuario = apellido_usuario;
    }

    public String getCedula_usuario() {
        return cedula_usuario;
    }

    public void setCedula_usuario(String cedula_usuario) {
        this.cedula_usuario = cedula_usuario;
    }

    public String getEmail_usuario() {
        return email_usuario;
    }

    public void setEmail_usuario(String email_usuario) {
        this.email_usuario = email_usuario;
    }

    public String getTelefono_usuario() {
        return telefono_usuario;
    }

    public void setTelefono_usuario(String telefono_usuario) {
        this.telefono_usuario = telefono_usuario;
    }

    public Long getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Long id_usuario) {
        this.id_usuario = id_usuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id_usuario != null ? id_usuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id_usuario fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.id_usuario == null && other.id_usuario != null) || (this.id_usuario != null && !this.id_usuario.equals(other.id_usuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.usuario[ id=" + id_usuario + " ]";
    }
    
}
