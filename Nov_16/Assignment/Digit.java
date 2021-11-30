package Nov_16.Assignment;
import java.util.Scanner;

public class Digit {
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the digits: ");
    int length= sc.nextInt();
    int count=0;
    while(length>0)
    {
      length=length/10;
      count++;
    }
    if(count>=1 && count<4)
    {
      System.out.println("You have entered "+count+" digit number");
    }
    else
    {
      System.out.println("Number is too high");
    }
    sc.close();
  }
}
