/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pooAvanzado;

/**
 *
 * @author User
 */
public class Camisa extends Ropa implements ArticuloVenta{
    
    //Constructor
    public Camisa(String talla, String color, String material){
        super(talla, color,material);
    }
    
    //Metodo Interface
    public float getPrecio(){
        return 25;
    }
    public String getProveedor(){
        return "Sfera";
    }
}
