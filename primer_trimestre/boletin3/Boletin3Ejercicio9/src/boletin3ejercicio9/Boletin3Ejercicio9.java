/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin3ejercicio9;

import java.util.Scanner;

/**
 *
 * @author Hafdala Mehdi Sidi
 */
public class Boletin3Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int etiqueta = 0;
        int altura;
        
        System.out.println(" Altura del árbol  (" + etiqueta + "): ");
        
        altura = sc.nextInt();
        
        alturaArbolMasAlto = altura;
        etiquetaArbolMasAlto = 0;
        
        while (altura != -1) {
            if (altura > alturaArboMasAlto) {
                alturaArbolMasAlto = altura;
                etiquetaArbolMasAlto = etiqueta;
            }
            etiqueta++;
            
            System.out.println(" Altura del árbol (" + etiqueta + "):");
            
            altura = sc.nextInt();
        }
        
        if (alturaArbolMasAlto == -1) {
            System.out.println(" No hay ningún árbol");
        } else {
            System.out.println(" El árbol más alto mide: " + alturaArbolMasAlto);
            System.out.println(" Corresponde al árbol con la etiquet: " + etiquetaArbolMasAlto);
        }
    }
    
}
