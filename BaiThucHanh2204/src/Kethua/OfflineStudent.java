package Kethua;

import java.util.Scanner;

public class OfflineStudent extends Student {
    protected String Diemdanh;
    Scanner sc =new Scanner(System.in);  
    public void nhapdiemdanh(){
        
        System.out.print("Nhap tinh trang diem danh:");    
       
        Diemdanh=sc.nextLine();
    
    }
    public void xuatdiemdanh(){
        System.out.println("Tinh trang: " + Diemdanh);
    }
    
}
