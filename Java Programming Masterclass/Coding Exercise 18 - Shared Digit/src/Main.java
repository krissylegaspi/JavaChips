public class Main {

    public static void main(String[] args) {
	    boolean answer = hasSharedDigit(12, 23);
        System.out.println(answer);
        answer = hasSharedDigit(9, 99);
        System.out.println(answer);
        answer = hasSharedDigit(15, 55);
        System.out.println(answer);
    }

    public static boolean hasSharedDigit(int num1, int num2) {
        if (num1 < 10 || num1 > 99 || num2 < 10 || num2 > 99) {
            return false;
        }

        for (int i = num1; i > 0; i /= 10) {
            for (int j = num2; j > 0; j /= 10) {
                if (i % 10 == j % 10) {
                    return true;
                }
            }
        }
        return false;
    }
}
