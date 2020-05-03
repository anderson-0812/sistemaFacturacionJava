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
@Table(name = "cuenta")
public class Cuenta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_cuenta;
    //DECLARACIÓN DE ATRIBUTOS
    @Column(name = "username", length = 100, unique = true)
    private String username;
    
    @Column(name = "password", length = 200, unique = true)
    private String password;
    
    @Column(name = "estado_usuario")
    private boolean estado;
    
    // el refresh actualiza los datos dependientes de su registro de relacion
    @ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
    @JoinColumn(name = "id_rol_cuenta", nullable = true, referencedColumnName = "id_rol")
    private Rol objeto_rol;
//    private Usuario objeto_usuario;

    public String getUsername() {
        return username;
    }

    public Rol getObjeto_rol() {
        return objeto_rol;
    }

    public void setObjeto_rol(Rol objeto_rol) {
        this.objeto_rol = objeto_rol;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Long getId_cuenta() {
        return id_cuenta;
    }

    public void setId_cuenta(Long id_cuenta) {
        this.id_cuenta = id_cuenta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id_cuenta != null ? id_cuenta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id_cuenta fields are not set
        if (!(object instanceof Cuenta)) {
            return false;
        }
        Cuenta other = (Cuenta) object;
        if ((this.id_cuenta == null && other.id_cuenta != null) || (this.id_cuenta != null && !this.id_cuenta.equals(other.id_cuenta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Cuenta[ id=" + id_cuenta + " ]";
    }
    
}
