package Nov_9; 

import java.util.Scanner;


public class userInputBasics{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

       System.out.println("Enter name");
        String name = sc.nextLine();

        System.out.println("You have entered:"  + name);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("your age is: " + age);

        System.out.print("Enter your account balance: ");
        Float balance = sc.nextFloat();
        System.out.println("your age is: " + balance);

        System.out.print("Enter your choice: ");
        char c = sc.next().charAt(0);
        sc.nextBoolean();
        System.out.println("your age is: " + c);

        sc.close();

    }
    
}
