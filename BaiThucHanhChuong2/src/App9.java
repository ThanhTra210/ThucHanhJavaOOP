import java.util.Scanner;

public class App9 {
    public static void main(String[] args) throws Exception{
        String Chuoi;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap 1 chuoi: ");
        Chuoi = sc.nextLine();
        int dem = Chuoi.length();
        char KyTu;
        System.out.println("Chuoi co " + dem + " ky tu. Bao gom: ");
        for(int i = 0;i < dem ; i++)
        {
            KyTu = Chuoi.charAt(i);
            System.out.println(KyTu);
        }
        sc.close();
    }
}
