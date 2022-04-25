import java.util.Scanner;

import javax.xml.ws.soap.MTOM;

public class App {
    public static void main(String[] args) throws Exception {
       Double hesoA, hesoB, hesoC, X1, X2, delta;
       Scanner sc = new Scanner(System.in);
       System.out.println(" Nhap vao he so A");
       hesoA = sc.nextDouble();
       System.out.println(" Nhap vao he so B");
       hesoB = sc.nextDouble();
       System.out.println(" Nhap vao he so C");
       hesoC = sc.nextDouble();
       delta = (hesoB*hesoB) - (4*hesoA*hesoC);
       if (delta <0){
           System.out.println("Phuong trinh vo nghiem");
       }
       else if ( delta == 0){
           X1 = -hesoB / ( 2 * hesoA);
           System.out.println(" Phuong trinh co nghiem kep X1 = X2 =" + X1);
       }
       else {
           X1 = (-hesoB + Math.sqrt(delta))/(2*hesoA);
           X2 = (-hesoB - Math.sqrt(delta))/(2*hesoA);
           System.out.println(" Phuong trinh co hai nghiem phan biet X1 =" +X1 + ",X2=" +X2);

       }


    }
}
