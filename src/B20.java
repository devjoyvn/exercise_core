import java.util.Scanner;

/*
20, Viết chương trình liệt kê tất cả các số nguyên tố có 5 chữ số sao cho tổng của các chữ số trong mỗi số nguyên tố đều bằng S cho trước.

 */
public class B20 {

    public static boolean checkSNT(int n) {

        if (n > 1) {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) return false;
            }
            return true;
        } else return false;
    }

    public static int tongChuSo(int n) {

        int T = 0;
        while (n > 0) {
            T += n % 10;
            n /= 10;
        }
        return (T);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap S= ");
        int s = scanner.nextInt();
        int i, count = 0;
        System.out.println("Cac so nguyen to co tong cac chu so co tong bang " + s + " la: ");
        for (i = 10000; i <= 99999; i++) {
            if (checkSNT(i)) {
                if (tongChuSo(i) == s) {
                    System.out.println(" " + i);
                    count++;
                } else continue;
            }
        }
        System.out.println("Co " + count + " so thoa man");

    }
}
