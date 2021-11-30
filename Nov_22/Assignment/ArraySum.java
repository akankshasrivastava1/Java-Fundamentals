package Nov_22.Assignment;
import java.util.Scanner;
//make an array with user inputs of size 10. ,then find sum of all elements in array
public class ArraySum {
    public static void main(String[] args) {
        int [] arr = new int[10];
        int sum=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number : ");
        for(int i =0; i< arr.length; i++){
           arr[i] = sc.nextInt();
        }
        for(int i =0; i< arr.length; i++)
        sum = sum + arr[i];
        {
            System.out.println("Sum of numbers is : "+sum);
        }
        sc.close();
    }
}
