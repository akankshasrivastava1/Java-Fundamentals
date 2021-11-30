package Nov_18;
import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        //int a =4;
        Scanner sc = new Scanner(System.in);

        System.out.println(6/4); // 1
        System.out.println(6.0/4); // 1.5
        System.out.println(6/4.0); //1.5
        System.out.println(6.0/4.0); //1.5

       // System.out.println(a<<1);
        //System.out.println(a<<2); //1
        sc.close();

        int a  = 6 , b=9;
        if(a>b){
            System.out.println("");
        }
        else{
            System.out.println("");
        }
        String result = (a>b)? "a greater" :" b is greater";
        System.out.println("result"+result);
    }
}
