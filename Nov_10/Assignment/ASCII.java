package Nov_10.Assignment;

import java.util.Scanner;
//ASCII value of any character user proides
public class ASCII 
{
    public static void main(String[] args) 
	{
        Scanner sc=new Scanner(System.in);
        char c;
		System.out.println("Enter the character:");
		c=sc.next().charAt(0);
		int ch=(int)c;
		System.out.println(ch);

        sc.close();
    }
    
}
