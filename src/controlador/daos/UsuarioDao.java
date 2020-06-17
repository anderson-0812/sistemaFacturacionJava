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
import modelo.Usuario;

/**
 *
 * @author alex
 */
public class UsuarioDao extends DaoAdaptador<Usuario> {

    private Usuario usuario;

    public UsuarioDao() {
        super(Usuario.class, Conexion.getEm());
    }

    public Usuario getUsuario() {
        if (usuario == null) {
            usuario = new Usuario();
        }
        return usuario;
    }

    public void fijarInstancia(Usuario a) {
        this.usuario = a;
    }

    public void nuevaInstancia() {
        this.usuario = null;
    }

    public boolean guardar() {
        boolean band = false;
        try {
            this.getManager().getTransaction().begin();
            if (this.usuario.getId_usuario()== null) {
                this.guardar(usuario);
            }else{
                this.modificar(usuario);
            }
            this.getManager().getTransaction().commit();
            //this.getManager().close();
            band=true;
        } catch (Exception e) {
            System.out.println(e);
        }
        return band;
    }
    public Usuario obtenerUsuarioCedula(String cedula_usuario){
        Usuario u=null;
        try {
            String query = "select u from usuario u where u.cedula_usuario = ?";
            Query q = this.getManager().createQuery(query);
            q.setParameter(1, cedula_usuario);
            u = (Usuario)q.getSingleResult();
        } catch (Exception e) {
        }
        return u;
    }
    
    public boolean eliminarUsuario(Usuario objeto_usuario){
        boolean bandera = false;
        try {
            this.getManager().getTransaction().begin();
            if (objeto_usuario.getId_usuario()==null) {
                System.out.println("ERROR AL ELIMINAR NO HAY USUARIO");
                bandera=false;
            } else {
                this.eliminar(usuario);
                bandera = true;
            }
            this.getManager().getTransaction().commit();
        } catch (Exception e) {
            System.out.println(e);
        }
        return bandera;
    }
}
