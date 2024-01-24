/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin1ejercicio6;

import java.util.Scanner;

/**
 *
 * @author Hafdala Mehdi Sidi
 */
public class Boletin1Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int qualy1, qualy2, qualy3, media;
        Scanner sc = new Scanner(System.in);
        
        //Leemos las notas.
        System.out.println("Introduce la nota: ");
        qualy1 = sc.nextInt();
        
        System.out.println("Introduce otra nota: ");
        qualy2 = sc.nextInt();
        
        System.out.println("Introduce otra nota: ");
        qualy3 = sc.nextInt();
        
        //Calculamos la media.
        media = (int) ((qualy1 + qualy2 + qualy3) / 3.0);
        System.out.println("La nota media es: " + media + " Puntos.");
        
         
    }
    
}
