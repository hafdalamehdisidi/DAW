/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebainicial;

import java.util.Scanner;

/**
 *
 * @author Hafdala Mehdi Sidi
 */
public class PruebaInicial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double product = 1; // Esta variable va a guardar la multiplicación de los 10 primeros números.

        //Hay que inicializar en 1, porque si lo iniciamos en 0 el resultado es siempre 0 por estar multiplicando.
        for (int i = 1; i < 20; i += 2) {
            product = product * i;
        }
        //Mostramos datos.
        System.out.println(" El producto de los 10 primeros número impares es: " + product);

    }

}
