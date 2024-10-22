/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colecciones;

import java.util.*;


public class TestColecciones {
    
    public static void main(String [] args ){
       //Creo los objetos
        Coches car1 = new Coches("motor v8", "rojo", "discos de freno");
        Coches car2 = new Coches("motor diesel", "negro","disco de pastilla");
        Coches car3 = new Coches("motor 112cc", "verde", "discos de pastilla");

        Set Concesionario = new HashSet();
        Concesionario.add(car1);
        Concesionario.add(car2);
        Concesionario.add(car3);
        System.out.println(Concesionario);
        System.out.println("-------------------------------------------------------------------------------------------------------------------");
        // Recorriendo el HashSet con for
        for(Object coche: Concesionario){
            // hacemos un casting para asegurarnos que el objeto es igual a Coches
            Coches objCoche = (Coches) coche;
            System.out.println(coche);
        }
        System.out.println("-------------------------------------------------------------------------------------------------------------------");
        //Recorriendo el HashSet con iterator
        
        Iterator<Coches> iterator = Concesionario.iterator(); //El iterador permite recorrer (o "iterar") los elementos de la colección uno por uno.
        while(iterator.hasNext()){ //iterator.hasNext() verifica si hay más elementos para recorrer. Si hay al menos uno más, devuelve true; si no, devuelve false
            Coches coche = iterator.next(); //Dentro del bucle, se llama a iterator.next() para obtener el siguiente elemento de la colección.
            System.out.println(coche);
        }
    
    }
}
