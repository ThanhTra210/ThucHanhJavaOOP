package Kethua;

import java.util.Scanner;

public class Student extends Person {
    protected int MSV;
    Scanner sc=new Scanner(System.in);
    public void nhapthongtinsinhvien(){
        System.out.print("Nhap tuoi sinh vien:");
    
        tuoi=sc.nextInt();
        System.out.print("Nhap ten sinh vien:");   
        ten=sc.nextLine();
        sc.nextLine();

        System.out.print("Nhap ma sinh vien:");
        MSV=sc.nextInt();
        
    }
    public void inMSV(){
        System.out.println("Ma sinh vien:"+MSV);
    }  
}