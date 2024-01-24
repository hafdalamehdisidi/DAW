/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin2ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Hafdala Mehdi Sidi
 */
public class Boletin2Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {s
        
        Scanner sc = new Scanner(System.in);
        
        int number1;
        int number2;
        
        number1 = sc.nextInt();
        System.out.println(" Introduce un número: ");
        number2 = sc.nextInt();
        System.out.println(" Introduce otro número");
        
        if (number1 == number2) {
            
            System.out.println(" Son iguales.");
    } else {
            System.out.println("No son iguales");
     }
    
    }
}
    
