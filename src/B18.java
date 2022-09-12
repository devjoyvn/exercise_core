import java.util.Scanner;
/*
    18. Nhập số liệu cho dãy số thực a0 , a1 ,..., an-1 . Hãy liệt kê các phần tử xuất hiện trong dãy đúng một lần.
 */
public class B18 {
    public static int countElement(int a[], int n, int i) {

        int count = 0;
        for (int j = 0; j < n; j++) {
            if (a[j] == i)
                count++;
        }
        return (count);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n, i;
        System.out.println("Nhap n= ");
        n = scanner.nextInt();
        int[] array = new int[n];
        for (i = 0; i < n; i++) {
            System.out.println("Nhap phan tu thu " + (i + 1) + " ");
            array[i] = scanner.nextInt();
        }
        System.out.print("Cac phan tu trong day xuat hien 1 lan: ");
        for (i = 0; i < n; i++) {
            if (countElement(array, n, array[i]) == 1)

                System.out.print(" " + array[i]);
        }
    }
}
