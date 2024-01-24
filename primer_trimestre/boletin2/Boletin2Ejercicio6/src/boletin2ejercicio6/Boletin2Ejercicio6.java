/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin2ejercicio6;

import java.util.Scanner;

/**
 *
 * @author Hafdala Mehdi Sidi
 */
public class Boletin2Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int number1, number2;
        int elderly, minor;
        
        System.out.println(" Introduce un número. ");
        number1 = sc.nextInt();
        
        System.out.println(" Introduce otro número. ");
        number2 = sc.nextInt();
        
        elderly = number1 > number2 ? number1 : number2;
        minor = number1 < number2 ? number1 : number2;
        
        System.out.println( elderly + " , " + minor);
        
        
    }
    
}
