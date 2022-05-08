import java.util.Scanner;

public class App4 {
    public static void main(String[] args) {
		int thang;
		
		Scanner sc= new Scanner(System.in);
		
		do {
		     System.out.println("Nhap so (1 -->12): ");
		    thang=sc.nextInt();
		    if(thang< 1 || thang>12)
		     System.out.println("Gia tri khong hop le. Vui long nhap lai.");
		
		} while (thang < 1 || thang >12);
		
		switch (thang) {
		
		case 1:System.out.println("thang mot");
		break;
		 
		case 2:System.out.println("thang hai");
		break;
		
		case 3:System.out.println("thang ba");
		break;

		case 4:System.out.println("thang 4");
		break;
		
		case 5:System.out.println("thang 5");
		break;
		
		case 6:System.out.println("thang 6");
		break;
		
		case 7:System.out.println("thang 7");
		break;
		
		case 8:System.out.println("thang 8");
		break;
		
		case 9:System.out.println("thang 9");
		break;
		
		case 10:System.out.println("thang 10");
		break;
		
		case 11:System.out.println("thang 11");
		break;
		
		case 12:System.out.println("thang 12");
		break;
	}
		

}
}
