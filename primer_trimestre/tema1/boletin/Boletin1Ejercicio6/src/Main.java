import java.util.Scanner;

/**
 * @author Hafdala Mehdi Sidi
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nota1;
        double nota2;
        double nota3;

        int media;

        System.out.println("Introduce la primera nota: ");
        nota1 = sc.nextDouble();

        System.out.println("Introduce la nota segunda nota: ");
        nota2 = sc.nextDouble();

        System.out.println("Introduce la tercera nota: ");
        nota3 = sc.nextDouble();

        media = (int) (nota1 + nota2 + nota3) / 3;
        System.out.println("La nota media es: " + media);
    }
}