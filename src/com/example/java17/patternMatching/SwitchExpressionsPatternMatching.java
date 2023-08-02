package com.example.java17.patternMatching;

public class SwitchExpressionsPatternMatching {

    private static String formatterBefore16(Object o) {
        String formatted = "unknown";
        if (o instanceof String) {
            String s = (String) o;
            formatted = String.format("String %s", s);
        } else if (o instanceof Integer) {
            Integer i = (Integer) o;
            formatted = String.format("int %d", i);
        } else if (o instanceof Double) {
            Double d = (Double) o;
            formatted = String.format("double %f", d);
        }
        return formatted;
    }

    private static String formatterIn16(Object o) {
        String formatted = "unknown";
        if (o instanceof String s) {
            formatted = String.format("String %s", s);
        } else if (o instanceof Integer i) {
            formatted = String.format("int %d", i);
        } else if (o instanceof Double d) {
            formatted = String.format("double %f", d);
        }
        return formatted;
    }

    // preview
    private static String formatterIn17(Object o) {
        return switch (o) {
            case String s -> String.format("String %s", s);
            case Integer i -> String.format("int %d", i);
            case Double d -> String.format("double %f", d);
            default -> o.toString();
        };
    }


    public static void main(String[] args) {

        // Improved instanceOf checking
        System.out.println(formatterBefore16("Java 15"));
        System.out.println(formatterBefore16(15));

        System.out.println(formatterIn16("Java 16"));
        System.out.println(formatterIn16(16));

        System.out.println(formatterIn17("Java 17"));
        System.out.println(formatterIn17(17));
    }
}
