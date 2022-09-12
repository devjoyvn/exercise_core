package java_regex;

import java.util.regex.Pattern;

/**
 * Kiểm tra định dạng 24h
 */

public class B9 {
    public static void main(String[] args) {
        String regex = "([01]?[0-9]|2[0-3]):[0-5][0-9]";

        // match
        System.out.println("Case 1: " + Pattern.matches(regex, "1:00"));
        System.out.println("Case 2: " + Pattern.matches(regex, "23:00"));
        System.out.println("Case 3: " + Pattern.matches(regex, "00:00"));
        System.out.println("Case 4: " + Pattern.matches(regex, "0:00"));
        System.out.println("Case 4: " + Pattern.matches(regex, "23:59"));

        // don't match
        System.out.println("Case 6: " + Pattern.matches(regex, "24:00"));
        System.out.println("Case 7: " + Pattern.matches(regex, "12:60"));
        System.out.println("Case 7: " + Pattern.matches(regex, "13:1"));

    }
}
