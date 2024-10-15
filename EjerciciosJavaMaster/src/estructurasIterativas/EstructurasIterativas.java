/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
        
        
    }
}
