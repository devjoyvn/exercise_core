package java_regex;

import java.util.regex.Pattern;

/**
 * Kiểm tra mã màu ở dạng thâp lục phân.Biết rằng mã màu ở dạng thập lục bắt đầu bằng ký tự #.
 * Các các ký số trong khoảng a-f hoặc A-F hoặc là các ký số từ 0-9 với chiều dài 3 hoặc 6 ký tự.
 */
public class B5 {
    public static void main(String[] args) {
        String regex = "^#([A-Fa-f0-9]{6}|[A-Fa-f0-9]{3})$";
        // match
        System.out.println("Case 1: " + Pattern.matches(regex, "#1f1f1F"));
        System.out.println("Case 2: " + Pattern.matches(regex, "#AFAFAF"));
        System.out.println("Case 3: " + Pattern.matches(regex, "#1AFFa1"));
        System.out.println("Case 4: " + Pattern.matches(regex, "#222fff"));
        System.out.println("Case 5: " + Pattern.matches(regex, "#F00"));

        // don't match
        System.out.println("Case 6: " + Pattern.matches(regex, "123456"));
        System.out.println("Case 7: " + Pattern.matches(regex, "#123abce"));
    }
}
