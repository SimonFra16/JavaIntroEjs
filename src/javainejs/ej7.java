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
public class ej7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase = sc.nextLine();
        if (frase.equalsIgnoreCase("eureka")){
            System.out.println("CORRECTO");
        } else
            System.out.println("INCORRECTO");
    }
    
}
