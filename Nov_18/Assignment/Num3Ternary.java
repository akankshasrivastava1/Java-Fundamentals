package Nov_18.Assignment;
import java.util.Scanner;
public class Num3Ternary {
   // Program to find greatest of three no. using ternary operator
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Number : ");
        int a = sc.nextInt();
        System.out.print("Enter the Second Number : ");
        int b = sc.nextInt();
        System.out.print("Enter the Third Number : ");
        int c = sc.nextInt();
        String result = (a>b) ? (a>c) ? "a is greater" : "c is greater " : (b>c) ? "b is greater" : "c is greater";
        System.out.println("result " + result);
        sc.close();
    }
}
