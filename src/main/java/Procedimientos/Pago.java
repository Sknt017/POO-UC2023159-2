/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Procedimientos;

import Interaccion.VenDetallesFin;

/**
 *
 * @author dasan
 */
public final class Pago {
    //recibir, encapsular_/, almacenar.
    
    //add payment method to the arraylist
    private Long CCNumero;
    private String titularCC;
    private int cCCV;

    public Pago(Long NCC, String nameTCC, int CCV, String[] UserDP, String[] ReseFP) {
        CCNumero = NCC;
        titularCC = nameTCC;
        cCCV = CCV;
        //System.out.print("in pay class...\n "+CCNumero);
        VenDetallesFin sec4 =   new VenDetallesFin(UserDP,ReseFP);
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Pago(String[] UserDP, String[] ReseFP) {
        VenDetallesFin sec4 =   new VenDetallesFin(UserDP,ReseFP);
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Long getCCNumero() {
        return CCNumero;
    }

    public void setCCNumero(Long CCNumero) {
        this.CCNumero = CCNumero;
    }

    public String getTitularCC() {
        return titularCC;
    }

    public void setTitularCC(String titularCC) {
        this.titularCC = titularCC;
    }

    public int getCCV() {
        return cCCV;
    }

    public void setCCV(int CCV) {
        this.cCCV = CCV;
    }
    
    
    
    public void registrarDatosPago(){
        
    }
    public void procederPagoNequi(){
        
    }
    public boolean procederPagoEfectivo(){
        return true;
    }
    
}
