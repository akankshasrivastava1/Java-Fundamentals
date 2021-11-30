package Nov_10.Assignment;
import java.util.Scanner;

//add 3 to the ASCII value of the any character
public class ASCII3 
{
    public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		char c;
		int ch,s;
		System.out.println("Enter the character:");
		c=sc.next().charAt(0);
        //casting or converting a charter into int type 
		ch=(int)c;
		s=ch+3;
		System.out.println((char)s);
        sc.close();
	}
}
