/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pooAvanzado;

/**
 *
 * @author User
 */
public class Pantalon extends Ropa implements ArticuloVenta {
    
    String modelo;
    
    //Constructor

    public Pantalon(String talla, String color, String material, String modelo) {
        super(talla, color, material);
        this.modelo = modelo;
    }
    
    
    //Metodo Interface
    public float getPrecio(){
        return 10;
    }
    public String getProveedor(){
        return "ZARA";
    }
}
