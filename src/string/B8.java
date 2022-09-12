package string;

/**
 * B8. Replace character
 *
 * Cho một chuỗi str, chuyển các ký tự được chỉ định sang một ký tự khác cho trước.
 * Ví dụ "shareprogramming.net" chuyển 'e' sang '*' kết qủa "shar*programming.n*t".
 */

public class B8 {
    public static void main(String[] args) {
        String str = "shareprogramming.net";

        System.out.println(replaceStr1(str, 'e', '*'));
        System.out.println(replaceStr2(str, 'e', '*'));
        System.out.println(replaceStr2(null, 'e', '*'));
    }

    public static String replaceStr1(String str, char oldValue, char newValue) {
        if (str == null) {
            return "";
        }
        return str.replace(oldValue, newValue);
    }

    public static String replaceStr2(String str, char oldValue, char newValue) {
        if (str == null) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != oldValue) {
                stringBuilder.append(str.charAt(i));
            } else {
                stringBuilder.append(newValue);
            }
        }
        return stringBuilder.toString();
    }
}
