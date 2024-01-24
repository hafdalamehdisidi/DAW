import java.util.Scanner;

/**
 * @author Hafdala Mehdi Sidi
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        hour hour = new hour();

        System.out.println("Introduce la hora:");

        int valor = sc.nextInt();

        hour.setHour(valor);

        System.out.println("Introduce los minutos:");
        valor = sc.nextInt();

        hour.setMinutes(valor);

        System.out.println("Introduce los segundos;");
        valor = sc.nextInt();

        hour.setSeconds(valor);

        System.out.println("¿Cuántos segundos quieres mostrar?");
        int numberSeconds = sc.nextInt();

        for (int i = 0; i <= numberSeconds; i++) {
            System.out.println(hour.getHour() + ":" + hour.getMinutes() + ":" + hour.getSeconds());
            hour.increaseSeconds();
        }

    }
}