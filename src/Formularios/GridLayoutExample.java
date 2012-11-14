/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;
import java.awt.GridLayout;
import javax.swing.*;
 
 
public class GridLayoutExample extends JFrame {
 
    public GridLayoutExample() { 
        initUI();
    }
 
    public final void initUI() {
        JPanel panel = new JPanel();
 
        panel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        panel.setLayout(new GridLayout(5, 5, 5, 5));             
       
        String buttons = null;      
       
        for (int i = 0; i < 20; i++) {          
            buttons=String.valueOf(i);    
            panel.add(new JButton(buttons));
        }
 
        add(panel);
 
        setTitle("GridLayout");
        setSize(350, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
 
    public static void main(String[] args) {
    
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
      
        SwingUtilities.invokeLater(new Runnable() { 
            public void run() { 
                GridLayoutExample ex = new GridLayoutExample();
                ex.setVisible(true);
            }
        });
    }
}

