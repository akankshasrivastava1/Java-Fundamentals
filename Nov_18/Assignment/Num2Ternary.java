package Nov_18.Assignment;
import java.util.Scanner;
public class Num2Ternary {
    //Program to find greatest of two no. using ternary operator
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Number :");
        int a = sc.nextInt();
        System.out.print("Enter the Second Number :");
        int b = sc.nextInt();
        String result = (a>b)? "a greater" :" b is greater";
        System.out.println("result"+result);
        sc.close();
        
    }
}