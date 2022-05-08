package Person;

import java.sql.Date;
import java.util.Scanner;

public class SinhVien {
    String MaSinhVien;
    String HoTen;
    Boolean GioiTinh;
    String NgaySinh;
    public void NhapThongTinSv() {
        System.out.println("Nhap Ma Sinh Vien: ");
        Scanner sc = new Scanner(System.in);
        MaSinhVien = sc.nextLine();
        System.out.println("Nhap Ho Ten: ");
        HoTen = sc.nextLine();
        System.out.println(" Nhap Ngay Sinh: ");
        NgaySinh = sc.nextLine();
        System.out.println("Nhap Gioi Tinh: ");
        GioiTinh =sc.nextBoolean();
    }
    public void InThongTinSv() {
        System.out.println("MSV: " +MaSinhVien);
        System.out.println("Ho Ten: " + HoTen);
        System.out.println("Ngay Sinh: " +NgaySinh);
        System.out.println("Gioi Tinh: " +GioiTinh);
    }
}
