/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin5ejercicio6;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Hafdala Mehdi Sidi
 */
public class Boletin5Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int puntos[] = new int [8];
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Puntos programador (" + (i + 1) + "): ");
            puntos[i] = sc.nextInt();
        }
        
        Arrays.sort(puntos, 0, 5);
        System.out.println(Arrays.toString(puntos));
        
        int numElem = 5;
        System.out.println("Puntos del programado de exhibición: ");
        
    }
}
