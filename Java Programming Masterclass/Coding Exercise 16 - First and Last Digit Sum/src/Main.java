public class Main {

    public static void main(String[] args) {
        int answer = sumFirstAndLastDigit(252);
        System.out.println(answer);
        answer = sumFirstAndLastDigit(257);
        System.out.println(answer);
        answer = sumFirstAndLastDigit(0);
        System.out.println(answer);
        answer = sumFirstAndLastDigit(5);
        System.out.println(answer);
        answer = sumFirstAndLastDigit(-10);
        System.out.println(answer);

    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }

        int lastDigit = number % 10;
        while (number > 9) {
            number /= 10;
        }
        return lastDigit + number;
    }
}
