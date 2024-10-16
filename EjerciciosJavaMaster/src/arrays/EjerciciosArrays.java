
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
        
        int numerosEnt []= new int[5];
        numerosEnt[0]= 4;
        numerosEnt[1]= 5;
        numerosEnt[2]= 12;
        numerosEnt[3]= 33;
        numerosEnt[4]= 25;
        
        for(int numero: numerosEnt){
            
            if(numero%2 == 0){
                System.out.println("Es numero par: "+ numero);
            }else{
                System.out.println("Es numero impar: " + numero);
            }
            
            if(numero%3 == 0){
                System.out.println("Es multiplo de 3: " + numero);
            }
        }
        
        /*
            EJERCICIO 3

            Crear un bucle que pinte por consola todas las componentes de un array en orden inverso a como están guardadas en el array
        */
        
        int arrayOriginal [] = new int [5];
        arrayOriginal[0]= 1;
        arrayOriginal[1]= 2;
        arrayOriginal[2]= 3;
        arrayOriginal[3]= 4;
        arrayOriginal[4]= 5;
       
        for(int i = arrayOriginal.length -1; i>=0; i-- ){
            System.out.println(arrayOriginal[i]);
        }
        
        /*
            EJERCICIO 4

            Crear un bloque de código que recorra los siguientes arrays y me cree otro que contenga las componentes de ambos dos. Los arrays son los siguientes:

            int[] array1 = new int[]{1,2,3,4,5};

            int[] array2 = new int[]{334,23,4}; El array resultado es el siguiente:

            int[] array3 = new int[]{1,2,3,4,5,334,23,4};   
        
        */
        
        int[] array1 = new int[]{1,2,3,4,5};

        int[] array2 = new int[]{334,23,4}; //El array resultado es el siguiente:

        int [] array3 = new int[8];
        
        //uso el System.Arraycopy para copìar el primer array al creado
        
        System.arraycopy(array1,0, array3,0,array1.length);
        
        //uso el System.Arraycopy para copiar el segundo array, pero decido el indice donde se inicia la copia
        
        System.arraycopy(array2, 0, array3, 5, array2.length);
        
        for(int numeros : array3){
            System.out.println("el nuevo array: "+ numeros);
        }
        
    }
    
}
