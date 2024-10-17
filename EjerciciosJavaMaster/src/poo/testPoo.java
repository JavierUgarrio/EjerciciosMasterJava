/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

/**
 *
 * @author User
 */
public class testPoo {
    
    public static void main(String [] args){
        
        Saludo persona = new Saludo("Joelito", "Sr");
        
        System.out.println(persona.saludar("Sra", "Mari Carmen"));
        
        Animal perro = new Animal(4,"Golden Retriever","Mamiferos");
        Animal pez = new Animal(0,"Trucha", "Pez");
        Animal cocodrilo = new Animal(4, "Cocodrilo del Nilo","Reptil");
        
        perro.setNombre("Labrador");
        System.out.println(perro.getNombre());
        
        pez.setNombre("Atun rojo");
        System.out.println(pez.toString());
        
        cocodrilo.setPatas(2);
        System.out.println(cocodrilo.getPatas());
    }
    
}
