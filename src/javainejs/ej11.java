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
public class ej11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese 2 numeros enteros positivos");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        boolean salir = false;
        do {
        System.out.println("Menú:");
        System.out.println("1- Sumar");
        System.out.println("2- Restar");
        System.out.println("3- Multiplicar");
        System.out.println("4- Dividir");
        System.out.println("5- Salir");
        int opcion = leer.nextInt();
        switch (opcion){
            case 1:
                System.out.println("suma es igual a " + (num1 + num2));
                salir = true;
                break;
            case 2:
                System.out.println("resta es igual a " + (num1 - num2));
                salir = true;
                break;
            case 3:
                System.out.println("producto es igual a " + (num1*num2));
                salir = true;
                break;
            case 4:
                System.out.println("división es igual a " + (num1/num2));
                salir = true;
                break;
            case 5:
                 System.out.println("Desea salir? S/N");
                    String letra = leer.next();

                    if (letra.equalsIgnoreCase("S")) {

                        salir = false;

                    } else if (letra.equalsIgnoreCase("N")) {
                        salir = true;

                    }
                    break;
                default:
                    System.out.println("Opcion no valida");
                    System.out.println("");
                    salir = true;

            }
        } while (salir);
    }
}

