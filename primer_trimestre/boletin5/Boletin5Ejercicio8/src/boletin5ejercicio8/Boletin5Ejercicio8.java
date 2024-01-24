/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin5ejercicio8;

import java.util.Arrays;

/**
 *
 * @author Hafdala Mehdi Sidi
 */
public class Boletin5Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sin[], con[] = {1, 2, 3, 2, 1, 3, 4, 5};
        sin = sinRepetidos(con);
        System.out.println(Arrays.toString(sin));
    }
    
    static int [] sinRepetidos(int t[]) {
        int copia[] = Arrays.copyOf(t, t.length);
        int numElem = copia.length;
        int i = 0;
        
        while (i < numElem) {
            int aBuscar = copia[i];
            int j = 0;
            
            while (j < i && copia[j] != aBuscar) {
                j++;      
        }
            
        if (j < i ) {
            
            copia[i] = copia [numElem -1];
            numElem--;
        } else {
            i++;
        }
        }
        
        return Arrays.copyOf(copia, numElem);
    }
}
