/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javainejs;

import java.util.Random;

/**
 *
 * @author Usuario
 */
public class ej18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rand = new Random();
        
        int[][]matriz=new int[4][4];
        //llenar matriz
        for (int i=0;i<4;i++){
        for (int j=0;j<4;j++){
           matriz[i][j]=rand.nextInt(9)+1;   
        }
    }
        //mostrar matriz
        for (int i=0;i<4;i++){
        for (int j=0;j<4;j++){
            System.out.print(matriz[i][j]);  
        }
            System.out.println(" ");
    }
        //mostrar matriz interpuesta
        System.out.println("La matriz interpuesta es:");
        for (int j=0;j<4;j++){
        for (int i=0;i<4;i++){
            System.out.print(matriz[i][j]);  
        }
            System.out.println(" ");
    }     
} 
}
 
