/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pooAvanzado;

/**
 *
 * @author User
 */
public class Ropa {
    String talla;
    String color;
    String material;
    
    //Constructor
    public Ropa(String talla, String color, String material) {
        this.talla = talla;
        this.color = color;
        this.material = material;
    }
    
    
    //Get & Set

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    
    //toString

    @Override
    public String toString() {
        return "Ropa{" + "talla=" + talla + ", color=" + color + ", material=" + material + '}';
    }
    
}
