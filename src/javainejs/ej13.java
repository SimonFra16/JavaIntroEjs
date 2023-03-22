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
public class ej13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
              final Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa el numero que define el tamaño del cuadrado");
        final int cuadradoDimension = leer.nextInt();
        String aux = "";
        for (int i = 1; i <= cuadradoDimension; ++i) {
            for (int j = 1; j <= cuadradoDimension; ++j) {
                if (i == 1 || i == cuadradoDimension) {
                    aux += "*";
                }
                else if (j == 1 || j == cuadradoDimension) {
                    aux += "*";
                }
                else {
                    aux += " ";
                }
            }
            System.out.println(aux);
            aux = "";
        }
    }
}

