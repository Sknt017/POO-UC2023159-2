/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Procedimientos;

import Interaccion.VenDetallesFin;
import Interaccion.VenMetodoPago;
import Interaccion.VentanaDatosContacto;
import com.mycompany.poo.uc.POOUC;

/**
 *
 * @author dasan
 */
public class Usuario extends POOUC{    
    VentanaDatosContacto vcu = new VentanaDatosContacto();
    private String nombreUsuario;
    private String correoElectronicoUsuario;
    private Long numeroContacto1;
    private Long numeroContacto2;

    //public Usuario(String NombreU, String UEmail, Long Tel1, Long Tel2) {
    //}

    public Usuario(String NombreU, String UEmail, Long Tel1, Long Tel2, String[] ReseF) {
        //Usuario usu = new Usuario();
        this.nombreUsuario = NombreU;
        this.correoElectronicoUsuario = UEmail;
        this.numeroContacto1 = Tel1;
        this.numeroContacto2 = Tel2;
        String[] UserD = {NombreU, UEmail, String.valueOf(Tel1), String.valueOf(Tel2)};
        VenMetodoPago sli5 =   new VenMetodoPago(UserD,ReseF);
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    //public Usuario() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    //}    
//    @Override
//    public String toString() {
//        Usuario usu = new Usuario();
//        return "Nombre: "+nombreUsuario+
//                "\n Email: "+correoElectronicoUsuario+"\n Numero 1: "+numeroContacto1+"\n Numero 2: "+numeroContacto2 ;
//    }
    
}
