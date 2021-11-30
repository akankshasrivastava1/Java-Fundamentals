package Nov_21_Test;
import java.util.Scanner;
public class BinaryToDecimal {
    public static void main(String args[]){
        Scanner sc = new Scanner( System.in );
        System.out.print("Enter a binary number: ");
        String binaryString = sc.nextLine();
        System.out.print("The Conversion of Binary to Decimal : ");
        System.out.println(+Integer.parseInt(binaryString,2));
        sc.close();
     }
    
}
