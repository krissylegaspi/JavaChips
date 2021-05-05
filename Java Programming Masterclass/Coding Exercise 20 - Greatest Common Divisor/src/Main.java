public class Main {

    public static void main(String[] args) {
        int answer = getGreatestCommonDivisor(2322, 654);
        System.out.println(answer);
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }

        // Euclidean algorithm
        while (first != second) {
            if (first > second) {
                first = first - second;
            } else {
                second = second - first;
            }
        }
        return second;
    }
}
