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
    }
}
