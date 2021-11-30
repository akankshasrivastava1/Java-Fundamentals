package Nov_10.Assignment;
import java.util.Scanner;

//convert temperature from Fahrenheit to Celsius degree

public class Fahrenheit_Celsius 
{
   public static void main (String args[])  
    { 
          System.out.println("Enter the temperature in Fahrenheit:");
          Scanner sc = new Scanner(System.in);
          Double Fahrenheit, Celsius;
          Fahrenheit =  sc.nextDouble();
          Celsius  = ((Fahrenheit-32)*5)/9;  
          System.out.println("Temperature in celsius is: "+Celsius);  
          sc.close();
    }
    
}
