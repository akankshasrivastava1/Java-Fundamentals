package Nov_11.Assignment.While_loop;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        int fact = 1, i= 1;
        if(n < 1)
        System.out.println("1");
        else
        {
            while( i <= n)
            {
                fact *= i;
                i++;
            }
            System.out.println(fact);
    
        
        sc.close();
    }
}
}  

