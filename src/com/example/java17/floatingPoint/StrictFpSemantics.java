package com.example.java17.floatingPoint;

public class StrictFpSemantics {

    public static strictfp double sum(double a, double b) {
        return a + b;
    }
    public static void main(String[] args) {
        double result = sum(5e10, 8e12);
        System.out.printf("Result: [%f].", result); // Result: [8050000000000.000000].
//        warning: as of release 17, all floating-point expressions are evaluated strictly and 'strictfp' is not required
    }
}