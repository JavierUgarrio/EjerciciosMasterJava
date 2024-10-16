
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
        
        /*
            EJERCICIO 5

            Dado los siguientes arrays, hacer un bloque de código que construya un array de la siguiente manera:

            char[] cars1 = new char[]{‘1′,’2′,’3′,’4′,’5′,’6’};

            char[] cars2 = new char[]{‘a’,’e’,’r’,’t’,’y’,’u’};
            El array resultado que se debe de construir es el siguiente:

            char[] result = new char[]{‘1′,’a’,’2′,’e’,’3′,’r’,’4′,’t’,’5′,’y’,’6′,’u’};
        */
        char[] cars1 = new char[]{'1','2','3','4','5','6'};

        char[] cars2 = new char[]{'a','e','r','t','y','u'};
           
        char[] result = new char[12];
        
        // Usar un bucle para alternar los elementos entre cars1 y cars2
        for (int i = 0; i < cars1.length; i++) {
            // Copiar un elemento de cars1 en la posición 2*i de result
            System.arraycopy(cars1, i, result, 2 * i, 1);
            
            // Copiar un elemento de cars2 en la posición 2*i + 1 de result
            System.arraycopy(cars2, i, result, 2 * i + 1, 1);
        }

        // Imprimir el array result
        for (char res : result) {
            System.out.println("El array es " + res);
        }
        
        /*
            EJERCICIO 6

            Dado el siguiente array, crear un bloque de código que pinte, SOLO, las consonantes que existan en dicho array

            char[] letras = new char[]{‘2′,’f’,’f’,’u’,’u’,’g’,’h’,’i’,’4′};
        */
        char[] letras = new char[]{'2','f','f','u','u','g','h','i','4'};
       
  
            char [] vocales1 = new char[5];
            vocales[0]='a';
            vocales[1]='e';
            vocales[2]='i';
            vocales[3]='o';
            vocales[4]='u';
            
        for(char letra : letras){
            
            if(Character.isLetter(letra) == true){
                
                if(letra == 'a' ||letra == 'e'||letra == 'i'||letra == 'o'||letra == 'u'){
                    
                }else{
                    System.out.println(letra);
                }
            }
            
            
        }
        
        /*
            EJERCICIO 7
            
            Dado el siguiente array crear un bloque de código que sume todas las componentes del array, para ello hacer uso de un bucle que vaya obteniendo todos los valores del array

            float[] decimales = new float[]{3.4F,5.67F,12.0F,3.141615F,0.0F};
        */
        
        float[] decimales = new float[]{3.4F,5.67F,12.0F,3.141615F,0.0F};
        float total=0;
        for(float decimal : decimales){
            System.out.println(decimal);
            total +=decimal;
        }
        System.out.println(total);
        /*
            EJERCICIO 10

            Dado la siguiente matriz, crear un bloque de código que me pinte sus componentes de la siguiente manera:

            {3 4 5 78} {000 0} {1 1 1 1} {6 6 6 -1}

            El array bidimensional es el siguiente: int[][] numeros = new int[][]{ {3, 4, 5, 78},

            {0, 0, 0, 0}, {1, 1, 1, 1}, {6, 6, 6, -1} };
        */
    }
    
}
