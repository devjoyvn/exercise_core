package string;

/**
 * Đếm số lượng ký tự nguyên âm và phụ âm xuất hiện trong chuỗi.
 * Ví dụ chuỗi "java" có 2 nguyên âm "a" và 2 phụ âm "j" và "v".
 */

public class B6 {
    public static void main(String[] args) {
        countVowels("java");
        countVowels("share");
    }

    public static void countVowels(String str) {
        char[] chars = str.toCharArray();
        int count = 0;
        for (char c : chars) {
            switch (c) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    count++;
                    break;
            }
        }

        System.out.println("Nguyen am cua : " + str + ": " + count);

        System.out.println("Phu am cua: " + str + ": " + (str.length() - count));
    }
}
