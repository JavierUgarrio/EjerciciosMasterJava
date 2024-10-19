/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pooAvanzado;

/**
 *
 * @author User
 */
public class Calculadora {
    int num1;
    int num2;
    
    //Constructor
    public Calculadora(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    //Get & Setter
    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    //Metodos
    
    static int sumar(int num1 , int num2){
        int resultado = num1 + num2;
        return resultado;
    }
   
    static int restar(int num1 , int num2){
        int resultado = num1 - num2;
        return resultado;
    }
    
    static int multiplicar(int num1 , int num2){
        int resultado = num1 * num2;
        return resultado;
    }
    
    static int dividir(int num1 , int num2){
        int resultado = num1 / num2;
        return resultado;
    }
   
}
