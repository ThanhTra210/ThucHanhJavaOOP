import java.util.Scanner;

public class tea {
    public static void main(String[] args) throws Exception {
     //Khai bao bien
     int a, b, tmp;
     //Khai bao  Scanner de doc du lieu
     Scanner sc = new Scanner(System.in);
     //Nhap hai so
     System.out.println("Nhap so a: ");
     a = sc.nextInt();
     System.out.println("Nhap so b: ");
     b = sc.nextInt();
     if(a<b)
     {
         tmp = a;
     }
     else
     {
         tmp = b;
     }
     System.out.println("So nho nhat trong hai so " + a +" va "+ b + " la: "+ tmp );
     sc.close();
    } 
}
