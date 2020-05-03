/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author anderson
 */
@Entity
//usaremos anotaciones que son con un @delante
@Table(name="rol")
public class Rol implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_rol;
    
    // sobre cada atributo se le pone anotacion colum 
    //por cada atributo se le pone su jpa @column
    @Column(name = "name_rol", length = 200, unique = true)
    private String nombre_rol;

    // creamos relacion one tu many
    @OneToMany(mappedBy = "objeto_rol", cascade = CascadeType.ALL)
    private List<Cuenta> lista_cuentas = new ArrayList<Cuenta>(); 
    
    public String getNombre_rol() {
        return nombre_rol;
    }

    public List<Cuenta> getLista_cuentas() {
        return lista_cuentas;
    }

    public void setLista_cuentas(List<Cuenta> lista_cuentas) {
        this.lista_cuentas = lista_cuentas;
    }

    public void setNombre_rol(String nombre_rol) {
        this.nombre_rol = nombre_rol;
    }
    
    

    public Long getId_rol() {
        return id_rol;
    }

    public void setId_rol(Long id_rol) {
        this.id_rol = id_rol;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id_rol != null ? id_rol.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id_rol fields are not set
        if (!(object instanceof Rol)) {
            return false;
        }
        Rol other = (Rol) object;
        if ((this.id_rol == null && other.id_rol != null) || (this.id_rol != null && !this.id_rol.equals(other.id_rol))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Rol[ id=" + id_rol + " ]";
    }
    
}
