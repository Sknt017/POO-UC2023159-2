/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Procedimientos;

import java.awt.List;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author dasan
 */
public class Referencias {
    StringBuilder ro = new StringBuilder();
    int number;
    ArrayList<String> numRF = new ArrayList<>();
    Random random = new Random();
//    public static void main(String[]args){
//        StringBuilder ro = new StringBuilder();
//        int number;
//        ArrayList<String> numRF = new ArrayList<>();
//        Random random = new Random();
//        for(int i=0;i<5;i++){
//            number = random.nextInt(5);
//            numRF.add(String.valueOf(number));
//            ro.append(String.valueOf(numRF.get(i)));
//        }
//        String RID = ro.toString();
//        String listString = String.join("-",numRF);
//        System.out.println(listString+"..."+RID);
//    }
    public void obtenerReferencia(int Refe){
        
    }
    public String generarReferencia(){
        for(int i=0;i<5;i++){
            number = random.nextInt(5);
            numRF.add(String.valueOf(number));
            ro.append(String.valueOf(numRF.get(i)));
        }
        String RID = ro.toString();
        String listString = String.join("-",numRF);
        System.out.println(listString+"..."+RID);
        return RID;
    }
}
