/*
    13, Viết chương trình tìm và in các số từ 1 từ 100 chia hết cho 3 và 5
    output: 15 30 45 60 75 90
 */
public class B13 {

    public static void main(String[] String) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
