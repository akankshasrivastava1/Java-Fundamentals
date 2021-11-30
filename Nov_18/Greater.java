package Nov_18;
import java.util.Scanner;

public class Greater {
    public static void main(String[] args) {
        System.out.println("enter the number =");
        Scanner sc = new Scanner(System.in);
        int max = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
       max =  (a>b)? a:b;
    System.out.println("MAximum is =" +max);
        sc.close();
    }
}
