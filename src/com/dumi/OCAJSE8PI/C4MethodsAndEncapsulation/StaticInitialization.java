package com.dumi.OCAJSE8PI.C4MethodsAndEncapsulation;

public class StaticInitialization {

    private static int one;
    private static final int two;
    private static final int three = 3;
//    private static final int four; // DOES NOT COMPILE

    static {
        one = 1;
        two = 2;
//        three =3; // DOES NOT COMPILE
//        two =4; // DOES NOT COMPILE
    }


    private static final int NUM_SECONDS_PER_HOUR;
    static {
        int numSecondsPerMinute = 60;
        int numMinutesPerHour = 60;
        NUM_SECONDS_PER_HOUR = numSecondsPerMinute * numMinutesPerHour;
    }

    public static void main(String[] args) {
        System.out.println(NUM_SECONDS_PER_HOUR + " s");
    }
}
