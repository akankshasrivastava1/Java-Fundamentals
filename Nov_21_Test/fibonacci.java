package Nov_21_Test;
import java.util.Scanner;
//Nth term of Fibonacci series F(n), where F(n) is a function, is calculated using the following formula 
/*F(n) = F(n-1) + F(n-2), 
Where, F(1) = F(2) = 1
Provided N you have to find out the Nth Fibonacci Number. */
public class fibonacci {
    public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int n, t1 = 0, t2 = 1, nextTerm = 0, i;
//System.out.println("Enter the n value: ");
n = sc.nextInt();
if(n == 1 || n == 1) 
System.out.println(n);
else
nextTerm = t1 + t2;
for (i = 2; i <= n; ++i)
{
t1 = t2;
t2 = nextTerm;
nextTerm = t1 + t2;
}
System.out.println(t2);

}
}
