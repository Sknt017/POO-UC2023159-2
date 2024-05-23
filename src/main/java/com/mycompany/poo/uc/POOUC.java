/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poo.uc;

import Interaccion.VentanaInicio;
import Reservas.Solicitudes;

/**
 *
 * @author dasan
 */
public class POOUC {

    public static void main(String[] args) {
        Solicitudes slc = new Solicitudes();
        System.out.println(slc.getSReservation());
        VentanaInicio n = new VentanaInicio();
        System.out.println("Project execution in progress...");
        System.out.println(slc.showResList(0));
        n.show();
    }
}
