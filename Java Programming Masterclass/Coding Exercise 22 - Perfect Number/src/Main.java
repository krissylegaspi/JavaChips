public class Main {

    public static void main(String[] args) {
        boolean answer = isPerfectNumber(6);
        System.out.println(answer);
        answer = isPerfectNumber(28);
        System.out.println(answer);
        answer = isPerfectNumber(5);
        System.out.println(answer);
        answer = isPerfectNumber(-1);
        System.out.println(answer);
    }

    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }

        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
                if (sum == number) {
                    return true;
                }
            }
        }

        return false;
    }
}
