/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin1ejercico10;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Hafdala Mehdi Sidi
 */
public class Boletin1Ejercico10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final double PI = 3.14; //Número PI como constante.
        double radio; //radio va a contener decimales.
        double area, longitud;
        
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        System.out.println(" Introduce el radio: ");
        radio = sc.nextDouble();
       
        longitud = 2 * PI * radio;
        area = PI * radio * radio;
        
        System.out.println(" La longitud del círculo es: " + longitud);
        System.out.println(" El area de la circunferencia es: " + area);
    }
    
}
