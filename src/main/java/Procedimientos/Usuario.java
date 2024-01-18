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
public class Usuario {    
    public String nombreUsuario;
    public String correoElectronicoUsuario;
    public int numeroContacto1;
    public int numeroContacto2;

    public Usuario(String NombreU, String UEmail, int Tel1, int Tel2) {
        this.nombreUsuario = NombreU;
        this.correoElectronicoUsuario = UEmail;
        this.numeroContacto1 = Tel1;
        this.numeroContacto2 = Tel2;
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    public Usuario() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        new VenDetallesFin(nombreUsuario,correoElectronicoUsuario,numeroContacto1,numeroContacto2);
    }
    
    @Override
    public String toString() {
        return "Nombre: "+nombreUsuario+
                "\n Email: "+correoElectronicoUsuario+"\n Numero 1: "+numeroContacto1+"\n Numero 2: "+numeroContacto2;
    }
    
}
