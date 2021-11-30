package Nov_17.Assignment;
import java.util.Scanner;
//Check whether user given input number is 1 digit or 2 digit or 3 digit, 4 digit, 5 digit and more than 5 digit
public class DigitCount {
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      char ch;
      do{
        System.out.print("Enter the digits: ");
        int length= sc.nextInt();
        int count=0;
        while(length>0)
        {
          length=length/10;
          count++;
        }
        if(count>=1 && count<7)
        {
          System.out.println("You have entered "+count+" digit number");
        }
        else
        {
          System.out.println("Number is too high");
        }
        System.out.println("Do you want to continue (Y/N)?: ");
        ch = sc.next().charAt(0);
       }while (ch=='y'|| ch=='Y');
        sc.close();
    } 
    
}