import java.util.Scanner;

public class App90 {
    public static void main(String[] args)throws Exception{
        String Chuoi;
        char KyTu;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao chuoi ki tu bat ky: ");
        Chuoi = sc.nextLine();
        for (int i = 0;i < Chuoi.length();i++)
        {
            KyTu = Chuoi.charAt(i);
            System.out.println(KyTu);
        }
        sc.close();
    }
}
