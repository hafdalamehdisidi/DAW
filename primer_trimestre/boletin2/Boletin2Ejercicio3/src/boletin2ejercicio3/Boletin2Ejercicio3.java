/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin2ejercicio3;

import java.util.Scanner;

/**
 *
 * @author Hafdala Mehdi Sidi
 */
public class Boletin2Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int number1, number2;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println(" Introduce un número. ");
        number1 = sc.nextInt();
        
        System.out.println(" Introduce otro número.");
        number2 = sc.nextInt();
        
        if (number1  > number2) {
            System.out.println(number1 + " Es mayor que " + number2);
        } else {
            System.out.println( number2 + " Es mayor que " + number1);
        }
        
       
       
    }
    
}
