package com.company;

public class Main {

    public static void main(String[] args) {

        int myNumber = 879;
        int stepOne = myNumber * myNumber;
        int stepTwo = stepOne + myNumber;
        int stepThree = stepTwo / myNumber;
        int stepFour = stepThree + 17;
        int stepFive = stepFour - myNumber;
        int stepSix = stepFive / 6;

        // Prints the value of 3 no matter what myNumber is... magic!
        System.out.println(stepSix);

    }
}
