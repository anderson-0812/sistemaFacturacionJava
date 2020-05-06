/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controlador.servicios;

import controlador.daos.RolDao;
import java.util.List;
import modelo.Rol;

/**
 *
 * @author jose
 */
public class ServicioRol {
    private RolDao dao;

    public ServicioRol() {
        dao = new RolDao();
    }
    public Rol getRol() {
        return dao.getRol();
    }
    public void fijarInstancia(Rol a) {
        dao.fijarInstancia(a);
    }
    public void nuevaInstancia() {
        dao.nuevaInstancia();
    }
    public boolean guardar() {
        return dao.guardar();
    }
    public List<Rol>listar(){
        return dao.enlistar("");
    }
    public List<Rol>listarCondicion(String condicion){
        return dao.enlistar(condicion);
    }
    public Rol obtenerId(Long id){
        return dao.obtenerPorId(id);
    }
    public Rol obtenerRolNombre(String nombre_rol){
        return dao.obtenerRolNombre(nombre_rol);
    }
    public List<Rol>buscar(String criterio, String texto){
        return dao.enlistar(" where "+criterio+" like CONCAT('"+texto+"','%')");
    }
    
    public boolean eliminar(Rol objeto_rol){
        return dao.eliminarRol(objeto_rol);
    }
}