package string;
import java.util.regex.Pattern;

/**
 *
 * tránh sử dụng String ví nó có tính chất immutable việc thao tác trên chúng sẽ khiến nó tạo thêm một String mới gây hao tổn bộ nhớ. 
 *
 * Source code tham khảo
 *
 * Bài 5. String not contains digit
 *
 * Kiểm tra một chuỗi có chứa chữ số hay không, nếu có in ra false ngược lại true.
 *
 * Ví dụ
 *
 * "abc", "" => true
 *
 * "1abc", "abc1", "123", "a1bc", null => false
 */
public class B5 {
    public static void main(String[] args) {

        System.out.println(isContainsNumber1("acbdefgh"));
        System.out.println(isContainsNumber1("acbde4fgh"));
        System.out.println(isContainsNumber1("acbdefgh23"));
        System.out.println(isContainsNumber1("123acbdefgh"));
        System.out.println(isContainsNumber1(""));
        System.out.println(isContainsNumber1(null));

        System.out.println("---------------------------------------");

        System.out.println(isContainsNumber2("acbdefgh"));
        System.out.println(isContainsNumber2("acbde4fgh"));
        System.out.println(isContainsNumber2("acbdefgh23"));
        System.out.println(isContainsNumber2("123acbdefgh"));
        System.out.println(isContainsNumber2(""));
        System.out.println(isContainsNumber2(null));
    }

    // Su dung java regex
    public static boolean isContainsNumber1(String str) {
        if (str == null) {
            return false;
        }
//        Pattern pattern = Pattern.compile("[^0-9]*");
        // or
        Pattern pattern = Pattern.compile("\\D*");
        return pattern.matcher(str).matches();
    }

    // Loop va check
    public static boolean isContainsNumber2(String str) {
        if (str == null) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                return false;
            }
        }

        return true;
    }
}
