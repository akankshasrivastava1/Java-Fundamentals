/*Given three values - Start Fahrenheit Value (S), End Fahrenheit value (E) and Step Size (W),
 you need to convert all Fahrenheit values from Start to End at the gap of W, into their corresponding Celsius values and print the table.*/
 package Nov_21_Test;
 import java.util.Scanner;
 public class FahrenheitToCelsius {
 
  public static void main(String[] args) {
     Scanner s=new Scanner(System.in);
     int S=s.nextInt();
     int E=s.nextInt();
     int W=s.nextInt();
     int fah;
         
         while(S<=E)
         {
          
             fah=((5*(S-32))/9);
             System.out.println(S+" "+fah);
             S+=W;
         }
         s.close();
     }}
