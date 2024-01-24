/**
 * @author Hafdala Mehdi Sidi
 */
public class lightBulb {
    public static boolean generalSwitch = true;
    private boolean switchBulb;

    public lightBulb() {
        switchBulb = false;
    }

    public void switchOn() {
        switchBulb = true;
    }

    public void switchOf() {
        switchBulb = false;
    }

    public boolean status() {
        boolean state;
        if (generalSwitch == true && switchBulb == true) {

            state = true;
        } else {
            state = false;
        }

        return (state);
    }

    public String myStatus() {
        java.lang.String status;

        if (status() == true) {
            status = "Encendida";
        } else {
            status = "Apagada";
        }

        return (status);
    }
}
