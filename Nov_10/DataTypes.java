package Nov_10;
public class DataTypes {
 public static void main(String[]args)
 {
     float f= 100.111111111f;
     System.out.println(f);

     double d = 100.111111111;
     System.out.println(d);

     char ch = 'A';
     System.out.println(ch+ch); 

     int a=100;
     int b=200;

      String str = "HelloABC123$%";

      int num =5;

      addValuetoNum(num);

      System.out.println(num);
}
   private static void addValuetoNum(int num){
     num=num+10;
 }
}