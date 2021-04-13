package com.company;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2;         // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);
        int previousResult = 3;
        System.out.println("previousResult = " + previousResult);
        result = result - 1;       // 3 - 1 = 2
        System.out.println("3 - 1 = " + result);
        System.out.println("previousResult = " + previousResult);

        result = result * 10;       // 2 * 10 = 2
        System.out.println("2 * 10 = " + result);

        result = result / 5;        // 20 / 5 = 4
        System.out.println("20 / 5 = " + result);

        result = result % 3;        // the remainder of (4 % 3) = 1
        System.out.println("4 % 3 is " + result);

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien!");
            System.out.println("And I am scared");
        }

        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the highest score!");
        }

        int secondTopScore = 95;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true");
        }

        boolean isCar = false;
        if (isCar) {
            System.out.println("This is not supposed to happen");
        }

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("wasCar is true");
        }

        /* ----- Challenge ----- */

        double firstVar = 20.00d;
        double secondVar = 80.00d;
        double thirdVar = (firstVar + secondVar) * 100.00d;
        double fourthVar = thirdVar % 40.00d;
        System.out.println("Remainder is " + fourthVar);
        boolean isZero = (fourthVar == 0) ? true : false;
        System.out.println("isZero is " + isZero);

        if (!isZero) {
            System.out.println("Got some remainder");
        }

    }
}
