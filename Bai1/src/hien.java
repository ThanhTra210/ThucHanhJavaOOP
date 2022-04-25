import java.util.Scanner;

public class hien {
    public static void main(String[] args) throws Exception {
        int n, sodu, tong = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nguyen duong bat ky");
        n = sc.nextInt();
        while ( n > 0){
            sodu = n % 10;
            n = n / 10;
            tong += sodu;
        }
        System.out.println("Tong cac chu so = " + tong);
    }
}
