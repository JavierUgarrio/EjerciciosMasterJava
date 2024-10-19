/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pooAvanzado;

/**
 *
 * @author User
 */
public class PlantaTropical extends Planta {
    String especie;
    String region;
    
    public void regar(int cantidad, int tiempo){
        System.out.println("Se tiene que regar la cantidad de: " + cantidad + " litros, durante un periodo de:" + tiempo+ " min");
    }
    
}
