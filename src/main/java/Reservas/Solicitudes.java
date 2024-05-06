/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reservas;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dasan
 */
public class Solicitudes {
    ArrayList<Object> SReservation;
    String[] columnNames = {"Nombre", "Correo Electronico", "Numero Telefono", "Numero Telefono 2","Metodo Pago",
                            "Hora Inicio","Hora Fin", "Dia", "Mes", "Anio", "Cancha", "Id. Reservacion"};
    String[][] ResList= new String[this.columnNames.length][12];
    
    //List<String> ResL;

//    public void fillHeader(){
//        for(int i = 0;i<this.columnNames.length;i++){
//            ResList[0][i]=columnNames[i];
//       }
//    };
    public Solicitudes(){
            for(int i = 0;i<this.columnNames.length;i++){
            ResList[0][i]=columnNames[i];
       }
}
    public Solicitudes(ArrayList<Object> ReservationF) {
        //only storages one reservation
        //use matrix as a list 
        SReservation = ReservationF;
        for(int i = 0;i<columnNames.length;i++){
            ResList[0][i]=columnNames[i];
        }
        System.out.println("in solicitudes.java: "+SReservation);
//        try{
//            FileOutputStream writeData = new FileOutputStream("reservations.resl");
//            try (ObjectOutputStream writeStream = new ObjectOutputStream(writeData)) {
//                writeStream.writeObject(SReservation);
//                writeStream.flush();
//            }
//
//        }catch (IOException e) {
//            System.out.println(e);
//}
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }

//    public Solicitudes() {
//        try{
//        FileInputStream readData = new FileInputStream("reservations.resl");
//            try (ObjectInputStream readStream = new ObjectInputStream(readData)) {
//                SReservation = (ArrayList<Object>) readStream.readObject();
//            }
//        System.out.println(SReservation.toString());
//    }catch (IOException | ClassNotFoundException e) {
//            System.out.println(e);
//    }
//    }
//    public void realizarReserva(){
//        
//    }
//    public void cancelarReserva(){
//        
//    }
}
    }