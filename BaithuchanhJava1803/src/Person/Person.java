package Person;

import java.util.Scanner;

public class Person {
    String PersonID;
    String PersonName;
    Boolean Gender;
    String Address;
    public void Nhapthongtin() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhap thong tin ID: ");
        PersonID = sc.nextLine();
        System.out.println("Nhap Ho ten: ");
        PersonName = sc.nextLine();
        System.out.println("Nhap dia chi: ");
        Address = sc.nextLine();
        System.out.println("Nhap Gender: ");
        Gender = sc.nextBoolean();
    }
    public void InThongtin() {
        System.out.println("ID: " + PersonID);
        System.out.println("Ho ten: " + PersonName);
        System.out.println("Dia chi: " +Address);
        System.out.println("Gender: " + Gender);
    }

}
