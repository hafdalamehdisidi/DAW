/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin6ejercicio5;

import java.util.Scanner;

/**
 *
 * @author Hafdala Mehdi Sidi
 */
public class Boletin6Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String nombre, sinVocales = "";
        char c;
        System.out.println("Esrcibe tu nombre: ");
        nombre = sc.nextLine();
        
        for (int i = 0; i < nombre.length(); i++) {
            c = nombre.charAt(i);
            
            if (!esVocal(c)) {
                sinVocales = sinVocales + c;
            }
        }
        
        System.out.println(sinVocales);
    }
    
    static boolean esVocal(char c) {
        boolean result;
        String vocales = "aeiouáéíóú";
        c = Character.toLowerCase(c);
        result = vocales.indexOf(c) != -1;
        
        return result;
    }
    
}
