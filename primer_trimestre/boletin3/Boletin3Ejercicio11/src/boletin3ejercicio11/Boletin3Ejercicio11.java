/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin3ejercicio11;

/**
 *
 * @author Hafdala Mehdi Sidi
 */
public class Boletin3Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int table = 1; table <=10; table++) {
            System.out.println(" Tabla del " + table + ":");
            
            for (int i = 1; i <= 10; i++) {
                System.out.println(table + " X " + i + " = " + table * i);
            }
        }
    }
    
}
