package Nov_22.Assignment;
import java.util.Scanner;
public class PositiveNum {
   //make an array with user inputs of size 10. then print all positive numbers in an array 
   public static void main(String[] args) {
    int [] arr = new int[10];
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the number : ");
    for(int i =0; i< arr.length; i++){
       arr[i] = sc.nextInt();
    }
    System.out.println("The positive Integers of an Array are : " );
    for (int i = 0; i < arr.length; i++) {
        if(arr[i] > 0)
        System.out.println(arr[i]);
    }
    sc.close();
 }
}
