import java.util.Scanner;

/**
 * @author Hafdala Mehdi Sidi
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       int edad;
        System.out.println("Introduce tu edad: ");

        edad = sc.nextInt();
        edad++;

        System.out.println("El próximo año tendrás:" + edad + " años. ");
    }
}