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
public class ej8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una frase de 8 digitos");
        String frase = sc.nextLine();
        if (frase.length()== 8){
            System.out.println("CORRECTO");
        } else
            System.out.println("INCORRECTO");
    }
    
}
