/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

/**
 *
 * @author User
 */
public class Vehiculo {
    int ruedas;
    int alas;
    String motor;
    String gasolina;

    public Vehiculo(int ruedas, int alas, String motor, String gasolina) {
        this.ruedas = ruedas;
        this.alas = alas;
        this.motor = motor;
        this.gasolina = gasolina;
    }
    
      
    public String consumo(){
        return "El consumo de gasoil es:" + gasolina;
    }
}
