/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

/**
 *
 * @author User
 */
public class TestFiguras {
    public static void main(String []args){
        
        Circulo cir = new Circulo(2.14, 6,7);
        System.out.println(cir.posicionFigura());
        
        Coche ferrari = new Coche(4,0,"V8","diesel",240);
        System.out.println(ferrari.consumo());
    }
}
