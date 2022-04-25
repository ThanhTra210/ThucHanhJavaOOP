import java.util.Scanner;

public class minhhoalapdk {

 public static void main(String[] args) {
// TODO Auto-generated method stub
//Minh hoa lap dk truoc
//tim usc lon nhat cua 2 so nguyen a va b
int a = 900, b = 1000;
while (a!=b)
{
if (a>b)
a=a-b;
else
b=b-a;
}
System.out.print("USCLN cua a va b la: "+a);
//Minh hoa cho dk sau
//Kiem tra du tuoi ket hon cho nu
/*
* int tuoi; Scanner sc = new Scanner(System.in); do {
* System.out.print("\nNhap tuoi cua thieu nu: "); tuoi = sc.nextInt();} while
* (tuoi<18); System.out.print("Tuoi da nhap: "+tuoi);
*/
//Minh hoa cau lenh for
//In ra man hinh cac so chan trong khoang tu 1->100, moi dong in 5 so
int i, dem=0;
System.out.println("\nCac so chan trong khoang 1->100:");
for (i=1; i<=100; i++)
{
dem++;
if (i%2==0)
{System.out.print("\t"+i);
if (dem%5==0)
System.out.print("\n");
}
}
/*
* for (i=2; i<=100; i=i+2) {
*
* System.out.print("\t"+i); }
*/
//Bai tap cung co ly thuyet
//1. In ra man hinh cac so le va chia het cho 3 trong khoang 1-200
System.out.println("Cac le va chia het cho 3 trong khoang 1-200: ");
for (i=1; i<=200; i++)
{
if (i%2==1 && i%3==0)
System.out.print("\t"+i);
}
//2. Tinh tong cac so co tan cung la 6 trong khoang 100-300
int tong6 = 0;
System.out.print("\n");
for (i=100; i<=300; i++)
if (i%10==6)
{
tong6 = tong6+i;
System.out.print("\t"+i);
}
System.out.println("\nTong cac so co tan cung bang 6 trong khoang 100-300 la: "+tong6);
//3. Dem xem trong khoang 1-500 co bao nhieu so la so nguyen to
int demnt=0, j;
boolean kt;
System.out.println("\nCac so nguyen to trong doan 1-500 la: ");
for (i=1; i<=500; i++)
{
kt=false;
for (j=2; j<=i/2; j++)
{
if (i%j==0)
{
kt=true;
break;
}
}
if (!kt) //kt==false
{
demnt=dem+1;
System.out.print("\t"+i);
}
}
System.out.println("\nSo cac so nguyen to nam trong doan 1-500 la: "+demnt);

//4. Tinh tich cac so chinh phuong nam trong khoang 1-50
double tichcp = 1;
for (i=1; i<=50; i++)
{
if (i==1)
{
tichcp=tichcp*i;
System.out.print("\t"+i);
}
else
for (j=1;j<=i/2;j++)
if (i==j*j)
//i la so CP?
{
tichcp=tichcp*i;
System.out.print("\t"+i);
}
}

System.out.println("\nTich cac so CP nam trong doan 1-50 la: "+tichcp);
//cach 2
tichcp=1;
for (i=1; i<=50; i++)
if (i==(int) Math.sqrt(i)*(int) Math.sqrt(i))
{
tichcp=tichcp*i;
System.out.print("\t"+i);
}
System.out.println("\nTich cac so CP nam trong doan 1-50 la: "+tichcp);
//5. Tinh trung binh cong cac so hoan hao nam trong doan 1-1000

} //of void main
} //of class
