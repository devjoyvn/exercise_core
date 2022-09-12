package java_regex;

import java.util.regex.Pattern;

/**
 * Kiểm tra định dạng của password có định dạng sau
 *
 * Chứa ký số từ 0 đến 9 - (?=.*\d)
 * Chứa ký tự thường và in hoa - (?=.*[a-z])
 * Chứa ký tự in hoa - (?=.*[A-Z])
 * Phải chứa các ký tự đặc biệt @#$% - (?=.*[@#$%])
 * Độ dài password ít nhất 6 ký tự đến lớn nhất là 20 ký tự {6, 20}
 */

public class B4 {
    public static void main(String[] args) {
        String regex = "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,20})";
        System.out.println("Case 1: " + Pattern.matches(regex, "Yourpassword123#"));
        System.out.println("Case 2: " + Pattern.matches(regex, "yourpassword123#"));
        System.out.println("Case 3: " + Pattern.matches(regex, "Yourpassword#"));
        System.out.println("Case 4: " + Pattern.matches(regex, "Yourpassword123"));
    }
}
