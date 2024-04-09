 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interaccion;

import Procedimientos.Referencias;
import Procedimientos.Reserva;
import Reservas.Solicitudes;
import java.util.Arrays;
import java.util.ArrayList;


/**
 *
 * @author dasan
 */
public class VenDetallesFin extends javax.swing.JFrame {
    /**
     * Creates new form VenDetallesFin
     */
    String nof,euf,RefRes;
    Long pnf,pn2f;
    ArrayList<String> Reservation = new ArrayList<>();
    //String[] ReservationF;
            
    /**
     *
     * @param UserD User Data Reservation (contact details)
     * @param ReseF User Reservation Details (stage, date and hours)
     */
    public VenDetallesFin(String[] UserD, String[] ReseF) {
        //Referencias re = new Referencias(); this better be called at the end of all the forms
        //String Ref = re.generarReferencia();
        
        for(int i = 0;UserD.length>i;i++){
            Reservation.add(UserD[i]);
        }
        for(int i = 0;ReseF.length>i;i++){
            Reservation.add(ReseF[i]);
        }
        initComponents();
        show();
        nof = UserD[0];
        euf = UserD[1]; 
        pnf = Long.valueOf(UserD[2]);
        pn2f = Long.valueOf(UserD[3]);
        this.jResumen.append("nombre Usuario: "+nof+"\nCorreo Electronico Registrado: "+euf+"\nnumero de contacto "+pnf+"\notro numero de contacto: "+pn2f/*+"\nNo. Reservacion: "+Ref*/);
        this.jResumen.append("\nDesde la(s): "+ReseF[0]+"\nHasta la(s): "+ReseF[1]+"\nEl: "+ReseF[2]+" / "+ReseF[3]+" / "+ReseF[4]+"\ncancha: "+ReseF[5]);
        System.out.println("whole reservation details: "+Reservation);
        this.jResumen.setEditable(false);
        Solicitudes RS = new Solicitudes();
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public VenDetallesFin(){
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
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jResumen = new javax.swing.JTextArea();

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

        jLabel1.setText("Detalles de la reserva:");

        jResumen.setColumns(20);
        jResumen.setRows(5);
        jScrollPane1.setViewportView(jResumen);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JBoAtras)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JBoSiguente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBoCancel)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE))
                .addGap(0, 34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBoCancel)
                    .addComponent(JBoSiguente)
                    .addComponent(JBoAtras))
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
        //this.irADatosContacto();
        dispose();
        this.nextS();

    }//GEN-LAST:event_JBoSiguenteActionPerformed

    private void jBoCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBoCancelActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jBoCancelActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new VenDetallesFin().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBoAtras;
    private javax.swing.JButton JBoSiguente;
    private javax.swing.JButton jBoCancel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextArea jResumen;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
    
    private void regresar() {
        VenMetodoPago vp = new VenMetodoPago();
        vp.setVisible(true);
        this.dispose();
//        System.out.print(nof);
//        System.out.print(euf);
//        System.out.print(pnf);
//        System.out.print(pn2f);
    }
    private void irADatosContacto() {
        VenDetallesFin vdf = new VenDetallesFin();
        //vdf.
//        System.out.print(nof);
//        System.out.print(euf);
//        System.out.print(pnf);
//        System.out.print(pn2f);
    }

    private void nextS() {
        //Create list and storage it on a file
        //go to the end of the project
        Referencias re = new Referencias();
        RefRes = re.generarReferencia();
        VenProcesoFin endPro = new VenProcesoFin(RefRes);
        this.dispose();
        endPro.show();
        this.setVisible(false);
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
