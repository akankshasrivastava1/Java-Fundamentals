package Nov_25.Assignment;
import java.util.Scanner;
public class ResultMatrix {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n;
        System.out.println("Enter the array size:");
        n=sc.nextInt();
        int [] arr =  new int[n];
        int [] arr1 = new int[n];
        int [] result= new int [n];

        System.out.println("Enter first array element : ");
        for(int i =0; i< n; i++){
           arr[i] = sc.nextInt();
        }
        System.out.println("Enter second array element : ");
        for(int i =0; i<n; i++){
           arr1[i] = sc.nextInt();
        }
        System.out.println("Sum of 2 array is : " );
        for(int i =0; i< n; i++)
        {
            result[i] = arr[i] + arr1[i];
            System.out.println(+(result[i]) );
        }
       sc.close();
    }
}