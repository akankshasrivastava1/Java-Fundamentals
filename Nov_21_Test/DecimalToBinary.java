package Nov_21_Test;
import java.util.Scanner;
public class DecimalToBinary {
    public static long decimal_to_binary(int n)
    {
    long binary = 0;
    int remainder, i;
    for(i = 1; n != 0; i = i * 10)
    {
    remainder = n % 2;
    n /= 2;
    binary += remainder * i;
    }
    return binary;
    }
    public static void main(String args[])
    {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a decimal number: ");
    int n = sc.nextInt();
    System.out.println( "The conversion of decimal to binary : " + decimal_to_binary(n));
    sc.close();
    }
    
}
