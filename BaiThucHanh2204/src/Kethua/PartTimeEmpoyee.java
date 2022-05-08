package Kethua;

import java.util.Scanner;

public class PartTimeEmpoyee extends Employee {
    protected int sogiolam;
    Scanner sc=new Scanner(System.in);
    public void nhapsogio(){
        System.out.print("Nhap so gio lam trong ngay:");
       
        sogiolam=sc.nextInt();
       
    }
    public void insogiolam(){
       System.out.println("So gio da lam"+sogiolam); 
    }
    
}