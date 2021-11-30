package Nov_16.Assignment;
//Apply do while loop to calculat factorial of a number such that, program asks  user, if he wants to continue, if yes, program should run again
import java.util.Scanner;
public class DoWhile {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char ch;
        do{
         System.out.print("Enter the n : ");
        int n = sc.nextInt();
        int fact = 1;
        for(int i = 1; i <= n; i++){
            fact *= i;
        }
        System.out.println(fact);
        System.out.println("Do you want to continue (Y/N)?: ");
        ch = sc.next().charAt(0);
        }while (ch=='y'|| ch=='Y');
        sc.close(); 
    }
}

