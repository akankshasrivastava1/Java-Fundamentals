package Nov_16.Assignment;
import java.util.Scanner;
//WAP to creat a fuction that check if no. is odd or even. call this function from main method

public class FunctionCall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number Which you want to check it's even or odd :- ");
        int num = sc.nextInt();
        checkEvenOdd(num);
        sc.close();
    }
    public static int checkEvenOdd(int num){
        if (num % 2 == 0) {
        System.out.println("The entered number is Even");
        }
        else {
            System.out.println("The entered number is odd");
        }
        return num;
    }
}

