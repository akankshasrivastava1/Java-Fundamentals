package Nov_11.Assignment.While_loop;

import java.util.Scanner;

public class Sum {

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the any number:");
        int n = sc.nextInt();
        int sum = 0 , i=0;
        while(i<=n){
            sum = sum + i;
            i++;
        }
     System.out.println("The sum of " + n + " = " + sum);
   sc.close();  
}

}