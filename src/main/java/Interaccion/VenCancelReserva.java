/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interaccion;

import com.mycompany.poo.uc.POOUC;
import javax.swing.JOptionPane;

/**
 *
 * @author dasan
 */
public class VenCancelReserva extends javax.swing.JFrame {

    /**
     * Creates new form VenCancelReserva
     */
    public VenCancelReserva() {
        initComponents();
        this.jCanRes.setEnabled(false);
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
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jObtRef = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jResRet = new javax.swing.JTextArea();
        jVisualizar = new javax.swing.JButton();
        jCanRes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JBoAtras.setText("Atras");
        JBoAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBoAtrasActionPerformed(evt);
            }
        });

        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("No. de Referencia:");

        jObtRef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jObtRefActionPerformed(evt);
            }
        });

        jResRet.setColumns(20);
        jResRet.setRows(5);
        jScrollPane1.setViewportView(jResRet);

        jVisualizar.setText("Buscar");
        jVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jVisualizarActionPerformed(evt);
            }
        });

        jCanRes.setText("Can. Reserva");
        jCanRes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCanResActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JBoAtras)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jVisualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCanRes)
                .addGap(11, 11, 11)
                .addComponent(jButton1)
                .addGap(12, 12, 12))
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jObtRef, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jObtRef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBoAtras)
                    .addComponent(jButton1)
                    .addComponent(jVisualizar)
                    .addComponent(jCanRes))
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(496, 398));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JBoAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBoAtrasActionPerformed
        // TODO add your handling code here:
        this.regresar();
    }//GEN-LAST:event_JBoAtrasActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.cancelar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jObtRefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jObtRefActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jObtRefActionPerformed

    private void jVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jVisualizarActionPerformed
        // TODO add your handling code here:
        this.updateDetView();
    }//GEN-LAST:event_jVisualizarActionPerformed

    private void jCanResActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCanResActionPerformed
        // TODO add your handling code here:
        int response = JOptionPane.showConfirmDialog(null, "Do you want to proceed?", "Confirm", JOptionPane.YES_NO_OPTION);
        if (response == JOptionPane.YES_OPTION) {
            //System.out.println("You selected Yes.");
            this.cancelarReser();
        } else if (response == JOptionPane.NO_OPTION) {
            //System.out.println("You selected No.");
        }
    }//GEN-LAST:event_jCanResActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBoAtras;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jCanRes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jObtRef;
    private javax.swing.JTextArea jResRet;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jVisualizar;
    // End of variables declaration//GEN-END:variables

    private void regresar() {
        VentanaInicio VI = new VentanaInicio();
        VI.show();
        dispose();
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void cancelar() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        dispose();
    }

    private void updateDetView() {
        this.jResRet.setText("");
        String TargetReference = this.jObtRef.getText();
        String[] columnNames = {"Nombre", "Correo Electronico", "Numero Telefono", "Numero Telefono 2","Metodo Pago","Hora Inicio","Hora Fin", "Dia", "Mes", "Anio", "Cancha", "Id. Reservacion"};
        POOUC m = new POOUC();
        String ObtRes[] = m.getResT(TargetReference);
        if(ObtRes[1]==null){
            this.jResRet.append("No se encontro...");
            this.jCanRes.setEnabled(false);
        }else{
            for(int i = 0; i<11 ; i++){
                this.jResRet.append(columnNames[i]+": "+ObtRes[i]+"\n");    
            }
            this.jCanRes.setEnabled(true);
        }
        
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void cancelarReser() {
        String TargetReference = this.jObtRef.getText();
        //POOUC m = new POOUC();
        //int RefTar = Integer.parseInt(this.jObtRef.getText());
        POOUC.setResT(TargetReference);
        int b = JOptionPane.showConfirmDialog(rootPane, "Reserva Cancelada.", "Informacion", JOptionPane.CLOSED_OPTION, JOptionPane.INFORMATION_MESSAGE);
        this.regresar();
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
