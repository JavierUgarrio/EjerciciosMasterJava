
package arrays;

import java.util.*;


public class EjerciciosArrays {
    
    public static void main(String [] args){
        
        /*
            EJERCICIO 1

            Crear un bloque de código que pinte las vocales y solo las vocales que existen en un array de caracteres. 
            El programa debe de ir comprobando, con un bucle, para determinar si cada carácter del array es o no una vocal.
        */
        
        char vocales [] = new char [5];
        vocales[0]= 'a';
        vocales[1]= 'e';
        vocales[2]= 'i';
        vocales[3]= 'o';
        vocales[4]= 'u';
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Por favor, introduce un caracter");
        String entrada = sc.next(); // Se lee como un String 
        // Convertir la primera letra de la cadena en un char
        char caracter = entrada.charAt(0);
        
        for(char vocal : vocales){
            System.out.println("las vocales son: " + vocal);
            
        }
        
        for(char c =0; c < vocales.length; c++){
            if(caracter == vocales[c]){
                System.out.println("Es una vocal:" + caracter);
            }
        }
        
        /*
            EJERCICIO 2

            Crear un bloque de código que lea las componentes de un array de enteros y me pinte cuales con pares, cuales impares y cuales con múltiplos de tres. 
            Para este ejercicio utilizar un bucle que recorra el array y utilizar el operador %.
        */
        
    }
    
}
