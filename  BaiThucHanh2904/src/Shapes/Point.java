package Shapes;

import java.util.Scanner;

public class Point {
   private String TenDiem;
   private float HoanhDo;
   private float TungDo;

    public String getTenDiem(){
        return TenDiem;
    }
    public void setTenDiem(String TenDiem){
        this.TenDiem = TenDiem;
     }
    public double getTungDo(){
        return TungDo;
    }
    public void setTungDo(Float TungDo){
        this.TungDo=TungDo;
    }   
    public double getHoanhDo(){
        return HoanhDo;
    }   
    public void setHoanhDo(Float HoanhDo){
        this.HoanhDo = HoanhDo;
     }
    public void nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap ten diem:");
        TenDiem=sc.nextLine();
        System.out.print("Nhap hoanh do :");
        HoanhDo=sc.nextFloat();
        System.out.print("Nhap tung do :");
        TungDo=sc.nextFloat();
        sc.close();
    }
    public void hienthi(){
     System.out.printf("%s(%f,%f)",TenDiem,HoanhDo,TungDo);
    }
}
