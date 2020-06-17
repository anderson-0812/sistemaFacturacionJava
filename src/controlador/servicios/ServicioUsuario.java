/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controlador.servicios;


import controlador.daos.UsuarioDao;
import java.util.List;
import modelo.Usuario;


/**
 *
 * @author macbookpro
 */
public class ServicioUsuario {
    private UsuarioDao dao;

    public ServicioUsuario() {
        dao = new UsuarioDao();
    }
    public Usuario getUsuario() {
        return dao.getUsuario();
    }
    public void fijarInstancia(Usuario a) {
        dao.fijarInstancia(a);
    }
    public void nuevaInstancia() {
        dao.nuevaInstancia();
    }
    public boolean guardar() {
        return dao.guardar();
    }
    public List<Usuario>listar(){
        return dao.enlistar("");
    }
    public List<Usuario>listarCondicion(String condicion){
        return dao.enlistar(condicion);
    }
    public Usuario obtenerId(Long id){
        return dao.obtenerPorId(id);
    }
    public Usuario obtenerUsuarioCedula(String cedula_usuario){
        return dao.obtenerUsuarioCedula(cedula_usuario);
    }
    public List<Usuario>buscar(String criterio, String texto){
        return dao.enlistar(" where "+criterio+" like CONCAT('"+texto+"','%')");
    }
    
    public boolean eliminar(Usuario objeto_usuario){
        return dao.eliminarUsuario(objeto_usuario);
    }
}