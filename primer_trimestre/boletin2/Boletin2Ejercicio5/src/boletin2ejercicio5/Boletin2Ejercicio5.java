/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin2ejercicio5;

import java.util.Scanner;

/**
 *
 * @author Hafdala Mehdi Sidi
 */
public class Boletin2Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double numero;
        
        System.out.println(" Introduce un número con decimales: ");
        
        numero = sc.nextDouble();
        
        if (numero < 1 && numero > 0 || numero > -1 && numero < 0);{
        System.out.println(" El número es casi cero. ");
    } else {
            System.out.println(" El número no es casi cero. ")
    
}
    
    }
}