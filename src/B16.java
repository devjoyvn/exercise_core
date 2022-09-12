import java.util.Scanner;

/*
    16, Viết chương trình liệt kê tất cả các số nguyên tố nhỏ hơn n cho trước.

 */
public class B16 {

    public static boolean checkSNT(int n) {

        if (n > 1) {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) return false;
            }
            return true;
        } else return false;
    }

    public static void lietKe(int n) {
        System.out.print(" 2");
        for (int i = 3; i < n; i += 2) {
            if (checkSNT(i)) System.out.print(" " + i);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = scanner.nextInt();
        System.out.println("Cac so nguyen to nho hon " + n + " ");
        lietKe(n);
    }
}
