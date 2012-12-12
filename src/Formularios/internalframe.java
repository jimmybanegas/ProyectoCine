/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Affisa-Jimmy
 */

 import java.awt.*;
public class internalframe extends JFrame {
   
public static void main(String[] args) {
internalframe frame = new internalframe();
Container container = frame.getContentPane();
int x=3; int y = 3;
container.setLayout(new GridLayout(x,y));
/*for(int i=0;i<x;i++) {
        for(int j=0;j<y;j++) {
        container.add(new JButton(i+" x " + j));
    }
    }*/
frame.setSize(400,300);
frame.setTitle("Curso de Java. GridLayout");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setVisible(true);
}
}
