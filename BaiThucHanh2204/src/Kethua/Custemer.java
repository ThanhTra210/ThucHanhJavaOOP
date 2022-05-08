package Kethua;

import java.util.Scanner;

public class Custemer extends Person {
    protected int Diachi;
    Scanner sc = new Scanner(System.in);
    public void nhapdiachi(){
        System.out.print("Nhap dia chi :");
        Diachi=sc.nextInt();
    }
    public void xuatdiachi(){
        System.out.println("Dia chi"+Diachi);
    } 
}
