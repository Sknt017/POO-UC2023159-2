/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interaccion;

import Procedimientos.Usuario;

/**
 *
 * @author dasan
 */
public class VenDetallesFin extends javax.swing.JFrame {
    /**
     * Creates new form VenDetallesFin
     */
        //String uf, ef;
        //int nf, n2f;

    public VenDetallesFin(String nombreUsuario, String correoElectronicoUsuario, int numeroContacto1, int numeroContacto2) {
        //Usuario u = new Usuario();
        final String nof = nombreUsuario;
        final String euf = correoElectronicoUsuario; 
        final int pnf = numeroContacto1;
        final int pn2f = numeroContacto2;
        initComponents();
        System.out.print("""
                         
                         nof && else: """+nof+" "+euf+" "+pnf+" "+pn2f);
        this.setdata(euf, euf, pnf, pn2f);
        //this.jLabel2.setText(nombreUsuario+correoElectronicoUsuario+String.valueOf(numeroContacto1)+String.valueOf(numeroContacto2));
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    //private final String nombreU = nof;
    public VenDetallesFin(){
        //Usuario u = new Usuario();
        initComponents();
//        this.jLabel2.setText(u.nombreUsuario);//+correoElectronicoUsuario+String.valueOf(numeroContacto1)+String.valueOf(numeroContacto2));
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
        jLabel2 = new javax.swing.JLabel();

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

        jLabel2.setText("jLabel2");

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
                .addGap(12, 12, 12))
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBoAtras)
                    .addComponent(JBoSiguente)
                    .addComponent(jBoCancel))
                .addContainerGap())
        );

        pack();
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

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        Usuario u = new Usuario();
//        String Nu = u.nombreUsuario;
//        String Eu = u.correoElectronicoUsuario;
//        int nu1=u.numeroContacto1;
//        int nu2=u.numeroContacto2;
//        System.out.print(nu2);
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
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
    
    private void regresar() {
    }

    private void irADatosContacto() {
    }
//    VenDetallesFin(String NombreU, String UEmail, int Tel1, int Tel2) {
//        initComponents();
//        this.jLabel2.setText(NombreU+UEmail+String.valueOf(Tel1)+String.valueOf(Tel2));
//        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }

    private void setdata(String uf,String ef,int nf,int n2f) {
        System.out.print("\n"+uf);
        this.jLabel2.setText(uf+ef+String.valueOf(nf)+String.valueOf(n2f));
        
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
