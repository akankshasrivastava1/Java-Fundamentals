package Nov_11.Assignment.While_loop;

import java.util.Scanner;

public class Fibanocci {
   public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        int a = 0, b = 1, i =2;
        System.out.print(a + " " + b);
     
        while (i < n)
        {
           int c = a + b;
             System.out.print( ", " + c);
             ++i;
             a = b;
             b = c;
        }

     sc.close();
    }
    
}