package Nov_18.Assignment;
import java.util.Scanner;
public class NumDigitWhile {
    //Program to calculate no. of digits in a number using while loop
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the digits: ");
    int length= sc.nextInt();
    int count=0;
     while(length>0)
     {
       length=length/10;
       count++;
     }
     if(count>=1 && count<5)
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