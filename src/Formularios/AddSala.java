
package Formularios;

import Menú.Menu;
import Paneles.AddSalaPanel;
import Salas.TipoFormato;
import Salas.TipoSala;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class AddSala extends javax.swing.JFrame {
    public JButton[][] buttons;
   
    ImageIcon habilitada = new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/SillaOcupada.jpg")).getImage());
    ImageIcon deshabilitada = new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/SillaLibre.jpg")).getImage());
    public static RandomAccessFile rCod;
        
    public AddSala() {
        initComponents();
        AddSalaPanel back = new AddSalaPanel();        
        this.add(back,BorderLayout.CENTER);     
        this.pack();
        lblCodSala.setText(String.valueOf(AddSala.codSala()));
        combo2D3D.addItem(TipoSala.NORMAL);
        combo2D3D.addItem(TipoSala.SALA3D);
        comboTipo3D.addItem(TipoFormato.DIGITAL);
        comboTipo3D.addItem(TipoFormato.REAL);
        comboTipo3D.addItem(TipoFormato.EXTREME);
    }
    
    @Override
    public Image getIconImage(){
        Image icono=Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/icono.png"));       
        return icono;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtFilasSala = new javax.swing.JTextField();
        txtColumnasSala = new javax.swing.JTextField();
        combo2D3D = new javax.swing.JComboBox();
        comboTipo3D = new javax.swing.JComboBox();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lblCodSala = new javax.swing.JLabel();
        btnAsientos = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setTitle("Agregar Salas");
        setIconImage(getIconImage());
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("                                                  AREGAR SALA");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText(" Numero de Sala");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText(" Cantidad de Filas");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Cantidad de Columnas");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Tipo de Sala");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Tipo de 3D");

        txtColumnasSala.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtColumnasSalaFocusLost(evt);
            }
        });

        combo2D3D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo2D3DActionPerformed(evt);
            }
        });

        btnAceptar.setText("Guardar y Terminar Edicion");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        lblCodSala.setForeground(new java.awt.Color(255, 255, 255));

        btnAsientos.setText("Generar Asientos");
        btnAsientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsientosActionPerformed(evt);
            }
        });

        jPanel1.setPreferredSize(new java.awt.Dimension(800, 430));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 652, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(btnAsientos, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelar)
                        .addGap(39, 39, 39)
                        .addComponent(btnAceptar))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblCodSala, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(comboTipo3D, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGap(52, 52, 52)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtColumnasSala, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(combo2D3D, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtFilasSala, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(143, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 652, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCodSala, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                        .addGap(6, 6, 6)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFilasSala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtColumnasSala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combo2D3D, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboTipo3D, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar)
                    .addComponent(btnCancelar)
                    .addComponent(btnAsientos))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-706)/2, (screenSize.height-780)/2, 706, 780);
    }// </editor-fold>//GEN-END:initComponents

     public  JButton[][] initUI(int fil, int col) {         
      jPanel1.setBorder(BorderFactory.createEmptyBorder(fil, col, fil, col));     
      jPanel1.setSize(800,430);           
      buttons = new JButton [fil][col];
      
      jPanel1.setLayout(new GridLayout(fil, col));   
      jPanel1.removeAll();
       
       for(int x=0;x<fil;x++){
          for(int y=0;y<col;y++){                  
              
               buttons[x][y]=(new JButton());   
               buttons[x][y].setIcon(habilitada);
               buttons[x][y].setSize(25,22);
               
               buttons[x][y].addMouseListener(new java.awt.event.MouseAdapter() {                    
                @Override
               public void mouseEntered(java.awt.event.MouseEvent evt) {                                          
                }
                @Override
                public void mouseExited(java.awt.event.MouseEvent evt) {                  
                }                
                });
            buttons[x][y].addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent evt) {
                    clicEvent(evt);
                }
            }); 
              jPanel1.add(buttons[x][y]);       
          }
       }
       return buttons;
    }  
    public void clicEvent(ActionEvent e) {   
      JButton evento = (JButton)e.getSource();
      if(evento.getIcon()==habilitada){
          evento.setIcon(deshabilitada);   
          evento.repaint();   
      }
      else if(evento.getIcon()==deshabilitada){
           evento.setIcon(habilitada);                        
           evento.repaint();             
       }          
    
    }
    
    
       
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.setVisible(false);
        restar();
        JFrame frame = new Administrador();
        frame.setVisible(true);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       
    }//GEN-LAST:event_formWindowOpened

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        // TODO add your handling code here:
        if(lblCodSala.getText().equals("")||txtFilasSala.getText().equals("")||txtColumnasSala.getText().equals("")||
                jPanel1.getComponentCount()==0){
                JOptionPane.showMessageDialog(null, "No deben haber campos vacíos"); 
                return;
        }
        int cod=Integer.parseInt(lblCodSala.getText());
        TipoSala tipo=(TipoSala) combo2D3D.getSelectedItem();
        int filas=Integer.parseInt(txtFilasSala.getText());
        int columnas=Integer.parseInt(txtColumnasSala.getText());
        TipoFormato format=(TipoFormato) comboTipo3D.getSelectedItem();
     
        boolean[][] sillas= arregloAsiento(buttons,filas,columnas);
     
               
        if(sillas.length==0){
                JOptionPane.showMessageDialog(null, "No deben haber campos vacíos"); 
                return;
        }
        
      if( comboTipo3D.isEnabled()==false){                
            try {
                Menu.agregarSalaNormal(cod, tipo,filas, columnas,sillas);
            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Error"); 
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Error"); 
         }
      }else if(comboTipo3D.isEnabled()) {
            try {    
                Menu.agregarSala3D(cod, tipo, format, filas, columnas,sillas);
            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Error"); 
            } catch (IOException ex) {
                 JOptionPane.showMessageDialog(null, "Error"); 
            }
      }

      JFrame frame = new OperacionOk();
      frame.setVisible(true);
      this.setVisible(false);
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void combo2D3DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo2D3DActionPerformed
        // TODO add your handling code here:
        
        if(combo2D3D.getSelectedItem().equals(TipoSala.NORMAL)){
            comboTipo3D.disable();
        }
        else if(combo2D3D.getSelectedItem().equals(TipoSala.SALA3D)){
             comboTipo3D.enable();
        }
    }//GEN-LAST:event_combo2D3DActionPerformed

    private void btnAsientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsientosActionPerformed
        // TODO add your handling code here:
        if(txtFilasSala.getText().equals("")||txtColumnasSala.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Llene filas y columnas"); 
                return;
        } 
        initUI(Integer.parseInt(txtFilasSala.getText()),Integer.parseInt(txtColumnasSala.getText()));
        
    }//GEN-LAST:event_btnAsientosActionPerformed

    private void txtColumnasSalaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtColumnasSalaFocusLost
        // TODO add your handling code here:
         
    }//GEN-LAST:event_txtColumnasSalaFocusLost

       
    public boolean[][] arregloAsiento( JButton[][] panel, int fil, int col){
      boolean asientos[][]=new boolean[fil][col] ;
      
        for(int x=0;x<fil;x++){
             for(int y=0;y<col;y++){   
                if(panel[x][y].getIcon()==deshabilitada){
                   asientos[x][y]=false;
                }
                if(panel[x][y].getIcon()==habilitada){
                   asientos[x][y]=true;
               }
             } 
        }
        return asientos; 
    }
    
    
     public static int codSala(){          
        File u=new File("Salas");
         u.mkdir(); 
         try{
            rCod = new RandomAccessFile( new File("Salas\\codigosala.movi"),"rw");
            int codigo = 1;
            
            if( rCod.length() == 4){
                codigo = rCod.readInt();
                rCod.seek(0);
            }
            
            rCod.writeInt(codigo + 1);
            return codigo;
        }
        catch(IOException e){
            JOptionPane.showMessageDialog(null, "Error"); 
            return -1;
        }
    }
    
    public static void restar() {
        try {
            rCod.seek(0);
            rCod.writeInt(codSala()-1);
        } catch (IOException ex) {
           JOptionPane.showMessageDialog(null, "Error"); 
        }
        
    }
         /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
         
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddSala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddSala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddSala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddSala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AddSala().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnAsientos;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox combo2D3D;
    private javax.swing.JComboBox comboTipo3D;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCodSala;
    private javax.swing.JTextField txtColumnasSala;
    private javax.swing.JTextField txtFilasSala;
    // End of variables declaration//GEN-END:variables
    

  
}
