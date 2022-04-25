import java.util.Scanner;
public class App2 {
    public static void main(String[] args) throws Exception {    
    double A1, A2, B1, B2, C1, C2, D, Dx, Dy;
    try (Scanner abc = new Scanner(System.in)) {
        System.out.println("Nhap vao he so A1:");
            A1 = abc.nextDouble();
        System.out.println("Nhap vao he so A1:"); 
            B1 = abc.nextDouble();  
        System.out.println("Nhap vao he so C1;");
            C1 = abc.nextDouble();
        System.out.println("Nhap vao he so A2;");
            A2 = abc.nextDouble();
        System.out.println("Nhap vao he so B1;");
            B2 = abc.nextDouble();
        System.out.println("Nhap vao he so C2;");
            C2 = abc.nextDouble();
    }
    D = A1 * B2 - A2 * B1;
    Dx = C1 * B2 - C2 * B1;
    Dy = A1 * C2 - A2 * C1;
    if (D==0) {
        if (Dx + Dy == 0)
            System.out.println("He phuong trinh co vo so nghiem !");
        else
            System.out.println("He phuong trinh vo nghiem !");
    }                           
    else {
        double x = Dx / D;
            System.out.println("x ="+x);
        double y = Dy / D;
            System.out.println("y ="+y);
    }
}
}