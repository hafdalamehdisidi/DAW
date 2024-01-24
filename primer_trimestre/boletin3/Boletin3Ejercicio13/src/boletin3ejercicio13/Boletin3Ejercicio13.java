/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin3ejercicio13;

import java.util.Scanner;

/**
 *
 * @author Hafdala Mehdi Sidi
 */
public class Boletin3Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int approveds = 0, suspenses = 0, conditioned = 0; // Contadores.
        
        for (int i = 1; i <= 6; i++) {
        System.out.println(" Nota del alumno " + i + ": ");
        
        int qually = sc.nextInt();
        
        if (qually == 4) {
            conditioned++;
        } else if (qually >= 5) {
            approveds++;
        } else if (qually < 4 ) {
            suspenses++;
        }
    }
        System.out.println(" Aprobados: " + approveds);
        System.out.println(" Suspensos: " + suspenses);
        System.out.println(" conditioned " + conditioned);
    }
    
}
