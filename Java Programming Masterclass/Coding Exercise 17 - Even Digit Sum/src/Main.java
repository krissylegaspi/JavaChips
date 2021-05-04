public class Main {

    public static void main(String[] args) {
        int answer = getEvenDigitSum(123456789);
        System.out.println(answer);
        answer = getEvenDigitSum(252);
        System.out.println(answer);
        answer = getEvenDigitSum(-22);
        System.out.println(answer);
    }

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }

        int sum = 0;
        while (number > 0) { // While the number is greater than 0, go into loop
            if (number % 2 == 0) { // If the number is divisible by 2
                sum += number % 10; // Add the remainder of number to sum
            }
            number /= 10; // Reduce number by one decimal point / remove last digit
        }
        return sum;
    }
}
