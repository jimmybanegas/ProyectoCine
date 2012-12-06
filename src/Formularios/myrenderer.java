/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author Auditor3
 */
public class myrenderer extends JLabel implements TableCellRenderer {

    boolean isBordered = true;

    public myrenderer(boolean isBordered) {
        this.isBordered = isBordered;
        setOpaque(true);
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object color, boolean isSelected, boolean hasFocus, int row, int column) {
        // Va a mostrar el botón solo en la última fila.
        // de otra forma muestra un espacio en blanco.
        if (row == table.getModel().getRowCount() - 1) {
            return new JButton("Eliminar");
        } else {
            setBackground(new Color(0xffffff));
            return this;
        }
    }

   
}