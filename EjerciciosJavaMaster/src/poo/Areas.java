/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

/**
 *
 * @author User
 */
public class Areas {
    public double radio;
    public int lado;
    public int altura;
    
    //Constructor Circulo

    public Areas(double radio) {
        this.radio = radio;
    }
    
    public Areas(int lado, int altura){
        this.lado = lado;
        this.altura= altura;       
    }
    
    //Get& Set

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    //Metodos
    
    public static double areaCirculo(double radio){
        double pi = 3.14;
        return pi*(radio*radio);
        
    }
    
    public static int areaRectangulo(int lado, int altura){
        return lado*altura;
    }
}
