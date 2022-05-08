import java.util.ArrayList;
import java.util.Scanner;

public class App24 {
    public static void main(String [] args) {
        ArrayList<Integer> arrayListInteger = new ArrayList<>();
        Scanner sc = new Scanner (System.in);
        int number;
        System.out.println("Nhập số phần tử của ArrayLish :");
        int n = sc.nextInt();
        for(int i = 0 ; i<n; i++){
            System.out.println("Nhập phần tử thứ " + i + ":");
            number=sc.nextInt();
            arrayListInteger.add(number);
        }
        int App24 = arrayListInteger.get(0);
        for (int i=1;i<arrayListInteger.size();i++){
            if ( arrayListInteger.get(i).compareTo(App24)>0) {
            App24 = arrayListInteger.get(i);
        }
    }
        System.out.println("Phần tử lớn nhất trong arrlistinterge =" + App24);
    }
}
