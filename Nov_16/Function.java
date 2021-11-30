package Nov_16;
import java.util.Scanner;
 class Function {
  public static int factorial(int n){

      //calculate factorial
      int fact =1;
      for(int i = n; i>= 1; i--){
          fact= fact*i;
      }
      return fact;
  }
  public static String getFullName(String firstName, String lastName){
      String fullName = "";
      fullName = firstName +" "+ lastName;
      return fullName;
  }

  public void greetUser(String name){
      System.out.println("Hi" + name);
  }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int result = factorial(6);
        System.out.println(result);

        System.out.println("Enter First Name");
        String fn = sc.nextLine();

        System.out.println("Enter last Name");
        String ln = sc.nextLine();

       String fullName = getFullName(fn, ln);
       System.out.println("Your Full Name is:" + fullName);

      // greetUser(fullname);
        sc.close();
    }
  }
    

