/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.daos;


import controlador.Conexion;
import java.util.List;
import javax.persistence.Query;
import javax.swing.JOptionPane;
import modelo.Rol;

/**
 *
 * @author alex
 */
public class RolDao extends DaoAdaptador<Rol> {

    private Rol rol;

    public RolDao() {
        super(Rol.class, Conexion.getEm());
    }

    public Rol getRol() {
        if (rol == null) {
            rol = new Rol();
        }
        return rol;
    }

    public void fijarInstancia(Rol a) {
        this.rol = a;
    }

    public void nuevaInstancia() {
        this.rol = null;
    }

    public boolean guardar() {
        boolean band = false;
        try {
            this.getManager().getTransaction().begin();
            if (this.rol.getId_rol()== null) {
                this.guardar(rol);
            }else{
                this.modificar(rol);
            }
            this.getManager().getTransaction().commit();
            //this.getManager().close();
            band=true;
        } catch (Exception e) {
            System.out.println(e);
        }
        return band;
    }
    public Rol obtenerRolNombre(String nombre_rol){
        Rol r=null;
        try {
            String query = "select r from Rol r where r.nombre_rol = ?";
            Query q = this.getManager().createQuery(query);
            q.setParameter(1, nombre_rol);
            r = (Rol)q.getSingleResult();
        } catch (Exception e) {
        }
        return r;
    }
    
    public boolean eliminarRol(Rol objeto_rol){
        boolean bandera = false;
        try {
            this.getManager().getTransaction().begin();
            if (objeto_rol.getId_rol()==null) {
                System.out.println("ERROR AL ELIMINAR NO HAY ROL");
                bandera=false;
            } else {
                this.eliminar(rol);
                bandera = true;
            }
            this.getManager().getTransaction().commit();
        } catch (Exception e) {
            System.out.println(e);
        }
        return bandera;
    }
}
