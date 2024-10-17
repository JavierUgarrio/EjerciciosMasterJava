
package poo;

public class Animal {
    public int patas;
    public String nombre;
    public String tipo;
    
    //Constructor

    public Animal(int patas, String nombre, String tipo) {
        this.patas = patas;
        this.nombre = nombre;
        this.tipo = tipo;
    }
    
    //Get & Set

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    //toString

    @Override
    public String toString() {
        return "Animal{" + "patas=" + patas + ", nombre=" + nombre + ", tipo=" + tipo + '}';
    }
    
    
}
