/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.SystemColor;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public final class internalframe extends JFrame {
/**
 * Launch the application.
 */
public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
        @Override
        public void run() {
            try {
                internalframe frame = new internalframe();
                frame.setVisible(true);
                frame.pack(); 
            } catch (Exception e) {
            }
        }
    });
}

/**
 * Create the frame.
 */
public internalframe() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(100, 100, 778, 426);
    getContentPane().setLayout(null);

    JScrollPane scrollPane = new JScrollPane();
    scrollPane.setBounds(10, 101, 742, 276);
     
    getContentPane().add(scrollPane);

    JPanel borderlaoutpanel = new JPanel();
    scrollPane.setViewportView(borderlaoutpanel);
    borderlaoutpanel.setLayout(new BorderLayout(0, 0));

    JPanel columnpanel = new JPanel();
    borderlaoutpanel.add(columnpanel, BorderLayout.NORTH);
    columnpanel.setLayout(new GridLayout(0, 1, 0, 1));
    columnpanel.setBackground(Color.gray);
  
    String[] horas={"11:20","13:30","09:05"};
    JPanel a[]= new JPanel[3];
    a[0]=new Display("IMAGES\\argo.jpg","ARGO","1:20","ADULTOS","3D",horas);
    a[1]=new Display();
    a[2]=new Display();
    
    pintar(columnpanel, a);
     
     
    }

    public void pintar(JPanel columnpanel, JPanel[] display){
      // for(int i=0;i<1;i++) {
        JPanel rowPanel = new JPanel();
        rowPanel.setPreferredSize(new Dimension(500,300));
        columnpanel.add(rowPanel);
        rowPanel.setLayout(null);      
         rowPanel.removeAll();
        for(JPanel x:display){
             x.setBounds(50, 20, 500, 250);   
             rowPanel.add(x);
             rowPanel.repaint();
        }        
       
      
      //  if(i%2==0) {
          rowPanel.setBackground(SystemColor.inactiveCaptionBorder);
      //  }
        
    }
 
    
  }