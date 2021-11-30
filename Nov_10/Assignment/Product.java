package Nov_10.Assignment;

import java.util.Scanner;
//print the product of the decimal and int numbers
public class Product {
  	public static void main(String args[])
	{

		Scanner sc=new Scanner(System.in);
		double n1,product;
		int n2;
		System.out.print("Enter the decimal number:");
		n1 = sc.nextDouble();
		System.out.print("Enter the integer number:");
		n2 = sc.nextInt();
		product = n1*n2;
        System.out.println(n1+" * "+n2+" = "+product);
        sc.close();
	}

}

