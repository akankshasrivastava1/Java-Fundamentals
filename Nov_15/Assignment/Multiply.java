package Nov_15.Assignment;
import java.util.Scanner;
// multiplies 2 numbers and returns the answer 
public class Multiply {
    public int multiply(int a, int b)
    {
        return a * b;
     }
     public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first value: ");
        int x = sc.nextInt();
        System.out.print("Enter the Second value: ");
        int y = sc.nextInt();
        Multiply obj = new Multiply();
        int z = obj.multiply(x, y);
        System.out.println("Mutiply method : returns integer : " + z);
        sc.close();
    }
}
