/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Procedimientos;

import Interaccion.VenDetallesFin;
import Interaccion.VentanaDatosContacto;

/**
 *
 * @author dasan
 */
public class Usuario {    
    VentanaDatosContacto vcu = new VentanaDatosContacto();
    private String nombreUsuario;
    private String correoElectronicoUsuario;
    private Long numeroContacto1;
    private Long numeroContacto2;

    public Usuario(String NombreU, String UEmail, Long Tel1, Long Tel2) {
        //this(NombreU, UEmail, Tel1, Tel2, ReseF);
    }

    public Usuario(String NombreU, String UEmail, Long Tel1, Long Tel2, String[] ReseF) {
        this.nombreUsuario = NombreU;
        this.correoElectronicoUsuario = UEmail;
        this.numeroContacto1 = Tel1;
        this.numeroContacto2 = Tel2;
        String[] UserD = {NombreU, UEmail, String.valueOf(Tel1), String.valueOf(Tel2)};
        VenDetallesFin sec4 =   new VenDetallesFin(UserD,ReseF);
        //new VenDetallesFin(nombreUsuario,correoElectronicoUsuario,numeroContacto1,numeroContacto2);
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public Usuario() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }    
    @Override
    public String toString() {
        return "Nombre: "+nombreUsuario+
                "\n Email: "+correoElectronicoUsuario+"\n Numero 1: "+numeroContacto1+"\n Numero 2: "+numeroContacto2;
    }
    
}
