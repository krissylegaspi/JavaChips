public class Main {

    public static void main(String[] args) {
        int number = 5;
        int finishNumber = 20;
        int count = 0;

        while(number <= finishNumber) {
            if(!isEvenNumber(number)) {
                number++;
                continue;
            }

            System.out.println("Even number " + number);

            count++;
            if (count >= 5) {
                break;
            }

            number++;
        }
        System.out.println("Count = " + count);

    }

    public static boolean isEvenNumber(int number) {
        if (number % 2 != 0) {
            return false;
        }
        return true;
    }
}
