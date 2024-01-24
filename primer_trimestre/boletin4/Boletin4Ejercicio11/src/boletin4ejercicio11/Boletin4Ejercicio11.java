/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin4ejercicio11;

import static java.util.Locale.US;
import java.util.Scanner;

/**
 *
 * @author Hafdala Mehdi Sidi
 */
public class Boletin4Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      sc.useLocale(US);
      
        System.out.println(" Introduce base (real): ");
        double base = sc.nextDouble();
        
        System.out.println(" Introduce el exponente ");
        
        int exp = sc.nextInt();
        
        double rest = aElevadoN(base, exp);
        
        System.out.println(base + " elevado a " + exp + " = " + rest);
    }
 
    static double aElevadoN (double a, int n ) {
        
        double rest = 1;
        
        if (n == 0) {
            rest = 1;
        } else {
            for (int i = 1; i <= n; i++) {
                
                rest = rest * a;
            }
        }
        
        return (rest);
    }
}
