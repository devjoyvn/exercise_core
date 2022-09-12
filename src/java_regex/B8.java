package java_regex;

import java.util.regex.Pattern;

/**
 * Kiểm tra định dạng 12 giờ. Định dạng 12 theo mẫu hh.mm am|pm
 */

public class B8 {
    public static void main(String[] args) {
        String regex = "(1[012]|[1-9]):[0-5][0-9](\\s)?(?i)(am|pm)";

        // match
        System.out.println("Case 1: " + Pattern.matches(regex, "1:00am"));
        System.out.println("Case 2: " + Pattern.matches(regex, "1:00 am"));
        System.out.println("Case 3: " + Pattern.matches(regex, "1:00 pm"));
        System.out.println("Case 4: " + Pattern.matches(regex, "12:50 PM"));

        // don't match
        System.out.println("Case 6: " + Pattern.matches(regex, "0:00 am"));
        System.out.println("Case 7: " + Pattern.matches(regex, "1:00"));
        System.out.println("Case 7: " + Pattern.matches(regex, "1:00  am"));
        System.out.println("Case 7: " + Pattern.matches(regex, "10:66 am"));
        System.out.println("Case 7: " + Pattern.matches(regex, "23:50 AM"));
    }
}
