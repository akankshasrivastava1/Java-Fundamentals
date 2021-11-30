package Nov_16;
import java.util.Scanner;
public class condition {

    public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the age: ");
    int age = sc.nextInt();
    if (age<18)
    { 
        System.out.println("Not eligible to vote"); 
   } else 
      {
       System.out.println("eligible to vote"); 
      }
    sc.close();
}
}
