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
import modelo.Cuenta;


/**
 *
 * @author alex
 */
public class CuentaDao extends DaoAdaptador<Cuenta> {

    private Cuenta cuenta;

    public CuentaDao() {
        super(Cuenta.class, Conexion.getEm());
    }

    public Cuenta getCuenta() {
        if (cuenta == null) {
            cuenta = new Cuenta();
        }
        return cuenta;
    }

    public void fijarInstancia(Cuenta a) {
        this.cuenta = a;
    }

    public void nuevaInstancia() {
        this.cuenta = null;
    }

    public boolean guardar() {
        boolean band = false;
        try {
            this.getManager().getTransaction().begin();
            if (this.cuenta.getId_cuenta()== null) {
                this.guardar(cuenta);
            }else{
                this.modificar(cuenta);
            }
            this.getManager().getTransaction().commit();
            //this.getManager().close();
            band=true;
        } catch (Exception e) {
            System.out.println(e);
        }
        return band;
    }
    public Cuenta obtenerCuentaUsername(String username){
        Cuenta c=null;
        try {
            String query = "select c from Cuenta c where c.username = ?";
            Query q = this.getManager().createQuery(query);
            q.setParameter(1, username);
            c = (Cuenta)q.getSingleResult();
        } catch (Exception e) {
        }
        return c;
    }
    
    public boolean eliminarCuenta(Cuenta objeto_cuenta){
        boolean bandera = false;
        try {
            this.getManager().getTransaction().begin();
            if (objeto_cuenta.getId_cuenta()==null) {
                System.out.println("ERROR AL ELIMINAR NO HAY CUENTA");
                bandera=false;
            } else {
                this.eliminar(cuenta);
                bandera = true;
            }
            this.getManager().getTransaction().commit();
        } catch (Exception e) {
            System.out.println(e);
        }
        return bandera;
    }
}
