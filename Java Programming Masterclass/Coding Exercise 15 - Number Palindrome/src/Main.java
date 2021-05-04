public class Main {

    public static void main(String[] args) {
        boolean answer = isPalindrome(707);
        System.out.println(answer); // true
        answer = isPalindrome(11212);
        System.out.println(answer); // false
    }

    public static boolean isPalindrome(int number) {
        int reverse = 0; // Store reverse of number
        int temp = number; // Compare number with reverse

        while (number != 0) { // != takes note of negatives
            // 707 -> 707 / 10 = 70 -> 70 * 10 = 700 -> 707 - 700 = 7
            int lastDigit = number % 10; // Stores last digit of number into lastDigit
            reverse *= 10; // Increase place value of reverse by one (lastDigit)
            reverse += lastDigit; // Add lastDigit to reverse
            number /= 10; // Remove last digit of number
        }
        if (temp == reverse) {
            return true;
        }
        return false;
    }
}
