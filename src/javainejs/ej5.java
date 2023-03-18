/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javainejs;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero entero cualquiera");
        int num = sc.nextInt();
        int doble = num*2;
        int triple = num*3;
        double raiz = Math.sqrt(num);
        System.out.println("doble = " + doble);
        System.out.println("triple = " + triple);
        System.out.println("raiz cuadrada = " + raiz);
        
        
    }
    
}
