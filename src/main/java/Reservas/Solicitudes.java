/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reservas;

import com.mycompany.poo.uc.POOUC;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author dasan
 */
public class Solicitudes{
    ArrayList<Object> SReservation;
    public Solicitudes() {
            System.out.println("");
        
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public Solicitudes (ArrayList<Object> ReservationF) {
        SReservation = ReservationF;
        //POOUC mc = new POOUC();
        //only storages one reservation
//        for(int i = 0;i<this.columnNames.length;i++){
//            ResList[0][i]=columnNames[i];
//        }
//        System.out.println(Arrays.toString(ResList[1]));
//        //use matrix as a list
//        for(int i = 0;i<columnNames.length;i++){
//            //SReservation.set(i, ResList[a][i]);
//            ResList[a][i] = (String) SReservation.get(i);
//        }
        System.out.println("in solicitudes.java: "+SReservation);
//        System.out.println("position: "+a);
        POOUC RL = new POOUC(SReservation);
//        for(int i = 0;i<a;i++){
//            if(ResList[a][0]!=null){
//                a++;
//            }
//        }
        //a++;
//        System.out.println(Arrays.toString(ResList[0])+"\n"+Arrays.toString(ResList[1])+"\n"+Arrays.toString(ResList[2]));
        //SReservation.g
        try{
            FileOutputStream writeData = new FileOutputStream("reservations.resl");
            try (ObjectOutputStream writeStream = new ObjectOutputStream(writeData)) {
//                writeStream.writeString(this.expMat());
                writeStream.flush();
            }

        }catch (IOException e) {
            System.out.println(e);
}
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

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

    private String[][] expMat() {
        //POOUC mc = new POOUC();
        String mcD[][] = POOUC.getResT();
        return mcD;
    }
    }



//    public ArrayList<Object> getSReservation() {
//        return SReservation;
//    }

//    public String[][] getResList(int a) {
//        return ResList[a][0];
//    }
    
//    public String showResList(int a){
//        String Value2D = this.ResList[1][a];
//        return Value2D;
//    }