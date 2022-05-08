package Kethua;

public class App {
    public static void main(String[] args) throws Exception {
    
     Student std=new Student();
    
       std.nhapthongtinsinhvien();
       std.inMSV();
        
    OfflineStudent ostd=new OfflineStudent();
    ostd.nhapdiemdanh();  
    ostd.xuatdiemdanh();
      
      
    OnlineStudent onstd=new OnlineStudent(); 
      onstd.nhapHientrang();
      onstd.inTrangThai();

    PartTimeEmpoyee pt=new PartTimeEmpoyee();
      pt.nhapsogio();
      pt.insogiolam();

    FullTimeEmpoyee ft=new FullTimeEmpoyee();
      ft.nhapsongaylam();
      ft.insongaylam();

    Employee emp=new Employee();
    
      emp.nhapSDT();
      emp.inSDT();

    Custemer ct=new Custemer();
    ct.nhapdiachi();
    ct.xuatdiachi();

    VipCustemer vct=new VipCustemer();
    vct.nhapsolanden();
    vct.xuatsolanden();
  
      
    }

}

