/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin3ejercicio3;

import java.util.Scanner;

/**
 *
 * @author Hafdala Mehdi Sidi
 */
public class Boletin3Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int secretNum = (int) (Math.random() * 100 + 1); //Número aleatorio de 1 a 100.
                
           System.out.println(" Introduce un número entre 1 y 100: ");
           
            int number = sc.nextInt();
            
        while (secretNum != number && number != -1) {
            
            if (secretNum < number) {
                System.out.println(" El número secreto es menor que el número introducido. ");
            } else {
                System.out.println(" El número secreto es mayor que el número introducido. ");
            }
            
            System.out.println(" Introduce otro número: ");
                 number = sc.nextInt();     
        }
        
        if (secretNum == number) {
            System.out.println(" Enhorabuena as acertado el número. ");
        } else {
            System.out.println(" Vuelve a intentarlo, la próxima vez será. ");
        }
             
    }
    
}
