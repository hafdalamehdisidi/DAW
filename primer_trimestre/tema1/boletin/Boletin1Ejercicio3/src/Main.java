import java.util.Scanner;

/**
 * @author Hafdala Mehdi Sidi
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int añoActual;
        int añoNacimiento;
        int edad;

        System.out.println("Introduce el año actual: ");
        añoActual = sc.nextInt();

        System.out.println("Introduce tu año de nacimiento: ");
        añoNacimiento = sc.nextInt();

        edad = añoActual - añoNacimiento;

        System.out.println("Tienes " + edad + " años.");
    }
}