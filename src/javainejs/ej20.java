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
public class ej20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    Scanner leer = new Scanner(System.in);
    
    int sumfila=0,sumcolum=0,sumdiag1=0,sumdiag2=0;
int [][] matriz=new int [3][3];
        System.out.println("Ingrese los valores de cuadro");
for (int i=0;i<3;i++){
for (int j=0;j<3;j++){
    int num=leer.nextInt();
    while(num<1||num>9){
        System.out.println("Intenta denuevo");
        num=leer.nextInt();
    }
    matriz[i][j]=num;
}
}
//mostrar matriz
System.out.println("El cuadro ingresado es: ");
for (int i=0;i<3;i++){
for (int j=0;j<3;j++){
    System.out.print("("+matriz[i][j]+")");
}
    System.out.println(" ");
}
//suma de filas
for (int i=0;i<3;i++){
    sumfila=0;
for (int j=0;j<3;j++){
    sumfila+=matriz[i][j];
}
    System.out.println("La suma de la fila "+(i+1)+" es: "+sumfila);
}
//suma de columnas
for (int i=0;i<3;i++){
    sumcolum=0;
for (int j=0;j<3;j++){
    sumcolum+=matriz[j][i];
}
    System.out.println("La suma de la columna "+(i+1)+" es: "+sumcolum);
}
//suma diagonal principal
for (int i=0;i<3;i++){
    sumdiag1+=matriz[i][i];
}
    System.out.println("La suma de la diagonal principal es: "+sumdiag1);       
//suma diagonal secundaria
for (int i=0;i<3;i++){
    sumdiag2+=matriz[i][2-i];
}
    System.out.println("La suma de la diagonal secundaria es: "+sumdiag2);
    if(sumfila==sumcolum&&sumfila==sumdiag1&&sumfila==sumdiag2){
        System.out.println("El cuadrado es magico");
    }else{
        System.out.println("El cuadrado no es magico");
    }
}       
}
