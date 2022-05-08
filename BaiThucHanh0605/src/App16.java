import java.util.ArrayList;

public  class App16 {
    public static void main(String[] args) {
        //khai bao 1 arraylist co ten la arrliststring
        //co kieu la string
        ArrayList<String> arrListString = new ArrayList<>();
        //them cac phan tu su dung phuong thuc add
        arrListString.add("JAVA");
        arrListString.add("PHP");
        arrListString.add("C#");
        arrListString.add("C++");
        //duyet theo kich thuoc cua arrListString
        //su dung vong lap for thong thuong
        // phuong thuc arrliststring .size () se tra ve so phan tu arrListString
        //sau do lay phan tu tai vi tri thu i thong qua ham get()
        // sau do hien thi phan tu do ra
        System.out.println("Các phần tử có trong ArrListString là : ");
        for (int i =0 ; i < arrListString.size() ; i++)
            System.out.print(arrListString.get(i)+ "\t");
            
            System.out.println("\n");

            arrListString.set(2,"html");
            arrListString.remove(3);
            for(int i= 0 ; i<arrListString.size() ; i++ )
            System.out.print(arrListString.get(i) +"\t");
    }  
         
        
}