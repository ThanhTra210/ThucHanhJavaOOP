import java.util.Scanner;

public class Person {
    String CCCD;
    String HoTen;
    //phuong thuc nhap thong tin
    public void NhapThongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap CCCD: ");
        CCCD = sc.nextLine();
        System.out.println("Nhap ho ten: ");
        HoTen = sc.nextLine();
    }
    public void InThongTin(){
        System.out.println("CCCD: " + CCCD + ", Ho ten: " + HoTen);
    }
}
