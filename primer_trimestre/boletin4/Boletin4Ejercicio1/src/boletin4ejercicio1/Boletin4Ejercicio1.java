/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin4ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Hafdala Mehdi Sidi
 */
public class Boletin4Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println(" Introduce un número: ");
        
       int number = sc.nextInt();
       
        System.out.println(" Antes de llamar a la función ");
        
        eco(number);
        
        System.out.println(" Después de llamar a la función");
        
        
    }
    
    static void eco (int a) {
        for (int i = 0; i < a; i++) {
            System.out.println("eco........");
        }
    }
}
