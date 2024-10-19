
package pooAvanzado;


public class Globo {
   static int referencia;
   
   //Constructor

    public Globo(int referencia) {
        this.referencia = referencia;
    }
   
    //Getter & Setter

    public static int getReferencia() {
        return referencia;
    }

    public static void setReferencia(int referencia) {
        Globo.referencia = referencia;
    }
    
    //toString

    @Override
    public String toString() {
        return "La referencia del globo: {" + this.referencia + '}';
    }
    
   
}
