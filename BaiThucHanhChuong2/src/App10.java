import java.util.Scanner;

public class App10 {
    public static void main(String[] args) throws Exception{
        String chuoi;
        char kytu;
        int dem = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao chuoi bat ky: ");
        chuoi = sc.nextLine();
        System.out.print("Nhap ky tu muon dem: ");
        kytu = sc.next().charAt(0);
        for (int i = 0; i < chuoi.length(); i++) {
            if (chuoi.charAt(i) == kytu) {
                dem ++;
            }
        }
        System.out.println("So lan xuat hien cua ki tu " + kytu +" la: " + dem );
        sc.close();
    }
}
