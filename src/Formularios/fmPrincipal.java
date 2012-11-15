/**
 * @author : Miguel Salazar Reque
 * @email  : juan.salazar@outlook.com 
 */

package Formularios;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import javax.swing.JButton;

public class fmPrincipal extends javax.swing.JFrame{
    private JButton botones [];
    private int numBotones;
    
    public fmPrincipal() {
        initComponents();
        Dimension  pantalla = Toolkit .getDefaultToolkit().getScreenSize();
        int height = pantalla.height;
        int width = pantalla.width;
        //Establecemos un tamaño para la pantalla
        setSize(width/2, height/2);		
        //Centrando el JFrame
        setLocationRelativeTo(null);
        this.numBotones = 0;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panSuperior = new javax.swing.JPanel();
        lblDescripcion = new javax.swing.JLabel();
        txtNumBotones = new javax.swing.JTextField();
        btnProcesar = new javax.swing.JButton();
        panInferior = new javax.swing.JPanel();
        txtPantalla = new javax.swing.JTextField();
        panCentral = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panSuperior.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panSuperior.setLayout(new java.awt.GridLayout(1, 0));

        lblDescripcion.setText("Número de botones :");
        panSuperior.add(lblDescripcion);
        panSuperior.add(txtNumBotones);

        btnProcesar.setText("Procesar");
        btnProcesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcesarActionPerformed(evt);
            }
        });
        panSuperior.add(btnProcesar);

        getContentPane().add(panSuperior, java.awt.BorderLayout.PAGE_START);

        panInferior.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panInferior.setLayout(new java.awt.BorderLayout());
        panInferior.add(txtPantalla, java.awt.BorderLayout.CENTER);

        getContentPane().add(panInferior, java.awt.BorderLayout.PAGE_END);

        panCentral.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panCentral.setLayout(new java.awt.GridLayout(4, 4, 20, 20));
        getContentPane().add(panCentral, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProcesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcesarActionPerformed
        this.numBotones = Integer.parseInt(this.txtNumBotones.getText().trim());
        this.botones = new JButton[numBotones];
        this.inicializarBotones();
        this.btnProcesar.setEnabled(false);
    }//GEN-LAST:event_btnProcesarActionPerformed

    public void inicializarBotones() {
        for(int i=0;i<this.numBotones;i++){
            //Creamos los botones
            botones[i]= new JButton();
            //Le asignamos una variable al boton
            botones[i].setActionCommand(""+i);
            //Se le da un texto al boton
            botones[i].setText(""+i);
            //Agregamos el boton al panel central
            this.panCentral.add(botones[i]);
            
            //Establecemos los eventos del mouse
            botones[i].addMouseListener(new java.awt.event.MouseAdapter() {                    
                @Override
                public void mouseEntered(java.awt.event.MouseEvent evt) {                        
                    MouseEntered(evt);                    
                }
                @Override
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    MouseExited(evt);                   
                }                
            });
            //Se establece el evnto clic del boton
            botones[i].addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent evt) {
                    clicEvent(evt);
                }
            });
        }        
        this.show();
    }
    
    public void clicEvent(ActionEvent e) {
        this.txtPantalla.setText("");
        this.txtPantalla.setText("Soy el boton Nro : " + e.getActionCommand());
    }
    
    public void MouseEntered(MouseEvent evt)    {
        JButton evento = (JButton)evt.getSource();
        this.txtPantalla.setText("");
        this.txtPantalla.setText("Estas encima del boton Nro : " + evento.getText());
    }
    
    public void MouseExited(MouseEvent evt) {
        JButton evento = (JButton)evt.getSource();
        this.txtPantalla.setText("");
        this.txtPantalla.setText("Haz pasado sobre el boton Nro : " + evento.getText());
    }
    
    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fmPrincipal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnProcesar;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JPanel panCentral;
    private javax.swing.JPanel panInferior;
    private javax.swing.JPanel panSuperior;
    private javax.swing.JTextField txtNumBotones;
    private javax.swing.JTextField txtPantalla;
    // End of variables declaration//GEN-END:variables
}
