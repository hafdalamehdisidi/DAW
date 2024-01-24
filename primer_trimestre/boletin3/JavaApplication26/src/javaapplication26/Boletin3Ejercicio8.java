/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication26;

import java.util.Scanner;

/**
 *
 * @author Hafdala Mehdi Sidi
 */
public class Boletin3Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double factorial;
        int number = sc.nextInt();

        System.out.println(" Introduce un número");

        factorial = 1;

        for (int i = number; i > 0; i--) {
            factorial = factorial * i;
        }

        System.out.println(" El factorial de " + number + " es: " + factorial);
    }

}
