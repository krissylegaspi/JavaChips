package com.company;

public class Main {

    public static void main(String[] args) {

        byte cByte = 20;
        short cShort = 30;
        int cInt = 40;
        long cLong = 50_000L + (10L * (cByte + cShort + cInt));
        System.out.println(cLong);

    }
}
