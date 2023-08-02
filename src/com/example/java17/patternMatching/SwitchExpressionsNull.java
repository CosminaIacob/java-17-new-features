package com.example.java17.patternMatching;

public class SwitchExpressionsNull {

    private static String verifyStringBefore17(String s) {
        if (s == null) {
            return s + " -> Unknown!";
        }
        return s + switch (s) {
            case "Java 11", "Java 17" -> " -> LTS";
            default -> " -> Ok";
        };
    }

    private static String verifyStringInJava17(String s) {
        return s + switch (s) {
            case null -> " -> Unknown!";
            case "Java 11", "Java 17" -> " -> LTS";
            default -> " -> OK";
        };
    }

    public static void main(String[] args) {
        // null
        System.out.println(verifyStringBefore17("Java 16"));
        System.out.println(verifyStringBefore17("Java 11"));
        System.out.println(verifyStringBefore17(""));
        System.out.println(verifyStringBefore17(null));

        System.out.println(verifyStringInJava17("Java 16"));
        System.out.println(verifyStringInJava17("Java 11"));
        System.out.println(verifyStringInJava17(""));
        System.out.println(verifyStringInJava17(null));

    }
}
