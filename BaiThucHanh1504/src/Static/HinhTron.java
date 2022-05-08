package Static;
import java.util.Scanner;
public class HinhTron {
    protected float banKinh;
    private Scanner sc;
    public HinhTron(){
        super();
        sc = new Scanner(System.in);
    }
    public void nhapBanKinh() {
        System.out.println("Ban dung don vi nao: ");
        System.out.println("\t1 - Centimet");
        System.out.println("\t2 - Inch");
        Configs.donVi = sc.nextInt();
        System.out.println("Hay nhap ban kinh Hinh tron: ");
        banKinh = sc.nextFloat();
    }
    public void inThongTin() {
        if (Configs.donVi == Configs.Don_Vi_Cm) {
            System.out.println("Hinh tron co ban kinh: "+ banKinh + " cm");
            System.out.println("Tuong duong " + Configs.Chuyen_Cm_Sang_Inch(banKinh) + " inch");
        } else {
            System.out.println("Hinh tron co ban kinh: "+ banKinh + " inch");
            System.out.println("Tuong duong " + Configs.Chuyen_Inch_Sang_Cm(banKinh) + " cm");
        }
    }
}

