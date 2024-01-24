/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin1ejercicio3;

import java.util.Scanner;

/**
 *
 * @author Hafdala Mehdi Sidi
 */
public class Boletin1Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int currentAge;
       int yearBirth;
       int age;
       Scanner sc = new Scanner(System.in);
       
        System.out.println("Año de nacimiento: ");
        
        yearBirth = sc.nextInt();
        
        System.out.println("Año actual: ");
        
        currentAge = sc.nextInt();
        age = currentAge - yearBirth;
        
        System.out.println("Tú edad es " + age + " años");
    }
    
}

