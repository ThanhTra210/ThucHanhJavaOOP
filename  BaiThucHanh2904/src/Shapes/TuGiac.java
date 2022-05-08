package Shapes;

public class TuGiac extends Point {
    private float canhA;
    private float canhB;
    private float canhC;
    private float canhD;
    private float temp1_3;
    private float temp2_4;
    private int vuong;

    public void nhapTuGiac(){
        Point p1 = new Point();
        Point p2 = new Point();
        Point p3 = new Point();
        Point p4 = new Point();

        System.out.println("Nhap diem thu nhat: ");
        p1.nhap();
        System.out.println("Nhap diem thu hai: ");
        p2.nhap();
        System.out.println("Nhap diem thu ba: ");
        p3.nhap();
        System.out.println("Nhap diem thu tu: ");
        p4.nhap();

        //Tinh canh tu giac
        canhA = (float)Math.sqrt(Math.pow(p1.getHoanhDo()-p2.getHoanhDo(), 2)+Math.pow(p1.getTungDo()-p2.getTungDo(), 2));
        System.out.println("Canh A: " + canhA);
        canhB = (float)Math.sqrt(Math.pow(p2.getHoanhDo()-p3.getHoanhDo(), 2)+Math.pow(p2.getTungDo()-p3.getTungDo(), 2));
        System.out.println("Canh B: " + canhB);
        canhC = (float)Math.sqrt(Math.pow(p3.getHoanhDo()-p4.getHoanhDo(), 2)+Math.pow(p3.getTungDo()-p4.getTungDo(), 2));
        System.out.println("Canh C: " + canhC);
        canhD = (float)Math.sqrt(Math.pow(p4.getHoanhDo()-p1.getHoanhDo(), 2)+Math.pow(p4.getTungDo()-p1.getTungDo(), 2));
        System.out.println("Canh D: " + canhD);
        temp1_3 = (float)Math.sqrt(Math.pow(p1.getHoanhDo()-p3.getHoanhDo(), 2)+Math.pow(p1.getTungDo()-p3.getTungDo(), 2));
        System.out.println("Temp 1: " + temp1_3);
        temp2_4 = (float)Math.sqrt(Math.pow(p2.getHoanhDo()-p4.getHoanhDo(), 2)+Math.pow(p2.getTungDo()-p4.getTungDo(), 2));
        System.out.println("Temp2: " + temp2_4);
    }
    //Ktra xem co la tu giac khong
    public Boolean kiemTraTuGiac(){
        if(canhA + canhB == temp1_3 || canhB + canhC == temp2_4 || canhC + canhD == temp1_3 || canhA + canhD == temp2_4)
            return false;
        else return true;
    }

    public void kiemTraLoaiTuGiac(){
        vuong = 0;
        if(kiemTraTuGiac() == true){
            //Ktra goc vuong
        if(Math.pow(canhA,2)+Math.pow(canhB, 2) == Math.pow(temp1_3, 2))
        vuong++;
        if(Math.pow(canhB,2)+Math.pow(canhC, 2) == Math.pow(temp2_4, 2))
        vuong++;
        if(Math.pow(canhC,2)+Math.pow(canhD, 2) == Math.pow(temp1_3, 2))
        vuong++;
        if(Math.pow(canhA,2)+Math.pow(canhD, 2) == Math.pow(temp2_4, 2))
        vuong++;

    
        if(canhA == canhB && canhC == canhD && canhB == canhC){
            if(vuong >= 1)
                System.out.print( "Hinh vuong.");
            else
                System.out.print( "Hinh thoi.");
        } else if(canhA == canhC || canhB == canhD){
            if(vuong >= 1)
                System.out.print( "Hinh chu nhat.");
            else
                System.out.print( "Hinh binh hanh.");
        }
        System.out.print( "Tu giac thuong");
            } else
                System.out.print( "Khong phai la tu giac");
    }
}