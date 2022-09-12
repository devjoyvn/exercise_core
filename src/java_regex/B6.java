package java_regex;

import java.util.regex.Pattern;

/**
 * Kiểm tra tên của tệp hình ảnh. Biết rằng các hình ảnh có cấu trúc dạng <name>.<extension>.
 * Biết extension là một trong các chuỗi: jpg, png, gif, bmp và name không được bắt đầu bằng ký tự khoảng trắng. 
 */
public class B6 {

    public static void main(String[] args) {
        String regex = "([^\\s]+(\\.(?i)(jpg|png|gif|bmp))$)";
        // match
        System.out.println("Case 1: " + Pattern.matches(regex, "a.png"));
        System.out.println("Case 2: " + Pattern.matches(regex, "..gif"));
        System.out.println("Case 3: " + Pattern.matches(regex, "abc.bmp"));
        System.out.println("Case 4: " + Pattern.matches(regex, "xyz.jpg"));

        // don't match
        System.out.println("Case 6: " + Pattern.matches(regex, ".png"));
        System.out.println("Case 7: " + Pattern.matches(regex, "jpg"));
    }
}
