/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

/**
 *
 * @author Auditor3
 */
import java.awt.*;
import javax.swing.*;


public class ventana extends JFrame
{


public ventana() {

JPanel p= new JPanel();
p.setLayout(new BoxLayout(p,BoxLayout.Y_AXIS));



p.add( new Display());
p.add( new Display());

JScrollPane sc = new JScrollPane(p);

sc.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
sc.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
getContentPane().add(sc);

}


public static void main(String[] args)
{
ventana frame = new ventana();
frame.setTitle("UN JPanel DENTRO DE UN JScrollPane");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setSize(600,300);
frame.setVisible(true);
}
}
