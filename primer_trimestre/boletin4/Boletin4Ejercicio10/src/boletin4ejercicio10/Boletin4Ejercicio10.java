/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin4ejercicio10;

import java.util.Scanner;

/**
 *
 * @author Hafdala Mehdi Sidi
 */
public class Boletin4Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Introduce un número: ");
        
        int number = sc.nextInt();
        
        System.out.println( number + " Es igual que " + factorial(number));
    }
    
    static int factorial (int number) {
        
        int rest;
        
        if (number == 0) {
            rest = 1;
        } else {
            rest = number * factorial(number - 1);
        }
        return (rest);
    }
}
