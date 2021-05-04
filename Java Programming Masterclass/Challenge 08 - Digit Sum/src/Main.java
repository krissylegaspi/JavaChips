public class Main {

    public static void main(String[] args) {
        int sum = sumDigits(125);
        System.out.println("Sum = " + sum);
        sum = sumDigits(1);
        System.out.println("Sum = " + sum);
        sum = sumDigits(5);
        System.out.println("Sum = " + sum);
        sum = sumDigits(1111);
        System.out.println("Sum = " + sum);
    }

    public static int sumDigits(int number) {
        if (number < 10) {
            return -1;
        }

        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }
        return sum;
    }
}
