package Nov_14_Test;

import java.util.Scanner;
import java.lang.Math; 
public class TotalSalary
{	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int bs=sc.nextInt();
		String str=sc.next();
		char c=str.charAt(0);
		int all;
		if(c==65)
		{
			all=1700;
		}
		else if(c==66)
		{
			all=1500;
		}
		else
		{
			all=1300;
		}
		double ts=((bs+(0.20*bs)+(0.50*bs)+all)-(0.11*bs));
		double p=Math.round(ts);
		int h=(int)(p);
		System.out.println(h);
        sc.close();
	}
}