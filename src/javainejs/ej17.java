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
public class ej17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        
        Random rand = new Random();
        
        int n=rand.nextInt();
        int rep1=0,rep2=0,rep3=0,rep4=0,rep5=0;
        int[] tamano = new int[10000];
               for (int i=0; i<10000; i++){
           tamano[i]=rand.nextInt(99999)+1;
                if(tamano[i]<10){
                rep1 ++;
               }
                if(tamano[i]>9&&tamano[i]<=99){
                rep2 ++;
               }
                if(tamano[i]>99&&tamano[i]<=999){
                rep3 ++;
               }
                if(tamano[i]>999&&tamano[i]<=9999){
                rep4 ++;
               }
                if(tamano[i]>9999&&tamano[i]<=99999){
                rep5 ++;
               }
        }
               
        System.out.println("Se encontro: "+rep1+" numeros de 1 digitos");
        System.out.println("Se encontro: "+rep2+" numeros de 2 digitos");
        System.out.println("Se encontro: "+rep3+" numeros de 3 digitos");
        System.out.println("Se encontro: "+rep4+" numeros de 4 digitos");
        System.out.println("Se encontro: "+rep5+" numeros de 5 digitos");

    }
    
}
