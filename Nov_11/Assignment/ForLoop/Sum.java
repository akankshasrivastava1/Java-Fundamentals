package Nov_11.Assignment.ForLoop;

import java.util.Scanner;

public class Sum {

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the any number:");
        int n = sc.nextInt();
        int sum = 0;
        for(int i=0;i<=n;i++){
            sum = sum + i;
        }
     System.out.println("The sum of " + n + " = " + sum);
   sc.close();  
}

}
 