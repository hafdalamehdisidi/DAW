/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin3ejercicio12;

import java.util.Scanner;

/**
 *
 * @author Hafdala Mehdi Sidi
 */
public class Boletin3Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        boolean suspense = false; // iniciamos en false para indicar que de momento no hay suspensos.
        
        for (int i = 0; i < 5; i++) {
            System.out.println(" Introduce una note (del 1 al 10): ");
            
            int note = sc.nextInt();
            
            if (note < 5) {
                suspense = true;
            }
        }
        
        if (suspense) {
            System.out.println(" Hay al menos un suspenso. ");
        } else {
            System.out.println(" No hay suspensos. ");
        }
    }
    
}
