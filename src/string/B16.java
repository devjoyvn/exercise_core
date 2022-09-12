package string;

/**
 * 16. Viết chương trình in tất cả các chuỗi có thể có từ các ký tự của một chuỗi cho trước.
 */
public class B16 {

    public static void main(String[] args) {
        permutationWithRepeation("PQR");

    }

    private static void permutationWithRepeation(String str1) {
        System.out.println("The given string is: PQR");
        System.out.println("The permuted strings are:");
        showPermutation(str1, "");
    }

    private static void showPermutation(String str, String newStr) {
        if (newStr.length() == str.length()) {
            System.out.println(newStr);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            showPermutation(str, newStr + str.charAt(i));
        }
    }
}

/**
 * PQR P
 * I = 0 =>
 *      PQR PP I=0 PQR PPP
 *      PQR PP I=1 PQR PPQ
 *      PQR PP I=2 PQR PPR
 * I = 1 =>
 *      PQR PQ I=0 PQR PQP
 *      PQR PQ I=1 PQR PQQ
 *      PQR PQ I=2 PQR PQR
 */
