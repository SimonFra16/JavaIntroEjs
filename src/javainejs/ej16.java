/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javainejs;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ej16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner num = new Scanner(System.in);
         
        Random num2 = new Random();
        
                int repeticiones=0, numeveces=0;
        int[] tamano = new int[15];
               for (int i=0; i<15; i++){
           tamano[i]=num2.nextInt(15)+1; 
            System.out.print("("+tamano[i]+")");
               }
               System.out.println("");
        System.out.println("Escribe un numero: ");
        int num1 = num.nextInt();
        
        for (int i=0; i<15; i++){
            if(num1==tamano[i]){
                repeticiones ++;
             
            if(num1==tamano[i]){
            numeveces=i;
            System.out.println("El numero se encontro en la pocision: "+numeveces );
            }
            }
        }
        System.out.println("El numero se encontro: "+repeticiones+" veces");
    }
}
