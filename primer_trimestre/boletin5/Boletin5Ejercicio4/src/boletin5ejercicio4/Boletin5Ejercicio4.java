/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin5ejercicio4;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Hafdala Mehdi Sidi
 */
public class Boletin5Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Introduce longitud de la combinación secreta ");
        int longitud = sc.nextInt();
        int combSecreta [] = new int [longitud]; //La tabla de la combinación secreta.
        int combJugador [] = new int [longitud]; // Combinación introducida por el jugador.
        
        generaCombinación(combSecreta); // Generamos aleatoriamente la combinación.
        System.out.println(Arrays.toString(combSecreta));
        System.out.println("Escribe una combinación: ");
        leeTabla(combJugador);
        
        while (!Arrays.equals(combSecreta, combJugador)) {
            nuestrasPistas(combSecreta, combJugador);
            System.out.println("Esrcibe una combinación ");
            leeTabla(combJugador);
        }
        
        System.out.println("¡ As abierto la cámara!");
    }
    
    static void generaCombinación(int t []) {
        final int MAX = 5; // Rango de 1 a 5.
        for (int i = 0; i < t.length; i++) {
            t [i] = (int) (Math.random() * MAX +1);
        }
        
    }
    
    static void leeTabla(int t []) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < t.length; i++) {
            t[i] = sc.nextInt();
        }
    }
    
    static void nuestrasPistas(int secret[], int jug[]) {
        for (int i = 0; i < jug.length; i++) {
            System.out.println(jug[i]);
            if (secret[i] > jug[i]) {
                System.out.println("Mayor");
            } else if (secret[i] < jug[i]) {
                System.out.println("Menor");
            } else {
                System.out.println("Igual");
            }
        }
    }
}
