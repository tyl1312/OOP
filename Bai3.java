import java.util.Scanner;

class Bai2 {
   public static void main(String[] args) {
      Scanner cin = new Scanner(System.in);

      System.out.print("Nhap a: ");
      double a = cin.nextDouble();
      System.out.print("Nhap b: ");
      double b = cin.nextDouble();
      System.out.print("Nhap c: ");
      double c= cin.nextDouble();  

      double D = b * b - 4 * a * c;

      if(a == 0){
         System.out.println("Day khong phai phuong trinh bac hai");
      }else if(D == 0){
         System.out.println("Phuong trinh co nghiem duy nhat: x = " + (-b/2/a));
      }else if (D < 0){   
         System.out.println("Phuong trinh vo nghiem");
      }else{
         System.out.println("Phuong trinh co hai nghiem phan biet: x1 = " + (-b + Math.sqrt(D))/2/a + ", x2 = " + (-b - Math.sqrt(D))/2/a);
      }

      cin.close();
   }
}