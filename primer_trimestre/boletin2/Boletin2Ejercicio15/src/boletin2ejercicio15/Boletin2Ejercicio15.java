/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin2ejercicio15;

import java.util.Scanner;

/**
 *
 * @author Hafdala Mehdi Sidi
 */
public class Boletin2Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca un número del 1 al 7: ");
        
        int dia = sc.nextInt();
        
        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
                
            case 2:
                System.out.println("Martes");
                break;
                
            case 3:
                System.out.println("Miércoles");
                break;
                
            case 4:
                System.out.println("Jueves");
                break;
                
            case 5:
                System.out.println("Viernes");
                break;
                
            case 6:
                System.out.println("Sábado");
                
            case 7:
                System.out.println("Domingo");
                
        }
        
    }
    
}
