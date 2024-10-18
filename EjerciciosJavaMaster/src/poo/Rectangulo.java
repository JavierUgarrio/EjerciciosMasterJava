/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;


public class Rectangulo extends Figura {
    int alto;
    int ancho;
    
    //Constructor
    public Rectangulo(int coordenasX, int coordenasY){
        super(coordenasX, coordenasY);
    }
    
   public Rectangulo(int coordenadaX, int coordenadaY, int ancho, int alto) {
        super(coordenadaX, coordenadaY);  // Llamada al constructor de la superclase
        this.ancho = ancho;
        this.alto = alto;
    }
}
