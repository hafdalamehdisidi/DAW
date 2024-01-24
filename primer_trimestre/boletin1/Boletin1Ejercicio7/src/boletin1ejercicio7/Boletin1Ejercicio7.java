/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin1ejercicio7;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Hafdala Mehdi Sidi
 */
public class Boletin1Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Guardamos el número.
        double number;
        //Guardamos el redondeo.
        int rounding;
        //Pedimos número por teclado.
        Scanner sc = new Scanner(System.in);
        //Para usar la coma en vez de un punto hacemos uso de use local de la librería de java.
        sc.useLocale(Locale.US);
        
        //Leemos por consola.
        System.out.println("Introduce un número decimal: ");
        number = sc.nextDouble();
        
        //Ahora hacemos el redondeo.
        rounding = (int) (number + 0.5);
        //En este caso hemos hecho un estretchamiento y estamos obligados a hacer un casting.
        System.out.println(number + " El Redondeo es: " + rounding);
        
    }
    
}
