/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.modeloTablas;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import modelo.Rol;

/**
 *
 * @author Usuario iTC
 */
public class ModeloTablaRol extends AbstractTableModel{
    private List<Rol> lista = new ArrayList<Rol>();

    public List<Rol> getLista() {
        return lista;
    }

    public void setLista(List<Rol> lista) {
        this.lista = lista;
    }
    
    
    @Override
    public int getRowCount() {
        return this.lista.size();
    }

    @Override
    public int getColumnCount() {
        return 1;
    }

    @Override
    public Object getValueAt(int fila, int columna) {
        Rol r = this.lista.get(fila);
        switch (columna) {
            case 0:
                return r.getNombre_rol();
            default:
                return null;
        }
    }
    
    @Override
    public String getColumnName(int columna){
        switch (columna) {
            case 0:
                return "Nombre Rol";
            default:
                return null;
        }
    }
    
}
