import java.util.Scanner;

public class App2 {
    public static void main(String[] args) throws Exception {
        float a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so a: ");
             a= sc.nextInt();
        System.out.println("Nhap so b: ");
             b= sc.nextInt();
        System.out.println("Nhap so c: ");
             c= sc.nextInt();
    if( a<b+c && b<a+c && c<a+b ){   
        if(a==b && b==c)
        System.out.println("Day la tam giac deu");
        else if((a==b || a==c || b==c)&&(a*a==b*b+c*c || b*b==a*a+c*c || c*c== a*a+b*b))
        System.out.println("Day la tam giac vuong can");
        else if(a==b || a==c || b==c)
        System.out.println("Day la tam giac can");
        else if (a*a==b*b+c*c || b*b==a*a+c*c || c*c== a*a+b*b)
        System.out.println("Day la tam giac vuong");
        else 
        System.out.println("Day la tam giac thuong");
    }
    else  
    System.out.println("Ba canh vua nhap khong phai ba canh cua tam giac.Khong the xac dinh tam giac");
    sc.close() ;
}
}
