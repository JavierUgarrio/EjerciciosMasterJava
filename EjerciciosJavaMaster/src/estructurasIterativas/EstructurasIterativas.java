
package estructurasIterativas;

/**
 *
 * @author User
 */
public class EstructurasIterativas {
    
    public static void main(String []args){
        
        /*
            EJERCICIO 1

            Calcular el factorial de 25
        */
        int num = 25;
        long factorial = 1;  

        int i = num;
        while (i > 1) {
            factorial *= i;
            i--;
        }

        System.out.println("El factorial de " + num + " es: " + factorial);
        
        /*
            EJERCICIO 2

            Calcular la potencia de 2 elevado a 8
        */
        
        double num1 =2;
        double it = 1;
        while(it <=8){
          
            it++;
            
            if(it == 8){
                double potencia = Math.pow(num1, it);
                System.out.println("la potencia de 2 elevado a 8 es: " + potencia);
            }
        }
       
        
        
    }
}
