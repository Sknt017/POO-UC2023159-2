/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Procedimientos;
/**
 *
 * @author dasan
 */
public class Reserva{
    public Reserva(String desdeHoraCB, String hastaHoraCB, int Sdia, int Smes, int Sanio, String Copt) {
        String HoraReservacion = desdeHoraCB;
        String HoraReservacionFin = hastaHoraCB;
        int diaReserva = Sdia;
        int mesReserva = Smes;
        int anioReserva = Sanio;
        String canchaReserva = Copt;
        String[] ResF = {HoraReservacion,HoraReservacionFin,String.valueOf(diaReserva),String.valueOf(mesReserva),String.valueOf(anioReserva),canchaReserva};
        
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
