public class Main {

    public static void main(String[] args) {
        numberToWords(123);
        numberToWords(1010);
        numberToWords(1000);
        numberToWords(-12);
    }

    public static void numberToWords(int number) {
        int reversedNumber = reverse(number);

        if (number < 0) {
            System.out.println("Invalid Value");
        }

        for (int i = 0; i < getDigitCount(number); i++) {
            int lastDigit = reversedNumber % 10;
            switch (lastDigit) {
                case 0:
                    System.out.print("Zero ");
                    break;
                case 1:
                    System.out.print("One ");
                    break;
                case 2:
                    System.out.print("Two ");
                    break;
                case 3:
                    System.out.print("Three ");
                    break;
                case 4:
                    System.out.print("Four ");
                    break;
                case 5:
                    System.out.print("Five ");
                    break;
                case 6:
                    System.out.print("Six ");
                    break;
                case 7:
                    System.out.print("Seven ");
                    break;
                case 8:
                    System.out.print("Eight ");
                    break;
                case 9:
                    System.out.print("Nine ");
                    break;
                default:
                    System.out.print("Invalid number");
                    break;

            }
            reversedNumber /= 10; // Remove last digit
        }
        System.out.println();
    }

    public static int reverse(int number) {
        int reversedNumber = 0;
        while (number != 0) {
            int lastDigit = number % 10;
            reversedNumber *= 10;
            reversedNumber += lastDigit;
            number /= 10;
        }
        return reversedNumber;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }

        int count = 1;
        while (number > 9) {
            number /= 10;
            count++;
        }

        return count;
    }
}
