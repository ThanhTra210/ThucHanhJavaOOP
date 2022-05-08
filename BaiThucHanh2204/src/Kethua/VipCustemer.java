package Kethua;

import java.util.Scanner;

public class VipCustemer extends Person{
    protected int solanden;
    Scanner sc = new Scanner(System.in);
    public void nhapsolanden(){
        System.out.print("So lan den:");
        solanden=sc.nextInt();
    }
    public void xuatsolanden(){
        System.out.println("So lan den:"+solanden);
    }
    
}