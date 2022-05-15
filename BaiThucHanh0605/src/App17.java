import java.util.ArrayList;

public class App17 {
    public static void main(String[] args) {
        ArrayList <Integer> arrayListInterger = new ArrayList<>();
        arrayListInterger.add(0);
        arrayListInterger.add(7);
        arrayListInterger.add(1);
        arrayListInterger.add(9);
        System.out.println("Các phần tử có trong arrListInteger là :");
        for (int number : arrayListInterger)
            System.out.print(number + "\t");
           
            System.out.println("\n");
            arrayListInterger.set(1, 2);
            arrayListInterger.remove(3);
            for (int number : arrayListInterger)
            System.out.println(arrayListInterger.get(number) +"\t");
    }
}