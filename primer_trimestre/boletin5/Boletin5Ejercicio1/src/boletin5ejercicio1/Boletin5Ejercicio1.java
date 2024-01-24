/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin5ejercicio1;

import java.util.Arrays;
import static java.util.Locale.US;
import java.util.Scanner;

/**
 *
 * @author Hafdala Mehdi Sidi
 */
public class Boletin5Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       sc.useLocale(US);
       //Creamos y inicializamos la tabla.
       double table[] = new double [5];
       
       for (int i = 0; i < 5; i++) {
           System.out.println(" Introduce un número: ");
           table[i] = sc.nextDouble();
       }
        System.out.println(" Los números son: ");
       for (int i = 0; i < 5; i++) {
           System.out.println(table[i]);
       }
       
        System.out.println(" Otra forma de mostrar tablas. ");
        System.out.println(Arrays.toString(table));
    }
    
}
