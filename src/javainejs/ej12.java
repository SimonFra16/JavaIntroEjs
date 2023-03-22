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
public class ej12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final Scanner leer = new Scanner(System.in);
        int contadorCorrectas = 0;
        int contadorIncorrectas = 0;
        String cadenaIngresada;
        do {
            System.out.println("Ingresa una Frase");
            cadenaIngresada = leer.nextLine();
            final int longitudFrase = cadenaIngresada.length();
            if (longitudFrase == 5) {
                if (cadenaIngresada.equals("&&&&&")) {
                    System.out.println("terminando programa");
                }
                if (cadenaIngresada.substring(0, 1).equals("X") && cadenaIngresada.substring(longitudFrase - 1, longitudFrase).equals("O")) {
                    System.out.println("Ingresaste una cadena Correcta");
                    ++contadorCorrectas;
                }
                else {
                    System.out.println("Ingresaste una cadena incorrecta no se contara");
                    ++contadorIncorrectas;
                }
            }
            else {
                System.out.println("Ingresaste una cadena incorrecta no se contara");
                ++contadorIncorrectas;
            }
        } while (!cadenaIngresada.equals("&&&&&"));
        System.out.println("Ingresaste " + contadorCorrectas + " Frases Correctas");
        System.out.println("Ingresaste " + contadorIncorrectas + " Frases Incorrectas");
    }
}
