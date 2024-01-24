/**
 * @author Hafdala Mehdi Sidi
 */public class Main {
    public static void main(String[] args) {

        lightBulb bulb1, bulb2;

        bulb1 = new lightBulb();
        bulb2 = new lightBulb();

        bulb1.switchOn();
        bulb1.switchOf();

        System.out.println("Bombilla 1: " + bulb1.myStatus());
        System.out.println("Bombilla 2: " + bulb2.myStatus());

        lightBulb.generalSwitch = false;
        System.out.println("Apagamos la luz general");

        System.out.println("Bombilla 1: " + bulb1.myStatus());
        System.out.println("Bombilla 2: " + bulb2.myStatus());

        lightBulb.generalSwitch = true;
        System.out.println("Encendemos la luz general");

        System.out.println("Bombilla 1: " + bulb1.myStatus());
        System.out.println("Bombilla 2: " + bulb2.myStatus());
    }
}