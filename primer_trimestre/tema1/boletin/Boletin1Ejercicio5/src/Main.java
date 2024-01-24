import java.util.Scanner;

/**
 * @author Hafdala Mehdi Sidi
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nota1;
        int nota2;
        double media;


        System.out.println("Introduce la primera nota ");
        nota1 = sc.nextInt();

        System.out.println("Introduce la segunda nota: ");
        nota2 = sc.nextInt();

        media = nota1 + nota2 * 0.2;

        System.out.println("Tú nota media es: " + media);

    }
}