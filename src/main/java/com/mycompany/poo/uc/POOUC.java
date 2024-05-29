/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poo.uc;

import Interaccion.VentanaInicio;
import Reservas.Solicitudes;
import java.util.Arrays;

/**
 *
 * @author dasan
 */
public class POOUC {

    public static void main(String[] args) {
        String[] columnNames = {"Nombre", "Correo Electronico", "Numero Telefono", "Numero Telefono 2","Metodo Pago","Hora Inicio","Hora Fin", "Dia", "Mes", "Anio", "Cancha", "Id. Reservacion"};
        String ResT[][] = new String[12][12];
        for(int i = 0; i<12;i++){
            ResT[0][i] = columnNames[i];
        }
        System.out.println(Arrays.toString(ResT[0]));
        Solicitudes slc = new Solicitudes();
        System.out.println(slc.getSReservation());
        VentanaInicio n = new VentanaInicio();
        System.out.println("Project execution in progress...");
        System.out.println(slc.showResList(0));
        n.show();
    }
}
