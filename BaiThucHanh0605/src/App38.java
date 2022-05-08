import java.util.LinkedList;

public class App38 {
    public static void main(String[] args) {
        LinkedList<String> list= new LinkedList<String>();
        list.add("Java");
        list.add("C++");
        list.add("PHV");
        list.add("Java");
        System.out.println( "Ví dụ sử dụng phương thức addALL()");
        System.out.println("-----------------------------------");
        LinkedList<String> listA = new LinkedList<String>();
        listA.addAll(list);
        System.out.println("ListA :");
        showList(listA);
        System.out.println("Ví dụ sử dụng phương thức retainAll()");
        System.out.println("-------------------------------------");
        LinkedList<String> listB = new LinkedList<String>();
        listB.add("Java");
        listA.retainAll(listB);
        System.out.print("List A");
        showList(listA);
        System.out.println("\n Ví dụ sử dụng phương thức removeAll()");
        System.out.println("----------------------------------------");
        list.removeAll(listB);
        System.out.println("List:");
        showList(list);
    }
    public static void showList(LinkedList<String> list){
        for (String obj: list){
            System.out.println("\t" + obj + ",");

        }
        System.out.println();
    }
}

