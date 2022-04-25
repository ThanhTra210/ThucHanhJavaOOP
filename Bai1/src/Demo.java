import java.util.Scanner;

public class Demo {
    public static void main(String[] args) throws Exception {
       int A[] = new int [10];
       Scanner sc = new Scanner(System.in);
       for ( int i = 0; i < 10; i ++){
           System.out.println("Nhap A[" + (i+1) + "]=");
           A[i] = sc.nextInt();
       }
       for ( int i = 0; i < A.length; i ++){
           System.out.println("A[" + (i+1) + "]=" + A[i]);
       }


    }
}
