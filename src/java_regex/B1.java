package java_regex;

import java.util.regex.Pattern;

/**
 *  Viết chương trình kiểm tra ký tự đầu tiên của chuỗi có phải là chữ in hoa hay không?
 */

public class B1 {

    public static void main(String[] args) {

        // case 1
        String regex = "^[A-Z].*";
        System.out.println("Case 1: ");
        if (Pattern.matches(regex, "Shareprogramming.net")) {
            System.out.println("Ky in hoa");
        } else {
            System.out.println("Ky tu thuong");
        }

        // case 2
        System.out.println("Case 2: ");
        if (Pattern.matches(regex, "shareprogramming.net")) {
            System.out.println("Ky in hoa");
        } else {
            System.out.println("Ky tu thuong");
        }
    }

}
