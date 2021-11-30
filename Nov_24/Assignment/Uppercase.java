package Nov_24.Assignment;
import java.util.Scanner;
public class Uppercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Sentence : "); 
		String str=sc.nextLine();
        char[] arr=str.toCharArray();
        String str1 ="";
         str1 = str1+arr[0];
        str1 = str1.toUpperCase(); 
        
  
        for(int i=1;i<arr.length;i++){
  
            if(arr[i]!=' '){
                System.out.println(arr[i]);
            }
            if(arr[i]==' '){
                System.out.println(arr[i+1]);
                String upper="";
                upper= upper +arr[i+1];
				upper=upper.toUpperCase();
				str1=str1+" "+upper;
				i++;
            }
        }
        System.out.println("Modified String :\n"+str1);
        sc.close();
    }
    
}
