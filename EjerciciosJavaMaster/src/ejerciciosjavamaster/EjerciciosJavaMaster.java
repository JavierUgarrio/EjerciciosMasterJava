
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
        
        /*
            EJERCICIO 2

            Comparar dos números y decir cuál es el mayor
        */
        
        System.out.println("Por favor, introduce un numero");
        int num1 = sc.nextInt();
        System.out.println("Por favor, introduce un segundo numero");
        int num2 = sc.nextInt();
        
        if(num1 > num2){
            System.out.println("El primer numero introducido: "+ num1+ " es mayor que: "+ num2);
        }else if(num1 < num2){
            System.out.println("El primer numero introducido: "+ num1+ " es menor que: "+ num2);
        }else{
            System.out.println("los numeros son iguales");
        }
        
    }
    
}
