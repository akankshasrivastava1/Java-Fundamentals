package Nov_22.Assignment;
import java.util.Scanner;
public class FindMidElement {
    //make an array with user inputs of size 10. , then find midle element in an array
    public static void main(String[] args) {
        int [] arr = new int[10];
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number : ");
        for(int i =0; i< arr.length; i++){
           arr[i] = sc.nextInt();
        }
        int num = (arr.length) / 2;
        if (num % 2 == 0) {
            for (int i = 0; i <= num; i++) {
                System.out.println(arr[i]);
            }
        } else {
            System.out.print("The middle of the element is : ");
            System.out.println(arr[num]);
        }
    sc.close();
    }
    
}
