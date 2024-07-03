/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poo.uc;

import Interaccion.VentanaInicio;
import Reservas.Solicitudes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author dasan
 */
public class POOUC {
private static String ResT[][] = new String[12][12];

    public static String[][] getResT() {
        return ResT;
    }

    public static void setResT(String[][] ResT) {
        POOUC.ResT = ResT;
    }
            public static void main(String[] args) {
        String[] columnNames = {"Nombre", "Correo Electronico", "Numero Telefono", "Numero Telefono 2","Metodo Pago","Hora Inicio","Hora Fin", "Dia", "Mes", "Anio", "Cancha", "Id. Reservacion"};
        System.arraycopy(columnNames, 0, ResT[0], 0, 12);
        System.out.println(Arrays.toString(ResT[0]));
        //Solicitudes slc = new Solicitudes();
        //System.out.println(slc.getSReservation());
        VentanaInicio n = new VentanaInicio();
        System.out.println("Project execution in progress...");
        n.show();
        /*//create a cli for administration*************************/
        //func exp excel:https://www.youtube.com/watch?v=FLLeDTtFBbQ
        POOUC.consIntera();
//        Scanner sc = new Scanner(System.in);
//        int opt;
//        do{
//        System.out.println("menu?.. ");
//        System.out.println("1. ");
//        System.out.println("2. ");
//        System.out.println("3. exit");
//        String com = sc.next();
//        System.out.println("read: "+com);
//        }while(opt!=3);
        System.out.println("Closing...");
        /*************************************************************
        */
        
        }
    

    public POOUC(ArrayList<Object> SReservation) {
        int a=1;
        for(int i = 0;i<a;i++){//potential logic bug
            if(ResT[a][0]!=null){
                a++;
            }
        }
        //System.arraycopy(SReservation, 0, ResT[0], a, 12);
        for(int j=0;j<12;j++){
            ResT[a][j]=(String) SReservation.get(j) ;
        }
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public POOUC(){}
    public static void consIntera(){
        Scanner sc = new Scanner(System.in);
        int opt = 0;
        do{
        //System.out.println("read: "+com);
        System.out.println("menu?.. ");
        System.out.println("1. ");
        System.out.println("2. ");
        System.out.println("3. exit");
        String com = sc.next();
        opt = Integer.parseInt(com);
        System.out.println("read: "+com);
        }while(opt!=3);
    }
    
}
