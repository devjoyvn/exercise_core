package string;

import java.util.HashSet;
import java.util.Set;

/**
 * B11. Remove character duplicate
 *
 * Cho một chuỗi str, xoá các ký tự xuất hiện nhiều hơn một lần trong chuỗi và chỉ giữ lại ký tự đầu tiên, vi dụ bananas => bans
 */

public class B11 {
    public static void main(String[] args) {

        System.out.println(removeDuplicateChar("bananas"));
        System.out.println(removeDuplicateChar(""));
    }

    public static String removeDuplicateChar(String str) {
        Set<Character> charsPresent = new HashSet<>();
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < str.length(); i++) {
            if (!charsPresent.contains(str.charAt(i))) {
                stringBuilder.append(str.charAt(i));
                charsPresent.add(str.charAt(i));
            }
        }

        return stringBuilder.toString();
    }
}
