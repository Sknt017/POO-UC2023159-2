/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Procedimientos;

import Interaccion.VentanaDatosContacto;
import java.util.Date;

/**
 *
 * @author dasan
 */
public class Horarios {
    // desplegar los datos recibidos del jframe form venselcanyhor aca
    // realizar lo mismo en canchas.java
    //***********************************************************************************
    //esta clase es para verififcar que la franja horaria seleccionada se encuentre disponible para reservar.
    //si no es asi devolvera un error para cambiar las horas de reservacion
    public Date fechaReserva;
    public int horasReserva;
    public Horarios(int Sdia, int Smes, int Sanio) {
        int Pdia = Sdia;
        int Pmes = Smes;
        int Panio = Sanio;
        int[] Fsel={Pdia,Pmes,Panio};
        //VentanaDatosContacto sec3 = new VentanaDatosContacto(Fsel);
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public Date obtenerFechasReserva(){
        return fechaReserva;
    }
    
}
