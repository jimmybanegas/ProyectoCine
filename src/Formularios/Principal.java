/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

/**
 *
 * @author Affisa-Jimmy
 */
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;


public class Principal extends JApplet {
 
 ArrayList<JPanel> paneles;
 int indice=0;
 JPanel panelPrincipal;
 JLabel panelActual;
 
    @Override
 public void init(){
  
  paneles=new ArrayList<>();
  
  panelActual=new JLabel("Estas en el Panel 1");
  panelActual.setFont(new Font("Verdana",Font.BOLD,14));
  
  for(int i=0;i<10;i++){
   JPanel p=new JPanel();
   p.setLayout(new BorderLayout());
   JButton bsiguiente=new JButton("Siguiente");
   bsiguiente.addActionListener(new ActionListener(){


    @Override
    public void actionPerformed(ActionEvent e) {
     if(indice<9){
      indice++;
      panelPrincipal.removeAll();
      panelPrincipal.add(paneles.get(indice));
      panelActual.setText("Estas en el Panel "+(indice+1));
      JPanel petiqueta=new JPanel();
      petiqueta.add(panelActual);
      panelPrincipal.add(petiqueta,BorderLayout.SOUTH);
      panelPrincipal.updateUI();
      panelPrincipal.repaint();
      repaint();
     }
    }
    
   });
   JButton batras=new JButton("Atras");
   batras.addActionListener(new ActionListener(){


    @Override
    public void actionPerformed(ActionEvent e) {
     if(indice>0){
      indice--;
      panelPrincipal.removeAll();
      panelPrincipal.add(paneles.get(indice));
      panelActual.setText("Estas en el Panel "+(indice+1));
      JPanel petiqueta=new JPanel();
      petiqueta.add(panelActual);
      panelPrincipal.add(petiqueta,BorderLayout.SOUTH);
      panelPrincipal.updateUI();
      panelPrincipal.repaint();
     }
    }
    
   });
   
//   ImageIcon img=new ImageIcon(this.getClass().getResource("../Imagenes/icono"+(i+1)+".png"));
   JPanel l=new Display();
   
   JPanel pbotones=new JPanel();
   
   pbotones.add(batras);
   pbotones.add(bsiguiente);
   
   p.add(pbotones,BorderLayout.NORTH);
   p.add(l);
   
   paneles.add(p);
   
  }
  
  panelPrincipal=new JPanel();
  panelPrincipal.setLayout(new BorderLayout());
  panelPrincipal.add(paneles.get(0));
  JPanel petiqueta=new JPanel();
  petiqueta.add(panelActual);
  panelPrincipal.add(petiqueta,BorderLayout.SOUTH);
  add(panelPrincipal);
  
 }
}