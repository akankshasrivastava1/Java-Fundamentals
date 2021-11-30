package Nov_23;
import java.util.Scanner;
public class Sumof2Array {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
       /* System.out.print("Enter number of elements in first array: ");
        int array1size = sc.nextInt();
        System.out.print("Enter number of elements in second array: ");
        int array2size = sc.nextInt();*/

        /*if(array1size != array2size) {
            System.out.println("Both array must have "+ "same number of elements");
            return; // stop 
          }*/
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

