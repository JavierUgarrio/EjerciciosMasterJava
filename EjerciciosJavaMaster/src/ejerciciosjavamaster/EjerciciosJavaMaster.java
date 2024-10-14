
package ejerciciosjavamaster;

import java.util.Scanner;


/**
 *
 * @author User
 */
public class EjerciciosJavaMaster {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
            EJERCICIO 1

            Devolver si un numero es par o impar
        */
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, introduzca un numero entero");
        int numero = sc.nextInt();
        int resultado = numero%2;
        if(resultado == 0 ){
            System.out.println("el numero es par");
        }else{
            System.out.println("el numero es impar");
        }
        
    }
    
}
