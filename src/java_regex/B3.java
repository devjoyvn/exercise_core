package java_regex;

import java.util.regex.Pattern;

/**
 * Kiểm tra định dạng của số điện thoại. Biết rằng số điện thoại có 10 chữ số, bắt đầu bằng số 0. Số tiếp theo không được là số 0.
 */
public class B3 {
    public static void main(String[] args) {

        String regex = "^0{1}[1-9]{1}[0-9]{8}$";

        System.out.println("Case 1: " + Pattern.matches(regex, "9876543"));

        System.out.println("Case 2: " + Pattern.matches(regex, "0978191010"));

        System.out.println("Case 3: " + Pattern.matches(regex, "0078191010"));

        System.out.println("Case 4: " + Pattern.matches(regex, "0911241241124124124"));

        System.out.println("Case 5: " + Pattern.matches(regex, "shareprogramming.next"));

    }
}
