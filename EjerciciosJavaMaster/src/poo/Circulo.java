/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;


public class Circulo extends Figura {

    public double radio;
    
    //Constructor
    public Circulo(int coordenadaX, int coordenadaY) {
        super(coordenadaX, coordenadaY);
    }

    public Circulo(double radio, int coordenadaX, int coordenadaY) {
        super(coordenadaX, coordenadaY);
        this.radio = radio;
    }
    
    //metodo sobreescribir
    @Override
    public String posicionFigura(){
        return super.posicionFigura()+" , radio: " + radio;
    }
    
}
