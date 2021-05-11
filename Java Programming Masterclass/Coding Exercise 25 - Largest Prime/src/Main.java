public class Main {

    public static void main(String[] args) {
	    int answer = getLargestPrime(21); // 1, 3, 7, 21 = if added together = 32
        System.out.println("largest factor is " + answer);
    }

    public static int getLargestPrime(int number) {
        if (number < 2) {
            return -1;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                number /= i;
                i--;
            }
        }
        return number;
    }
}
