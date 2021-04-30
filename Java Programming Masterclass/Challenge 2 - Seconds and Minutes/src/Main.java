public class Main {

    private static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static void main(String[] args) {
        getDurationString(457,0);
        getDurationString(120);
    }

    public static String getDurationString(long minutes, long seconds) {
        if (minutes <= 0 || seconds <= 0 && seconds >= 59) {
            return INVALID_VALUE_MESSAGE;
        }

        long convertedHour = minutes / 60;
        long leftoverMinutes = minutes % 60;
        long convertedSeconds = seconds / 60;
        long leftoverSeconds = seconds % 60;
        long totalMinutes = convertedSeconds + leftoverMinutes;

        String hoursString = convertedHour + "h ";
        if (convertedHour < 10) {
            hoursString = "0" + hoursString;
        }

        String minutesString = totalMinutes + "m ";
        if (totalMinutes < 10) {
            minutesString = "0" + minutesString;
        }

        String secondsString = leftoverSeconds + "s ";
        if (leftoverSeconds < 10) {
            secondsString = "0" + secondsString;
        }

        System.out.println("(" + minutes + "m, " + seconds + "s) converted to " + hoursString  + minutesString + secondsString);

        return "Valid";
    }

    public static String getDurationString(long seconds) {
        if (seconds <= 0) {
            System.out.println("Invalid value");
            return INVALID_VALUE_MESSAGE;
        }

        long minutesInSeconds = seconds / 60;

        String minutesString = minutesInSeconds + "m ";
        if (seconds < 3600) {
            minutesString = "0" + minutesString;
        }

        System.out.println("(" + seconds + "s) converted to " + minutesString);

        return "Valid";
    }
}
