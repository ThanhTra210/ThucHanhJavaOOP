package Kethua;
import java.util.Scanner;

public class Employee extends Person {
    protected int SDT;
    Scanner sc=new Scanner(System.in);
    public void nhapSDT(){
        System.out.print("Nhap so dien thoai:");
       
        SDT=sc.nextInt();
       

    }
    public void inSDT(){
        System.out.println("So dien thoai " + SDT);
    }
}
