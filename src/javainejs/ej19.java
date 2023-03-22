/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javainejs;

/**
 *
 * @author Usuario
 */
public class ej19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [][] matriz={{0, -2, 4},{2, 0, 2},{-4, -2, 0}};
boolean salir=true;
        System.out.println("Los valores de la matriz");
        for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            System.out.print("("+matriz[i][j]+")");    
        }    
            System.out.println(" ");
        }
        //matriz transpuesta
        System.out.println(" ");
        for(int j=0;j<3;j++){
        for(int i=0;i<3;i++){
            System.out.print("("+matriz[i][j]+")");    
        }    
            System.out.println(" ");
        }
        //condicion 
        for(int j=0;j<3;j++){
        for(int i=0;i<3;i++){
        if(matriz[i][j] != -matriz[j][i]){
            salir=false;
            break;
        }
        }
        }
        if(salir){
        System.out.println("La matriz es antisimetrica");
        }else{
         System.out.println("La matriz no es antisimetrica");   
        }         
} 
}
