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
public class ej14 {
    

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese cantidad de euros: ");
        Double cantidad = scan.nextDouble();
        System.out.println("A qué moneda desea convertir?: (dollar) (yenes) (libras)");
        String moneda = scan.next();
        System.out.println(" ");
        inter(cantidad, moneda);

    }
    public static void inter(Double cantidad, String moneda) {
        Double[] intercambia = new Double[4];
        intercambia[0]=cantidad;
        intercambia[1]=.86;
        intercambia[2]=1.28611;
        intercambia[3]=129.852;
        switch (moneda){
            case "dollar":
                System.out.println("La conversión es: "  + "USD " + (intercambia[0]*intercambia[2]) );
                break;
            case "libras":
                System.out.println("La conversión es: " + "£ " + (intercambia[0]*intercambia[1]));
                break;
            case "yenes":
                System.out.println("La conversión es: " + "Y " + (intercambia[0]*intercambia[3]));
    }
    
}
}
