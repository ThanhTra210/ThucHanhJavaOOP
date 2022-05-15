import java.util.ArrayList;
import java.util.Iterator;

public class App18 {
public static void main(String[] args){
    ArrayList<Float> arraylistFloat = new ArrayList<>();
    arraylistFloat.add(0.7f);
    arraylistFloat.add(7.26f);
    arraylistFloat.add(1.02f);
    arraylistFloat.add(9.3f);
    Iterator<Float> interator = arraylistFloat.iterator();
    System.out.println("Các phần tử có trong arrayListFloat là :");
    while (interator.hasNext()){
        System.out.println(interator.next()+ "\t");
    }
}
}
