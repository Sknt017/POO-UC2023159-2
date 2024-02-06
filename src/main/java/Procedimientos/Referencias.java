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
    
    public static void main(String[]args){
        int number;
        ArrayList<String> numRF = new ArrayList<>();
        Random random = new Random();
        for(int i=0;i<10;i++){
            number = random.nextInt(10);
//            System.out.println(number);
            numRF.add(String.valueOf(number));
        }
        //System.out.println(numRF);
        //String RID = TextUtils.join(", ", List);
        String listString = String.join("-",numRF);
        System.out.println(listString);
    }
    public void obtenerReferencia(int Refe){
        
    }
    public int generarReferencia(){
        return 0;
    }
    
}
