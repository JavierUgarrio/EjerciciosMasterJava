
package poo;

public class Saludo {
    
    public String nombre;
    public String mencion;
    
    //Constructor
    
      public Saludo(String nombre, String mencion) {
        this.nombre = nombre;
        this.mencion = mencion;
    }
    
    //Get & Set
     public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMencion() {
        return mencion;
    }

    public void setMencion(String mencion) {
        this.mencion = mencion;
    }
      

    //Metodo Saludar
      
    public String saludar(String mencion, String nombre){
        return "Hola "+ mencion + " " + nombre;
    }
    
    //toString

    @Override
    public String toString() {
        return "Saludo{" + "nombre=" + nombre + ", mencion=" + mencion + '}';
    }

}
