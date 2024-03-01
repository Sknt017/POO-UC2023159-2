/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Procedimientos;

/**
 *
 * @author dasan
 */
public final class Pago {
    //recibir, encapsular_/, almacenar.
    private Long CCNumero;
    private String titularCC;
    private int cCCV;

    public Pago(Long NCC, String nameTCC, int CCV) {
        CCNumero = NCC;
        titularCC = nameTCC;
        cCCV = CCV;
        System.out.print("in pay class...\n "+CCNumero);
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
    public void procederPagoEfectivo(){
        
    }
    
}
