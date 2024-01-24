/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin2ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Hafdala Mehdi Sidi
 */
public class Boletin2Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       //Pedimos número por teclado.
        Scanner sc = new Scanner(System.in);
        
        int numero; //Aquí se guarda el número introducido.
        
        System.out.println(" Introduce un número: ");
        
        numero = sc.nextInt();
        
        if (numero % 2 == 0) {
            
            System.out.println(" El número es par.");
        } else {
            System.out.println("El número es impar.");
        }
    }
    
}
