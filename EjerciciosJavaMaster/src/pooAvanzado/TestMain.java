/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pooAvanzado;

/**
 *
 * @author User
 */
public class TestMain {
    public static void main(String []args){
        
        Globo globo1 = new Globo(123);
        System.out.println(globo1.getReferencia());
        Globo globo2 = new Globo(342);
        System.out.println(globo2.toString());
        Globo globo3 = new Globo(9234);
        System.out.println(globo3.getReferencia());
        
        Calculadora calculo = new Calculadora(6, 9);
        
        System.out.println( calculo.sumar(2,6));
        System.out.println(calculo.restar(4,6));
        System.out.println(calculo.multiplicar(2,2));
        System.out.println(calculo.dividir(9,3));
        
        PlantaTropical orquidea = new PlantaTropical();
        orquidea.regar(5, 2);
        
        Cactus cactusEscritorio = new Cactus();
        cactusEscritorio.regar(2,1);
    }
}
