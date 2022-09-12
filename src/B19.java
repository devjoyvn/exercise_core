import java.util.Scanner;

/*
    19, Nhập số liệu cho dãy số thực a0 , a1 ,..., an-1 . In ra màn hình số lần xuất hiện của các phần tử.
 */
public class B19 {
    public static int countElement(int a[], int n, int i){

        int count= 0;
        for(int j=0 ; j<n ; j++){
            if(a[j]== i)
                count ++;
        }
        return (count);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n,i;

        System.out.println("Nhap n= ");
        n= scanner.nextInt();
        int[] array= new int[n];
        for(i=0 ; i<n ; i++){
            System.out.println("Nhap phan tu thu " +(i+1)+" ");
            array[i]= scanner.nextInt();
        }
        for(i=0 ; i<n ; i++){
            if(countElement(array, i, array[i])==0){
                System.out.println("Phan tu "+array[i]+ " xuat hien "+countElement(array, n,

                        array[i])+" lan");
            }
        }

    }
}
