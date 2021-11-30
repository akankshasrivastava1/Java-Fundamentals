package Nov_16;

 import java.util.Scanner;
 public class FunctionCall {
   
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the first Name : ");
            int FirstName = sc.nextInt();
            System.out.print("Enter the Last Name : ");
            int LastName = sc.nextInt();
        
 
              int result = FirstName + LastName;
              System.out.println(result);
              System.out.println("Your full name is:"+FirstName + LastName);
              sc.close();
          }
        
          
      }
      

