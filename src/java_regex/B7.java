package java_regex;

import java.util.regex.Pattern;

/**
 * Kiểm tra tính hợp lệ của địa chỉ IP v4. Như chúng ta biết địa chỉ IP v4 có dạng aaa.bbb.ccc.ddd. Với quy luật sau:
 *
 * Nếu bắt đầu với số 0 hoặc 1 thì 2 chữ số còn lại tuỳ ý từ 0 - 9 ([01]?\\d\\d).
 * Nếu bắt đầu bằng số 2, thì ký số thứ 2 nằm trong khoảng từ 0 - 4, ký tự cuối cùng tuỳ ý (2[0-4]\\d).
 * Nếu bắt đầu bằng 25 thì ký tự còn lại từ 0 - 5 (25[0-5]).
 */

public class B7 {
    public static void main(String[] args) {
        String regex = "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";
        // match
        System.out.println("Case 1: " + Pattern.matches(regex, "1.1.1.1"));
        System.out.println("Case 2: " + Pattern.matches(regex, "255.255.255.255"));
        System.out.println("Case 3: " + Pattern.matches(regex, "192.168.1.1"));
        System.out.println("Case 4: " + Pattern.matches(regex, "127.0.0.1"));

        // don't match
        System.out.println("Case 6: " + Pattern.matches(regex, "10.10.10"));
        System.out.println("Case 7: " + Pattern.matches(regex, "a.a.a.a"));
        System.out.println("Case 7: " + Pattern.matches(regex, "222.222.2.999"));
        System.out.println("Case 7: " + Pattern.matches(regex, "22.2222.22.2"));
    }

}
