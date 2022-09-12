import java.util.Scanner;

/*
    Viết chương trình phân tích một số nguyên thành các thừa số nguyên tố. Ví dụ số 28 được phân tích thành 2 x 2 x 7
 */
public class B15 {

    public static boolean checkSNT(int n) {

        if (n > 1) {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) return false;
            }
            return true;
        } else return false;
    }


    public static void phanTich(int n) {
        int i = 2;
        while (n > 1) {
            if (checkSNT(i)) {
                if (n % i == 0) {
                    System.out.print(i + ".");
                    n /= i;
                } else i++;
            } else i++;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhao n: ");
        int n = scanner.nextInt();
        phanTich(n);

    }
}
