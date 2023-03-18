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
public class ej6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero y sepa si es par o impar");
        int num = sc.nextInt();
        
        if (num % 2 == 0 && num != 0){
            System.out.println(+ num +" es par");
        }else if (num % 2 != 0 && num != 0){
            System.out.println(+ num +" es impar");
        }else if (num == 0){
            System.out.println(+ num + " es cero, no es par ni impar");
        }
    }
    
}
