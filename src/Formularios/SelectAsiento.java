package Formularios;

import Menú.Menu;
import Paneles.PrepareSalaPanel;
import Peliculas.MiSeleccion;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class SelectAsiento extends javax.swing.JFrame {
 JButton buttons[][]; 
 ImageIcon habilitada = new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/SillaOcupada.jpg")).getImage());
 ImageIcon deshabilitada = new ImageIcon(new ImageIcon(getClass().getResource("/Imagenes/SillaLibre.jpg")).getImage());
 int dispo, cant,codHorario,codSala,fil,col;
   public SelectAsiento(int fil, int col, boolean[][]sillas,int dispo, int cant,int codHorario, int codSala) {
        initComponents();
        PrepareSalaPanel back = new PrepareSalaPanel();
        this.add(back,BorderLayout.CENTER);
        initUI(fil,col,sillas);
        this.dispo=dispo;
        this.cant=cant;
        this.codHorario=codHorario;
        this.codSala=codSala;
        this.fil=fil;
        this.col=col;
        
        this.pack();
       
    }

     private void initUI(int fil, int col, boolean[][]sillas) {    
       buttons =new JButton[fil][col];
       jPanel1.setBorder(BorderFactory.createEmptyBorder(fil, col, fil, col));     
       jPanel1.setSize(800,430);      
       
       jPanel1.setLayout(new GridLayout(fil, col));   
     
       
       for(int x=0;x<fil;x++){
          for(int y=0;y<col;y++){                  
             
              if(sillas[x][y]==true) {
                  buttons[x][y]=(new JButton(deshabilitada));
              }   
              else{
                buttons[x][y]=(new JButton());
              
                buttons[x][y].setVisible(false);
              } 
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
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lblDuracion = new javax.swing.JLabel();
        lblGenero = new javax.swing.JLabel();
        lblClasif = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        cmbHoras = new javax.swing.JComboBox();

        setTitle("Seleccionar Asientos");
        setIconImage(getIconImage());
        setPreferredSize(new java.awt.Dimension(992, 536));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
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

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText(" Fecha");

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 0, 0));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText(" Horarios");

        btnAceptar.setText("Aceptar");
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

        lblDuracion.setForeground(new java.awt.Color(255, 255, 255));

        lblGenero.setForeground(new java.awt.Color(255, 255, 255));

        lblClasif.setForeground(new java.awt.Color(255, 255, 255));

        lblFecha.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 652, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbHoras, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblDuracion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                                .addComponent(lblGenero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblClasif, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAceptar)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar)
                        .addGap(28, 28, 28)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lblClasif, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbHoras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(147, 147, 147)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCancelar)
                        .addGap(37, 37, 37))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnAceptar)
                        .addGap(58, 58, 58))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-928)/2, (screenSize.height-579)/2, 928, 579);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.setVisible(false);
        //JFrame frame = new TotalCompra();
       // frame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        Calendar actual=Calendar.getInstance();
            lblFecha.setText(actual.get(Calendar.DAY_OF_MONTH)+"/"+actual.get(Calendar.MONTH)+
                    "/"+actual.get(Calendar.YEAR)+" Hora: "+actual.get(Calendar.HOUR)+":"+actual.get(Calendar.MINUTE));
            
        MiSeleccion peli=Menu.getMipelicula();
        if(peli!=null){
            lblTitulo.setText(peli.getTitulo());
            lblDuracion.setText(peli.getDuracion());
            lblGenero.setText(peli.getGenero());
            lblClasif.setText(peli.getClasif());
            for(String x:peli.getHoras()){
                cmbHoras.addItem(x);
            }
        }    
            
            
    }//GEN-LAST:event_formWindowOpened

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        // TODO add your handling code here:
        int cambios=cambios(buttons);        
        boolean[][] nuevo=rees(buttons,fil,col);
        
        if(cambios==this.cant){
            try {
                if(Menu.reescribir(codSala,codHorario,nuevo)){
                  JOptionPane.showMessageDialog(null, "COMPRÓ: "+cant+" ASIENTOS"); 
                    try {
                        Menu.taquilla(cant,lblTitulo.getText());
                    } catch (IOException ex) {
                        Logger.getLogger(SelectAsiento.class.getName()).log(Level.SEVERE, null, ex);
                    }
                  this.setVisible(false);
                  JFrame extras=new Extras();
                  extras.setVisible(true);
                }
                else{
                   JOptionPane.showMessageDialog(null, "NO SE HIZO LA COMPRA");
                   this.setVisible(false);
                   JFrame prin=new MainWindow();
                   prin.setVisible(true);   
                }
            } catch (FileNotFoundException ex) {
                  JOptionPane.showMessageDialog(null,"Error: "+ex.getMessage());
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "SELECCCIONE: "+cant+" ASIENTOS");
        }
        
    }//GEN-LAST:event_btnAceptarActionPerformed
   @Override
    public Image getIconImage(){
        Image icono=Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/icono.png"));
       
        return icono;
    }
   
   public  boolean[][] rees( JButton[][] panel, int fil, int col){
      boolean asientos[][]=new boolean[fil][col] ;
      
        for(int x=0;x<fil;x++){
             for(int y=0;y<col;y++){   
                if(panel[x][y].getIcon()==deshabilitada){
                   asientos[x][y]=true;
                }
                if(panel[x][y].getIcon()==habilitada){
                   asientos[x][y]=false;
               }
             } 
        }
        return asientos; 
    }
    
    public int cambios(JButton[][] panel){
       int cont=0;
        for(JButton[] x:panel){
            for(JButton y:x){
                if(y.getIcon()==habilitada){
                    cont++;
                }
            }
        }
        return cont;
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
            java.util.logging.Logger.getLogger(SelectAsiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SelectAsiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SelectAsiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SelectAsiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               // new SelectAsiento().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox cmbHoras;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblClasif;
    private javax.swing.JLabel lblDuracion;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblGenero;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
