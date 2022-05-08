import java.util.Scanner;

//su dung tu khoa extends de ke thua tu lop Person
public class Student extends Person {
   String StudentCode;
   String University;
   @Override
   public void NhapThongTin(){
       Scanner scc = new Scanner(System.in);
       //goi toi phuong thuc nhap thong tin o lop Person
       super.NhapThongTin();
       System.out.println("Nhap truong hoc: ");
       University = scc.nextLine();
       System.out.println("Nhap ma sinh vien");
       StudentCode = scc.nextLine();
       scc.close();
   }
   @Override
   public void InThongTin(){
       //super.InThongTin();
       System.out.println("Ma sinh vien: " + StudentCode);
   }
}
