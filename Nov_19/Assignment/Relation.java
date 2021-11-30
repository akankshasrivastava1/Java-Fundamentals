package Nov_19.Assignment;
import java.util.Scanner;
public class Relation {
    //write a method which takes 2 numbers as input and prints their relationship
    public static String relation(int a,int b){
        String result = (a>b)? "x is greater than y" : (b>a)?" y is greater than x":"both are equal";
        return result;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Number : ");
        int x = sc.nextInt();
        System.out.print("Enter the Second Number : ");
        int y = sc.nextInt();
        String result = relation(x,y);
        System.out.print(result);
        sc.close();
    }
}    
