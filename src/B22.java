package com.company;

import java.util.Scanner;

/*
    22, Nhập vào số nguyên dương n (n > 0) từ cửa sổ màn hình console. 
    Kiểm tra số nguyên dương là hoàn hảo hay không? Số hoàn hảo là số có giá trị 
    bằng tổng các ước số. Ví dụ: 6 = 1 + 2 + 3
*/

public class B22 {
    public static void main(String[] args) {

        int n;
        boolean res;
        Scanner sc;
        do {
            System.out.print("Input n = ");
            sc = new Scanner(System.in);
            n = sc.nextInt();
        } while (n <= 0);

        res = check_perfect_num(n);
        if (res) {
            System.out.println(n + " la so hoan hao");
        } else {
            System.out.println(n + " khong la so hoan hao");
        }

        sc.close();
    }

    public static boolean check_perfect_num(int n) {

        int sum_aliquots = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum_aliquots += i;
            }
        }
        if (sum_aliquots == n) {
            return true;
        } else {
            return false;
        }
    }

}
