/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin3ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Hafdala Mehdi Sidi
 */
public class Boletin3Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int sumaEdades = 0;
        int contadorAlumnos = 0;
        int contadorMayorEdad = 0;
        double media;
        
        System.out.println(" Introduce una edad:");
        
        int edad = sc.nextInt();
        
        while (edad >= 0) {
            sumaEdades += edad;
            contadorAlumnos++;
            
            if (edad > 18) {
                contadorMayorEdad++;
            }
            System.out.println(" Introduce edad: ");
            edad = sc.nextInt();
        }
        
        media = (double) sumaEdades / contadorAlumnos;
        
        System.out.println(" La suma de todas las edades " + sumaEdades);
        System.out.println(" media " + media);
        System.out.println(" Número total de alumnos: " + contadorAlumnos);
        System.out.println(" Alumnos mayores de edad: " + contadorMayorEdad);
    }
    
}
