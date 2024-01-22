/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interaccion;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Date;
import Procedimientos.Canchas;
import Procedimientos.Horarios;
import java.util.Arrays;
import java.util.Calendar;

/**
 *
 * @author dasan
 */
public class VenSelCanYHor extends javax.swing.JFrame {

    /**
     * Creates new form VenSelCanYHor
     */
    public VenSelCanYHor() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JBoAtras = new javax.swing.JButton();
        JBoSiguente = new javax.swing.JButton();
        jBoCancel = new javax.swing.JButton();
        jOpt1 = new javax.swing.JComboBox<>();
        jCalendar2 = new com.toedter.calendar.JCalendar();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jCajaDesde = new javax.swing.JComboBox<>();
        jCajaHasta = new javax.swing.JComboBox<>();
        jCDDiaoTarde = new javax.swing.JComboBox<>();
        jCDDiaoTarde1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JBoAtras.setText("Atras");
        JBoAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBoAtrasActionPerformed(evt);
            }
        });

        JBoSiguente.setText("Siguente");
        JBoSiguente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBoSiguenteActionPerformed(evt);
            }
        });

        jBoCancel.setText("Cancelar");
        jBoCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBoCancelActionPerformed(evt);
            }
        });

        jOpt1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "seleccionar", "microfutbol", "voleibol", "basquetbol" }));
        jOpt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jOpt1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Canchas: ");

        jLabel2.setText("Desde: ");

        jLabel3.setText("Hasta:");

        jCajaDesde.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "4:00", "5:00", "6:00", "7:00" }));
        jCajaDesde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCajaDesdeActionPerformed(evt);
            }
        });

        jCajaHasta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "4:00", "5:00", "6:00", "7:00" }));
        jCajaHasta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCajaHastaActionPerformed(evt);
            }
        });

        jCDDiaoTarde.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AM", "PM" }));

        jCDDiaoTarde1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AM", "PM" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jOpt1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jCalendar2, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCajaDesde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCDDiaoTarde, 0, 1, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCajaHasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)
                                .addComponent(jCDDiaoTarde1, 0, 1, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JBoAtras)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JBoSiguente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBoCancel)
                        .addGap(6, 6, 6)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCalendar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jOpt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jCajaDesde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCDDiaoTarde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jCajaHasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCDDiaoTarde1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 163, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBoAtras)
                    .addComponent(JBoSiguente)
                    .addComponent(jBoCancel))
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(496, 398));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JBoAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBoAtrasActionPerformed
        // TODO add your handling code here:
        this.regresar();
    }//GEN-LAST:event_JBoAtrasActionPerformed

    private void JBoSiguenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBoSiguenteActionPerformed
        // TODO add your handling code here:
        this.irADatosContacto();
        
    }//GEN-LAST:event_JBoSiguenteActionPerformed

    private void jBoCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBoCancelActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jBoCancelActionPerformed

    
    private void jOpt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jOpt1ActionPerformed
        // TODO add your handling code here:
        this.TCancha();
    }//GEN-LAST:event_jOpt1ActionPerformed

    private void jCajaDesdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCajaDesdeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCajaDesdeActionPerformed

    private void jCajaHastaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCajaHastaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCajaHastaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VenSelCanYHor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBoAtras;
    private javax.swing.JButton JBoSiguente;
    private javax.swing.JButton jBoCancel;
    private javax.swing.JComboBox<String> jCDDiaoTarde;
    private javax.swing.JComboBox<String> jCDDiaoTarde1;
    private javax.swing.JComboBox<String> jCajaDesde;
    private javax.swing.JComboBox<String> jCajaHasta;
    private com.toedter.calendar.JCalendar jCalendar2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JComboBox<String> jOpt1;
    // End of variables declaration//GEN-END:variables

    private void regresar() {
        VentanaInicio sec1 = new VentanaInicio();
        sec1.show();
        dispose();
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void irADatosContacto() {
        Date PickedDate;int Sdia;
        Canchas cha = new Canchas();
        Horarios hor = new Horarios();
        Calendar calendar = Calendar.getInstance();
        VentanaDatosContacto sec3 = new VentanaDatosContacto();
        //usar instancia calendar para extraer de hor.fechareserva el mes y el año de la variable de tipo Date "fechaReserva"
        //usar hor.fechareserva instead of PickedDate variable
        int SelCan = TCancha();
        hor.fechaReserva = this.jCalendar2.getDate();
        PickedDate = this.jCalendar2.getDate();
        calendar.setTime(PickedDate);
        String Copt = String.valueOf(this.jOpt1.getSelectedItem());
        //System.out.print(hor.fechaReserva+"\n");
        System.out.print(String.valueOf(SelCan));
        Sdia = calendar.get(Calendar.DATE);
        System.out.print(" PickedDate day returns..  "+Sdia+" Stage picked... "+Copt);
        //System.out.print(Copt+"\n dia: "+Sdia);
        System.out.println ("\n"+Arrays.toString (Arrays.copyOfRange(cha.getDescripccionCancha(), SelCan,SelCan+1)/*cha.getDescripccionCancha()*/));
        //String Dcan = Arrays.toString (Arrays.copyOfRange(cha.getDescripccionCancha(), SelCan,SelCan+1));
        //new Canchas(hor.fechaReserva,Copt);
        
        
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        sec3.show();
        dispose();
    }

    private int TCancha() {
        int opt = this.jOpt1.getSelectedIndex();        
        return opt;
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
