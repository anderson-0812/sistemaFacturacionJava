/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.modeloTablas;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import modelo.Cuenta;
import modelo.CuentasListar;


/**
 *
 * @author Usuario iTC
 */
public class ModeloTablaCuentas extends AbstractTableModel{
    private List<CuentasListar> lista = new ArrayList<CuentasListar>();

    public List<CuentasListar> getLista() {
        return lista;
    }

    public void setLista(List<CuentasListar> lista) {
        this.lista = lista;
    }
    
    
    @Override
    public int getRowCount() {
        return this.lista.size();
    }

    @Override
    public int getColumnCount() {
        return 7;
    }

    @Override
    public Object getValueAt(int fila, int columna) {
        CuentasListar c = this.lista.get(fila);
        switch (columna) {
            case 0:
                return c.getOrden();
            case 1:
                return c.getObj_cuenta().getUsername();
            case 2:
                return c.getObj_cuenta().getPassword();
            case 3:
                if (c.getObj_cuenta().isEstado_usuario()) {
                    return "ACTIVO";
                } else {
                    return "INACTIVO";
                }
            case 4:
                return c.getObj_cuenta().getObjeto_usuario().getNombre_usuario();
            case 5:
                return c.getObj_cuenta().getObjeto_usuario().getApellido_usuario();
            case 6:
                return c.getObj_cuenta().getObjeto_rol().getNombre_rol();
            default:
                return null;
        }
    }
    
    @Override
    public String getColumnName(int columna){
        switch (columna) {
            case 0:
                return "Nro.";
            case 1:
                return "Username";
            case 2:
                return "Password";
            case 3:
                return "Estado Cuenta";
            case 4:
                return "Nombres Usuario";
            case 5:
                return "Apellidos Usuario";
            case 6:
                return "Rol Usuario";
            default:
                return null;
        }
    }
    
}
