/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin5ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Hafdala Mehdi Sidi
 */
public class Boletin5Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println(" ¿Cuántos elementos quieres introducir? ");
        
        int number = sc.nextInt();
        int[] table = new int[number];
        
        for (int i =0; i < table.length; i++) {
            
            System.out.println(" Elemento " + i + ":");
            
            table[i] = sc.nextInt();
        }
        
        for (int i = table.length - 1; i >= 0; i--) {
            System.out.println(table[i]);
        }
    }
    
}
