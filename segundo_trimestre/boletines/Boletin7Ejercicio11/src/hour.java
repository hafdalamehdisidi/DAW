/**
 * @author Hafdala Mehdi Sidi
 */
public class hour {
    private byte hour;
    private byte minutes;
    private byte seconds;

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {

        if (0 <= hour && hour <= 23) {

            this.hour = (byte) hour;

        } else {
            this.hour = 0;
        }
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        if (0 <= minutes && minutes <= 59) {
            this.minutes = (byte) minutes;
        } else {

            this.minutes = 0;
        }
    }

    public byte getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {

        if (0 <= seconds && seconds <= 59) {
            this.seconds = (byte) seconds;
        } else {

            this.seconds = 0;
        }
    }

    public void increaseSeconds() {
        seconds++;

        if (seconds == 60) {
            seconds = 0;

            minutes++;

            if (minutes == 60) {
                minutes = 0;

                hour++;

                if (hour == 24) {
                    hour = 0;
                }
            }
        }
    }
}
