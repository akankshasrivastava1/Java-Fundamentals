package Nov_15.Assignment;
import java.util.Scanner;
//write 3 different mathods each takes different number of int arguments and return its max value
public class MaxValue {
     public static int max (int a, int b)
     {
         if (a>b)
         {
            return a;
         }else
         {
            return b;
         }
     }

    public static int max (int a, int b, int c){
        return max(max(a, b), c);
    }

    public static int max (int a, int b, int c, int d){
        return max(max(a, b, c), d); 
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		char C;
		do {
        System.out.println("How many number do you want to comapre?(2/3/4)");
		int ch=sc.nextInt();
        if (ch==2){
            System.out.println("Enter first number");
			int a=sc.nextInt();
			System.out.println("Enter second number");
			int b=sc.nextInt();
			int max=max(a,b);
			System.out.println("The maximun value is = "+max);
        }
        else if (ch==3){
            System.out.println("Enter first number");
			int a=sc.nextInt();
			System.out.println("Enter second number");
		    int b=sc.nextInt();
            System.out.println("Enter third number");
			int c=sc.nextInt();
			int max=max(a,b,c);
			System.out.println("The maximun value is = "+max);
        }else if (ch==4){
            System.out.println("Enter first number");
			int a=sc.nextInt();
			System.out.println("Enter second number");
            int b=sc.nextInt();
			System.out.println("Enter third number");
            int c=sc.nextInt();
			System.out.println("Enter fourth number");
			int d=sc.nextInt();
			int max=max(a,b,c,d);
			System.out.println("The maximun value is = "+max);
        }
        System.out.println("Do you wish to contnue?(yes/no)");
			C=sc.next().charAt(0);
		}while(C=='y'||C=='Y');	
       // System.out.println("The maximum between " + a + " and " + b + " is "+ max (a, b));
        //System.out.println("The maximum between " + a +" , " + b + " ," + c+ ", "+ " and " + d + " is " + max(max(a, b, c),d));
        sc.close();
    } 
         
}    


