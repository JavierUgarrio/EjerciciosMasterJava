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
       System.out.println("-------------------------------------------------------------------------------------------------------------------");
    
       Personas persona1 = new Personas(1209873,"Alvaro","de los pinos",12 );
       Personas persona2 = new Personas(2349203,"Mateo","de los pinos",10 );
       Personas persona3 = new Personas(7845230,"Elena","Martin",9 );
       
       ArrayList<Personas>hermanos = new ArrayList<>();
       hermanos.add(persona1);
       hermanos.add(persona2);
       hermanos.add(persona3);
       
       System.out.println(hermanos);
       System.out.println("-----------------------------------Recorrer con For ---------------------------------------------------------------");
       //Recorrer con for
       for(int i = 0; i < hermanos.size(); i++){
           Object dni =  hermanos.get(i);
           System.out.println(dni);
       }
       System.out.println("-----------------------------------Recorrer con For each----------------------------------------------------------------");
       //Recorrer con for each
       for(Object nombre : hermanos){
           System.out.println(nombre);
       }
       System.out.println("-----------------------------------Recorrer con iterator----------------------------------------------------------------");
       
       Iterator<Personas> it = hermanos.iterator();
       while(it.hasNext()){
           Personas persona = it.next();
           System.out.println(persona.toString());
       }
       /*
            Cree un programa que almacene la nota de una asignatura de varios alumnos en una colección de tipo Map. El alumno se identificará por su nombre.

            Cada elemento del mapa estará formado por nombre de tipo String y nota de tipo Integer. Utilizar tipos genéricos.
       */ 
       System.out.println("-----------------------------------MAP ALUMNO/NOTA ----------------------------------------------------------------");
       Map matematicas = new HashMap();
       matematicas.put("Alvaro",10);
       matematicas.put("Mateo",7);
       matematicas.put("Elena",9);
       
       System.out.println("-----------------------------------Recorrer con iterator Map----------------------------------------------------------------");
       Set<String> nombre = matematicas.keySet();
       for(String keyNombre : nombre){
           System.out.println("Nombre: "+ matematicas.keySet()+matematicas.get(keyNombre));
       }
    }
}
