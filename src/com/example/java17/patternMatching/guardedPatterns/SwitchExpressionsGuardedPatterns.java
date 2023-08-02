package com.example.java17.patternMatching.guardedPatterns;

public class SwitchExpressionsGuardedPatterns {

    private static void testTriangleBefore17(Shape s) {
        switch (s) {
            case null:
                break;
            case Triangle t:
                if (t.calculateArea() > 100) {
                    System.out.println("Large triangle");
                    break;
                } else {
                    System.out.println("Triangle");
                    break;
                }
            default:
                System.out.println("Unknown!");
        }

    }

    private static void testTriangleInJava17(Shape s) {
        switch (s) {
            case null -> {
            }
            case Triangle t && t.calculateArea() > 100 -> System.out.println("Large triangle");
            case Triangle t -> System.out.println("Triangle");
            default -> System.out.println("Unknown");
        }
    }

    public static void main(String[] args) {
        Shape t = new Triangle();
        testTriangleBefore17(t);
        testTriangleInJava17(t);
        testTriangleInJava17(null);
    }
}
