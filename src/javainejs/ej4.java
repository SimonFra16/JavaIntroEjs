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
public class ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de grados C y obtendra su equivalente en F ");
        double C = sc.nextDouble();
        double F = 32 + (9*(C/5));
        System.out.println(+ C + " grados C = " + F + " grados F");
        
    }
    
}
