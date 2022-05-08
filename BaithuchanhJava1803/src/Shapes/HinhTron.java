package Shapes;
import java.util.Scanner;

public class HinhTron {
    final float PI = 3.14f; 
    float BanKinh = 0;
    float ChuVi; 
    float DienTich;
    public void NhapBanKinh() {
        System.out.println("Nhap vao Ban Kinh Hinh Tron: ");
        Scanner sc = new Scanner(System.in);
        BanKinh = sc.nextFloat();
    }
    public float GetBanKinh() {
        return BanKinh;
    }
    public float TinhDienTich() {
        DienTich = PI* BanKinh * BanKinh;
        return DienTich;
    }
    public float TinhChuVi() {
        ChuVi = 2 * PI * BanKinh;
        return ChuVi; 
    }
    public void InDienTich() {
        System.out.println(" Dien tich cua Hinh Tron la: " + TinhDienTich());
    }
    public void InChuVi() {
        System.out.println(" Chu vi Hinh Tron la :" + TinhChuVi());
    }

}
