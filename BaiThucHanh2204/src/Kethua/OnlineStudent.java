package Kethua;

import java.util.Scanner;

public class OnlineStudent extends Student {
    protected String Hientrang;
    Scanner sc=new Scanner(System.in);
    public void nhapHientrang(){
        System.out.print("Nhap hien trang:");
        
        Hientrang=sc.nextLine();
        
    } 
    public void inTrangThai() {
        System.out.println("Hien trang: " + Hientrang);
    }
}
