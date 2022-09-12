package java_regex;

import java.util.regex.Pattern;

/**
 * Viết chương trình kiểm tra định dạng của địa chỉ email. Cho email đinh dạng đính thoả mãn các điều kiện sau:
 * - Bắt đầu bằng ký tự a-z hoặc A-Z - (^[a-zA-Z]+).
 * - Email không được chứa các ký tự đặt biệt - ([a-zA-Z0-9]*)
 * - @ xuất hiện 1 lần trong sau nó là các chữ cái, ví dụ @gmail, @yahoo etc - (@{1}[a-zA-Z]+).
 * - Email kết thúc với .com - mail.com$
 */

public class B2 {
    public static void main(String[] args) {

        String regex = "^[a-zA-Z]+[a-zA-Z0-9]*@{1}[a-zA-Z]+mail.com$";

        System.out.println("Case 1: " + Pattern.matches(regex, "123nthanhhai@gmail.com"));

        System.out.println("Case 2: " + Pattern.matches(regex, "nthanhhai@@gmail.com"));

        System.out.println("Case 3: " + Pattern.matches(regex, "Nthanhhai@gmail"));

        System.out.println("Case 4: " + Pattern.matches(regex, "nthanhhai@gmail.com"));


    }
}
