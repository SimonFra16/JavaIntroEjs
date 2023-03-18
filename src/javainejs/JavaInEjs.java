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
public class JavaInEjs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese 2 numeros");
        int num = sc.nextInt();
        int num2 = sc.nextInt();
        int suma = num + num2;
        System.out.println("la suma de los numeros es : " + suma);
        
        
    }
    
}
