/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin1ejercicio8;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Hafdala Mehdi Sidi
 */
public class Boletin1Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Los datos de entrada que vamos a necesitar son:
        -Cantidad vendida en el trimestre 1.
        -Cantidad vendida en el trimestre 2.
        -Cantidad vendida en el trimestre 3.
        -Cantidad vendida en el trimestre 4.
        */
        final double PRECIO_MANZANAS = 2.35;
        final double PRECIO_PERAS = 1.95;
        
        int vManzana1t, vManzana2t, vManzana3t, vManzana4t;
        int vPeras1t, vPeras2t, vPeras3t, vPeras4t;
        
        double impTotal;
        Scanner sc = new Scanner(System.in);
        sc = sc.useLocale(Locale.US);
        
        //Pedimos datos:
        System.out.println("Para las manzanas: ");
        System.out.println("Ventas (en kilos) del primer trimestre");
        vManzana1t = sc.nextInt();
        System.out.println("Ventas del segundo trimestre");
        vManzana2t = sc.nextInt();
        System.out.println("Ventas del tercer trimestre");
        vManzana3t = sc.nextInt();
        System.out.println("Ventas manzanas cuarto trimestre");
        vManzana4t = sc.nextInt();
        
        System.out.println("Para las peras: ");
        System.out.println("Ventas primer trimestre");
        vPeras1t = sc.nextInt();
        System.out.println("Ventas para el  segundo trimestre");
        vPeras2t = sc.nextInt();
        System.out.println("Ventas para el tercer trimestre:");
        vPeras3t = sc.nextInt();
        System.out.println("Ventas del cuatro trimestre: ");
        vPeras4t = sc.nextInt();
        
        
        //Hago el cálculo del importe total.
        impTotal = (vManzana1t + vManzana2t + vManzana3t + vManzana4t) * PRECIO_MANZANAS;
        impTotal += (vPeras1t + vPeras2t + vPeras3t + vPeras4t) * PRECIO_PERAS;
        
        System.out.println("El importe total es de: " + impTotal + " € ");
    }
    
}
