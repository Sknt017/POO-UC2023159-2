/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interaccion;

import Procedimientos.Pago;
import java.util.Arrays;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author dasan
 */
public class VenMetodoPago extends javax.swing.JFrame {

    /**
     * Creates new form VenMetodoPago
     */
    String[] UserDP,ReseFP;
    public VenMetodoPago() {
//        initComponents();
//        this.jBotPagEfe3.setEnabled(false);
//        this.jBotPagNeq.setEnabled(false);
//        this.CCnum.setEditable(false);
//        this.nameCC.setEditable(false);
//        this.jCCV.setEditable(false);
//        this.JcSiguiente.setEnabled(false);
    }

    public VenMetodoPago(String[] UserD, String[] ReseF) {
        System.out.println(Arrays.toString(UserD)+"\n"+Arrays.toString(ReseF));
        initComponents();
        show();
        this.jBotPagEfe3.setEnabled(false);
        this.jBotPagNeq.setEnabled(false);
        this.CCnum.setEditable(false);
        this.nameCC.setEditable(false);
        this.jCCV.setEditable(false);
        this.JcSiguiente.setEnabled(false);
        UserDP = UserD;
        ReseFP = ReseF;
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBotPagNeq = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jBotPagEfe3 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        CCnum = new javax.swing.JTextField();
        nameCC = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        JcSiguiente = new javax.swing.JToggleButton();
        jLabel5 = new javax.swing.JLabel();
        jCCV = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(480, 390));
        setPreferredSize(new java.awt.Dimension(480, 390));

        jBotPagNeq.setText("Pago Nequi");
        jBotPagNeq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotPagNeqActionPerformed(evt);
            }
        });

        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Atras");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jBotPagEfe3.setText("Pago Efectivo");
        jBotPagEfe3.setOpaque(true);
        jBotPagEfe3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotPagEfe3ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Tarjeta Credito", "Tarjeta Debito", "Efectivo", "Nequi" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Seleccionar Metodo Pago:");

        CCnum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CCnumActionPerformed(evt);
            }
        });

        jLabel2.setText("Numero CC:");

        jLabel3.setText("Titular CC : ");

        jLabel4.setText("CCV:");

        JcSiguiente.setText("Siguiente");
        JcSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JcSiguienteActionPerformed(evt);
            }
        });

        jLabel5.setText("datafono...");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(jLabel5)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jCCV, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(CCnum)
                                        .addComponent(jComboBox1, 0, 270, Short.MAX_VALUE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JcSiguiente)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jBotPagEfe3, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jBotPagNeq, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(24, 24, 24))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nameCC, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2))
                        .addContainerGap(275, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CCnum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jCCV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBotPagNeq, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBotPagEfe3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(JcSiguiente))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBotPagNeqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotPagNeqActionPerformed
        // TODO add your handling code here:
        this.pneq();
    }//GEN-LAST:event_jBotPagNeqActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.atras();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jBotPagEfe3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotPagEfe3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBotPagEfe3ActionPerformed

    private void JcSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JcSiguienteActionPerformed
        // TODO add your handling code here:
        this.siguiente();
    }//GEN-LAST:event_JcSiguienteActionPerformed

    private void CCnumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CCnumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CCnumActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        // TODO add your handling code here:
        this.habilitarOpcion();
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VenMetodoPago().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CCnum;
    private javax.swing.JToggleButton JcSiguiente;
    private javax.swing.JButton jBotPagEfe3;
    private javax.swing.JButton jBotPagNeq;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JTextField jCCV;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField nameCC;
    // End of variables declaration//GEN-END:variables

    private void pneq() {
        ImageIcon icon = new ImageIcon("src/qrneq.png");
        //JOptionPane.showConfirmDialog(JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE,icon);
        int a= JOptionPane.showConfirmDialog(this, "mostrar factura en caja", "Pago Nequi", JOptionPane.CLOSED_OPTION , JOptionPane.PLAIN_MESSAGE, icon);

        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void atras() {
        VentanaDatosContacto VNC = new VentanaDatosContacto();
        VNC.show();
        dispose();
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void siguiente() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        Long NCC = Long.valueOf(this.CCnum.getText());
        System.out.print("CCNum: "+ NCC +"\n");
        String nameTCC = this.nameCC.getText();
        System.out.print("CCName: "+ nameTCC +"\n");
        //char[] CCV = this.jCCV.getPassword();
        int CCV = Integer.parseInt(this.jCCV.getText());
        System.out.print("CCV: "+ CCV +"\n");
        Pago p = new Pago(NCC,nameTCC,CCV,UserDP,ReseFP);
        VenDetallesFin s = new VenDetallesFin();
        dispose();
    }

    private void habilitarOpcion() {
        //
        switch(this.jComboBox1.getSelectedIndex()){
            case 0 ->{
                this.jBotPagEfe3.setEnabled(false);
                this.jBotPagNeq.setEnabled(false);
                this.CCnum.setEditable(false);
                this.nameCC.setEditable(false);
                this.jCCV.setEditable(false);
                this.JcSiguiente.setEnabled(false);
            }
            case 1 ->{
                this.CCnum.setEditable(true);
                this.nameCC.setEditable(true);
                this.jCCV.setEditable(true);
                this.jBotPagEfe3.setEnabled(false);
                this.jBotPagNeq.setEnabled(false);
                this.JcSiguiente.setEnabled(true);
            }
            case 2 ->{
                this.CCnum.setEditable(true);
                this.nameCC.setEditable(true);
                this.jCCV.setEditable(true);
                this.jBotPagEfe3.setEnabled(false);
                this.jBotPagNeq.setEnabled(false);
                this.JcSiguiente.setEnabled(true);
            }
            case 3 ->{
                this.jBotPagEfe3.setEnabled(true);
                this.CCnum.setEditable(false);
                this.nameCC.setEditable(false);
                this.jCCV.setEditable(false);
                this.jBotPagNeq.setEnabled(false);
                this.JcSiguiente.setEnabled(true);
            }
            case 4 ->{
                this.jBotPagNeq.setEnabled(true);
                this.CCnum.setEditable(false);
                this.nameCC.setEditable(false);
                this.jCCV.setEditable(false);
                this.jBotPagEfe3.setEnabled(false);
                this.JcSiguiente.setEnabled(true);
            }



            
            
        }
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
