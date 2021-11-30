package Nov_10.Assignment;
import java.util.Scanner;

//reads a number in inches, converts it to meters
public class Meter {
    public static void main (String args[])  
    { 
         Scanner sc = new Scanner(System.in);
         System.out.print("Input a value for inch: ");
         double inch = sc.nextDouble();
         double meters = inch * 0.0254;
         System.out.println(inch + " inch is " + meters + " meters");
         sc.close();
    }
}
