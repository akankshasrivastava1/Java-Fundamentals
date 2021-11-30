package Nov_9.Assignment;
import java.util.Scanner;

public class Prime {
      public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num = sc.nextInt();
        for (int i=1; i<=num; i++){
            if(num%i == 0){
            count = count + 1;
            }
        }
        if(count == 2){
            System.out.println(num+" "+ "The Number is Prime");
        }
        else{
            System.out.println(num+" " + "The Number is Not Prime");
        }
        sc.close();
    } 
}

