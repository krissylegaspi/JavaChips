public class Main {

    public static void main(String[] args) {
        boolean answer = canPack (1, 0, 4);
        System.out.println(answer);
        answer = canPack (1, 0, 5);
        System.out.println(answer);
        answer = canPack (0, 5, 4);
        System.out.println(answer);
        answer = canPack (2, 2, 11);
        System.out.println(answer);
        answer = canPack (-3, 2, 12);
        System.out.println(answer);
        answer = canPack (2, 1, 5);
        System.out.println(answer);
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        int eachBig = bigCount * 5;
        int totalKilos = eachBig + smallCount;

        if (totalKilos < goal || bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        if (totalKilos >= goal) {
            if (eachBig % 10 > goal % 10) {
                return false;
            }
        }

        return true;
    }

}
