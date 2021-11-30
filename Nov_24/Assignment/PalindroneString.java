package Nov_24.Assignment;
import java.util.Scanner;
public class PalindroneString {
    public static void main(String arg[]){  
        System.out.println("Enter a string to test");  
        Scanner sc = new Scanner(System.in);  
        String str1 = sc.next();  
        String str2 = "";  
        for (int i = str1.length() - 1; i >= 0; i--)  
        str2 = str2 + str1.charAt(i);  
        if (str1.equals(str2))  
        System.out.println("Palindrom");  
        else  
        System.out.println("Not a palindrom");
        sc.close();
 }  
    
}
