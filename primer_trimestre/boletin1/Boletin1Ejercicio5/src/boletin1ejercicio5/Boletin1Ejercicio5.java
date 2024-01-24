/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin1ejercicio5;

import java.util.Scanner;

/**
 *
 * @author Hafdala Mehdi Sidi
 */
public class Boletin1Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Guardo las notas en una variable de tipo enteroç
        int qualification1, qualification2;
        //Guardo la nota media en un tipo real o double
        double averageGrade;
        //Leemos los datos por teclado 
        Scanner sc = new Scanner(System.in);
        
        //leemos las notas por la consola
        System.out.println("Nota 1: ");
        qualification1 = sc.nextInt();
        
        System.out.println("Nota 2: ");
        qualification2 = sc.nextInt();
        
        //Calculamos la nota media
        averageGrade = (qualification1 + qualification2) / 2.0;//Ponemos 2.0 para que convierta un número entero en uno real.
        System.out.println("La nota media es: " + averageGrade + " Puntos."); 
    }
    
}
