public class Main {

    public static void main(String[] args) {
        System.out.println("---WHILE---");
        int count = 1;
        while (count != 6) {
            System.out.println("Count value is " + count);
            count++;
        }

        System.out.println("---FOR---");

        for (count = 1; count != 6; count++) {
            System.out.println("Count value is " + count);
        }

        System.out.println("---WHILE TRUE---");

        count = 1;
        while(true) {
            if (count == 6) {
                break;
            }
            System.out.println("Count value is " + count);
            count++;
        }

        System.out.println("---DO WHILE---");

        count = 1;
        do {
            System.out.println("Count value was " + count);
            count++;
        } while (count != 6);
    }
}
