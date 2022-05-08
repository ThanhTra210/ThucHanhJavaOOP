import java.util.Scanner;

public class App1 {
    public static void main(String[] args) throws Exception {
        int a,b;
        Scanner sc = new Scanner(System.in);
          System.out.println("Nhap so a: ");
             a= sc.nextInt();
            if (a < 0)
                System.out.println("Gia tri khong hop le. Vui long nhap lai.");
            System.out.println("Nhap so b: ");
             b = sc.nextInt();
             if (b < 0)
                System.out.println("Gia tri khong hop le. Vui long nhap lai.");
        while(a!=b);
        {
            if (a > b)
                 a-=b;
            else
                 b-=a;
        }
        System.out.printf("Uoc chung lon nhat cua hai so la :%d" ,a);
        sc.close();
    }
}
