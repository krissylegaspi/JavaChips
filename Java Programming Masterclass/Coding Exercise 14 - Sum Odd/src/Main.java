public class Main {

    public static void main(String[] args) {
        System.out.println("(1, 100) = " + sumOdd(1, 100));
        System.out.println("(-1, 100) = " + sumOdd(-1, 100));
        System.out.println("(100, 100) = " + sumOdd(100, 100));
        System.out.println("(13, 13) = " + sumOdd(13, 13));
        System.out.println("(100, -100) = " + sumOdd(100, -100));
        System.out.println("(100, 1000) = " + sumOdd(100, 1000));
    }

    public static boolean isOdd(int number) {
        if (number > 0 && number % 2 != 0) {
            return true;
        }
        return false;
    }

    public static int sumOdd(int start, int end) {
        if (end < start && end < 0 || start < 0) {
            return -1;
        }
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                sum += i;
            }
        }
        return sum;
    }
}
