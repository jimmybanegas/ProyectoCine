/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Menú.Menu;
import Paneles.TotalCompraPanel;
import Peliculas.Horarios;
import Salas.Sala;
import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.FileNotFoundException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TotalCompra extends javax.swing.JFrame {
 
    public TotalCompra(String titulo, String horario, int sala, int codHorario) {
        initComponents();
        TotalCompraPanel back = new TotalCompraPanel();
        this.add(back,BorderLayout.CENTER);
        lblTitulo.setText(titulo);
        lblHorario.setText(horario);
        lblSala.setText(String.valueOf(sala));
        lblCodHorario.setText(String.valueOf(codHorario));
        this.pack();
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
        lblTitulo = new javax.swing.JLabel();
        lblHorario = new javax.swing.JLabel();
        lblSala = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblAdulto = new javax.swing.JLabel();
        lblTercera = new javax.swing.JLabel();
        lblMenor = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        subAdulto = new javax.swing.JLabel();
        subMenor = new javax.swing.JLabel();
        subTercera = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        granTotal = new javax.swing.JLabel();
        btnComprar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtTercera = new javax.swing.JTextField();
        txtMenor = new javax.swing.JTextField();
        txtAdulto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblCodHorario = new javax.swing.JLabel();

        setTitle("Ventana de Compra");
        setIconImage(getIconImage());
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText(" Titulo");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText(" Horario");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText(" Sala");

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));

        lblHorario.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblHorario.setForeground(new java.awt.Color(255, 255, 255));

        lblSala.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblSala.setForeground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("                           CANTIDAD Y TIPO DE BOLETO");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText(" Adulto");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText(" Menor de Edad");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText(" Tercera Edad");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText(" TIPO DE BOLETO");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("       CANTIDAD");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("PRECIO UNITARIO");

        lblAdulto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblAdulto.setForeground(new java.awt.Color(255, 255, 255));

        lblTercera.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblTercera.setForeground(new java.awt.Color(255, 255, 255));

        lblMenor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblMenor.setForeground(new java.awt.Color(255, 255, 255));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("     SUB TOTAL");

        subAdulto.setForeground(new java.awt.Color(255, 255, 255));

        subMenor.setForeground(new java.awt.Color(255, 255, 255));

        subTercera.setForeground(new java.awt.Color(255, 255, 255));
        subTercera.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                subTerceraFocusLost(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("       TOTAL:");

        granTotal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        granTotal.setForeground(new java.awt.Color(255, 255, 0));

        btnComprar.setText("Comprar");
        btnComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText(" Nombre");

        txtTercera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTerceraActionPerformed(evt);
            }
        });
        txtTercera.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTerceraFocusLost(evt);
            }
        });

        txtMenor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMenorActionPerformed(evt);
            }
        });
        txtMenor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtMenorFocusLost(evt);
            }
        });

        txtAdulto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAdultoActionPerformed(evt);
            }
        });
        txtAdulto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAdultoFocusLost(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Lps.");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Horario:");

        lblCodHorario.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnComprar))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtMenor, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(txtTercera, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(25, 25, 25))
                                        .addComponent(txtAdulto, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                    .addComponent(lblTercera, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                                    .addComponent(lblMenor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblAdulto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(subTercera, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                                        .addComponent(subMenor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(subAdulto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(granTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(101, 101, 101)
                                .addComponent(btnCancelar))))
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblSala, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(34, 34, 34)
                                    .addComponent(jLabel5)
                                    .addGap(18, 18, 18)
                                    .addComponent(lblCodHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(62, 62, 62))
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(328, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                    .addComponent(lblSala, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                    .addComponent(lblCodHorario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jLabel18)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAdulto, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(subAdulto, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAdulto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMenor, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(subMenor, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMenor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTercera, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(subTercera, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtTercera, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(granTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnComprar)
                    .addComponent(btnCancelar))
                .addGap(21, 21, 21))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-896)/2, (screenSize.height-518)/2, 896, 518);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.setVisible(false);
        JFrame frame = new ListPeliculas();
        frame.setVisible(true);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarActionPerformed
        try {
            String sala=lblSala.getText();
            String codHorario=lblCodHorario.getText();
            
            int cant=cantidad();
            if(cant==0){
                 JOptionPane.showMessageDialog(null, "COMPRE POR LO MENOS UN BOLETO"); 
                 return;
            }
            if(txtNombre.getText().equals("")){
                 JOptionPane.showMessageDialog(null, "DIGITE SU NOMBRE"); 
                 return;
            }
            //Extraigo la sala desde el archivo del horario, que será una copia de la sala numero x
            //Esto permite controlar cupos de salas de manera independiente por cada horario
            Horarios proye=Menu.getHorarioSalaEspecifico(Integer.parseInt(sala),Integer.parseInt(codHorario)); 
            int dispo=0;
            if(proye!=null){                
                boolean[][] asientos=proye.getSillas();                
                for(boolean []x:asientos){
                    for(boolean y: x){
                        if(y){
                            dispo++;
                        }
                    }
                }
                JOptionPane.showMessageDialog(null,"Cantidad de asientos disponibles: "+dispo);
            }
            
            if(proye!=null&&cant<=dispo){              
                JFrame frame = new SelectAsiento(proye.getFil(),proye.getCol(),proye.getSillas(),dispo,cant,proye.getCodHorario(),proye.getCodSala());
                frame.setVisible(true);
                this.setVisible(false);
            }                        
        } catch (FileNotFoundException ex) {
           JOptionPane.showMessageDialog(null,"Error: "+ex.getMessage());
        }
       
    }//GEN-LAST:event_btnComprarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            // TODO add your handling code here:
            Sala actual=Menu.getSala(Integer.parseInt(lblSala.getText()));
            
            lblAdulto.setText(String.valueOf(actual.getPrecio()));
            lblMenor.setText(String.valueOf(actual.getPrecio()/2));
            lblTercera.setText(String.valueOf(actual.getPrecio()-(actual.getPrecio()*0.035)));
        } catch (FileNotFoundException ex) {
              JOptionPane.showMessageDialog(null,"Error: "+ex.getMessage());
        }
        
        
    }//GEN-LAST:event_formWindowOpened

    private void txtAdultoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAdultoActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_txtAdultoActionPerformed

    private void txtMenorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMenorActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_txtMenorActionPerformed

    private void txtTerceraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTerceraActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_txtTerceraActionPerformed

    private void txtAdultoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAdultoFocusLost
        // TODO add your handling code here:
       if(!txtAdulto.getText().equalsIgnoreCase("")){ 
        double precio=Double.parseDouble(lblAdulto.getText());
        double cant=Double.parseDouble(txtAdulto.getText());
            subAdulto.setText(precio*cant+"");
            total();
       }
       else{
            subAdulto.setText("");
            total();
       }
    }//GEN-LAST:event_txtAdultoFocusLost

    private void txtMenorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMenorFocusLost
        // TODO add your handling code here:
      if(!txtMenor.getText().equalsIgnoreCase("")){ 
       double precio=Double.parseDouble(lblMenor.getText());
       double cant=Double.parseDouble(txtMenor.getText());
            subMenor.setText(precio*cant+"");
            total();
       } 
      else{
          subMenor.setText("");
          total();
      }
    }//GEN-LAST:event_txtMenorFocusLost

    private void txtTerceraFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTerceraFocusLost
        // TODO add your handling code here:
      if(!txtTercera.getText().equalsIgnoreCase("")){ 
        double precio=Double.parseDouble(lblTercera.getText());
        double cant=Double.parseDouble(txtTercera.getText());
            subTercera.setText(precio*cant+"");
            total();
       } 
      else{
          subTercera.setText("");
          total();
      }
    }//GEN-LAST:event_txtTerceraFocusLost

    private void subTerceraFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_subTerceraFocusLost
        // TODO add your handling code here:
        
    }//GEN-LAST:event_subTerceraFocusLost
    
    private void total(){
       if(subAdulto.getText().equals("") &&subMenor.getText().equals("") &&subTercera.getText().equals("")){
         granTotal.setText(String.valueOf(0)); 
       }
       else if(subMenor.getText().equals("")&&subTercera.getText().equals("")){
           double total=Double.parseDouble(subAdulto.getText());
           granTotal.setText(String.valueOf(total));  
       }
       else if(subAdulto.getText().equals("") &&subMenor.getText().equals("")){
           double total=Double.parseDouble(subTercera.getText());
           granTotal.setText(String.valueOf(total));  
       }
       else if(subAdulto.getText().equals("")&&subTercera.getText().equals("")){
            double total=Double.parseDouble(subMenor.getText());
            granTotal.setText(String.valueOf(total));    
       }
       else if(subTercera.getText().equals("")){
           double total=Double.parseDouble(subAdulto.getText())+Double.parseDouble(subMenor.getText());
           granTotal.setText(String.valueOf(total)); 
       }
       else if(subMenor.getText().equals("")){
           double total=Double.parseDouble(subAdulto.getText())+Double.parseDouble(subTercera.getText());
           granTotal.setText(String.valueOf(total)); 
       }
       else if(subAdulto.getText().equals("")){
           double total=Double.parseDouble(subMenor.getText())+Double.parseDouble(subTercera.getText());
           granTotal.setText(String.valueOf(total)); 
       }
       else if(!subAdulto.getText().equals("") &&!subMenor.getText().equals("") &&!subTercera.getText().equals("")){
            double total=Double.parseDouble(subAdulto.getText())+Double.parseDouble(subMenor.getText())+
            Double.parseDouble(subTercera.getText());
            granTotal.setText(String.valueOf(total));  
       }   
    }
    
     private int cantidad(){
              
       if(txtAdulto.getText().equals("") &&txtMenor.getText().equals("") &&txtTercera.getText().equals("")){
         return 0; 
       }
       else if(txtMenor.getText().equals("")&&txtTercera.getText().equals("")){
           int total=Integer.parseInt(txtAdulto.getText());
           return total;  
       }
       else if(txtAdulto.getText().equals("") &&txtMenor.getText().equals("")){
           int total=Integer.parseInt(txtTercera.getText());
           return total;    
       }
       else if(txtAdulto.getText().equals("")&&txtTercera.getText().equals("")){
            int total=Integer.parseInt(txtMenor.getText());
            return total;    
       }
       else if(txtTercera.getText().equals("")){
            int total=Integer.parseInt(txtAdulto.getText())+Integer.parseInt(txtMenor.getText());
            return total;   
       }
       else if(txtMenor.getText().equals("")){
           int total=Integer.parseInt(txtAdulto.getText())+Integer.parseInt(txtTercera.getText());
           return total;   
       }
       else if(txtAdulto.getText().equals("")){
           int total=Integer.parseInt(subMenor.getText())+Integer.parseInt(txtTercera.getText());
           return total;  
       }
       else if(!txtAdulto.getText().equals("") &&!txtMenor.getText().equals("") &&!txtTercera.getText().equals("")){
            int total=Integer.parseInt(txtAdulto.getText())+Integer.parseInt(txtMenor.getText())+Integer.parseInt(txtTercera.getText());
            return total;             
       }else{
           return 0;
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
            java.util.logging.Logger.getLogger(TotalCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TotalCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TotalCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TotalCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            //    new TotalCompra().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnComprar;
    private javax.swing.JLabel granTotal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblAdulto;
    private javax.swing.JLabel lblCodHorario;
    private javax.swing.JLabel lblHorario;
    private javax.swing.JLabel lblMenor;
    private javax.swing.JLabel lblSala;
    private javax.swing.JLabel lblTercera;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel subAdulto;
    private javax.swing.JLabel subMenor;
    private javax.swing.JLabel subTercera;
    private javax.swing.JTextField txtAdulto;
    private javax.swing.JTextField txtMenor;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTercera;
    // End of variables declaration//GEN-END:variables
}
