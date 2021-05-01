public class Main {

    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
    }

    public static void printYearsAndDays (long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {

            long hour = minutes / 60;
            long day = hour / 24;
            long year = day / 365;
            long yearRemainder = day % 365;

            String yearString = year + " y";
            String dayString = yearRemainder + " d";

            System.out.println(minutes + " min = " + yearString + " and " + dayString);
        }
    }
}
