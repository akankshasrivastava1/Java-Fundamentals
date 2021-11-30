package Nov_19.Assignment;
import java.util.Scanner;
public class Operations {
    public static double Operation(double a, double b, char c) {

		double res=0;
		if(c == '1')
		{
			res=a+b;
		}
		else if(c == '2')
		{
			res=a-b;
		}
		else if(c == '3')
		{
			res=a*b;
		}
		else if(c == '4')
		{
			res=a/b;
		}
        else if(c == '5')
		{
			res=a%b;
		}
		else
		{
			System.out.println("Invalid");
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First number");
		double a=sc.nextInt();
		System.out.println("Enter Second number");
		double b=sc.nextInt();
        System.out.println("\n1.Addition \n2.Subtraction \n3.Division \n4.Multiplicaton \n5.Modulus");
		System.out.println("\nEnter Your choice(1/2/3/4/5)");
        char c=sc.next().charAt(0);
		double res=Operation(a,b,c);
		System.out.println("The Result is : " + res);
        sc.close();
    }
    
}
