/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

/**
 *
 * @author User
 */
public class Coche extends Vehiculo{
    int velocidad;
    
    public Coche(int ruedas, int alas, String motor, String gasolina, int velocidad) {
        super(ruedas, alas, motor, gasolina);
        this.velocidad = velocidad;
    }
    
    @Override
    public String consumo(){
        return super.consumo() +"km/h";
    }
}
