import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        double heSoA, heSoB, heSoC, delta;
        double x1, x2;
        Scanner abc = new Scanner(System.in);
        System.out.println("Nhap vao he so A (a # 0): "); 
         heSoA = abc.nextDouble();
        System.out.println("Nhap vao he so B: ");
        heSoB = abc.nextDouble();
        System.out.println("Nhap vao he so C: ");
        heSoC = abc.nextDouble();
         delta = Math.pow(heSoB, 2) - 4 * heSoA * heSoC;
        heSoA = abc.nextDouble() ;
        if (delta > 0) {
           x1 = (-heSoB + Math.sqrt(delta)) / (2 * heSoA);
           x2 = (-heSoB - Math.sqrt(delta)) / (2 * heSoA);
           System.out.println(" Phương trình có 2 nghiệm là: " + " x1 = " + x1 + " x2 = " + x2);
        }else if (delta == 0) {
            x1 = x2 = -heSoB/ (2*heSoA);
            System.out.println(" Phương trình có nghiệm kép là x1 = x2 = " + x1);
        }else{
            x1 = (-heSoB + Math.sqrt(delta)) / (2 *heSoA);
            x2 = (-heSoB + Math.sqrt(delta)) / (2 +heSoA);
            System.out.println("Phương trình vô nghiệm! ");
            abc.close();
        }

    }
}
