/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Procedimientos;

/**
 *
 * @author dasan
 */
public class Usuario {    
    public String nombreUsuario;
    public String correoElectronicoUsuario;
    public int numeroContacto1;
    public int numeroContacto2;

    @Override
    public String toString() {
        return "Nombre: "+nombreUsuario+
                "\n Email: "+correoElectronicoUsuario+"\n Numero 1: "+numeroContacto1+"\n Numero 2: "+numeroContacto2;
    }
    
}
