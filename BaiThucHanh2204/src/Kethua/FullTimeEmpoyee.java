package Kethua;

import java.util.Scanner;

public class FullTimeEmpoyee extends Employee {
    protected int songaylam;
    Scanner sc=new Scanner(System.in);
    public void nhapsongaylam(){
        System.out.print("Nhap so ngay da lam trong thang:");  
        songaylam=sc.nextInt();
        
    }
    public void insongaylam(){
        System.out.println("So ngay da lam"+songaylam);
    }
}