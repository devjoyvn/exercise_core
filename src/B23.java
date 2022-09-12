import java.util.Scanner;

public class B23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = scanner.nextInt();
        System.out.println(n);
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap so thu " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();

        }
        System.out.println("So nguyen am lon nhat: " + nguyenAmMax(arr, n));
    }

    static int nguyenAmMax(int a[], int n) {

        int i, max = 0;

        for (i = 0; i < n; i++) {

            if (a[i] < 0) {

                max = a[i];

                break;

            }

        }

        for (i = 0; i < n; i++) {

            if (a[i] < 0 && a[i] > max)

                max = a[i];

        }

        return max;

    }


}
