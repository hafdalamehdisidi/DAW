/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin3ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Hafdala Mehdi Sidi
 */
public class Boletin3Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean esPar, esPositivo;
        
        System.out.println("Introduce un número");
        
        int number = sc.nextInt();
        
        while (number != 0) {
            esPar = number % 2 == 0 ? true : false;
            esPositivo = number >= 0 ? true : false;
            
            System.out.println(" ¿Es par? " + esPar +"¿Es positivo?" + esPositivo);
            System.out.println(" Cuadrado " + number * number);
            
            System.out.println(" Introduce otro número ");
            
            number = sc.nextInt();
        }
        
    }
    
}
