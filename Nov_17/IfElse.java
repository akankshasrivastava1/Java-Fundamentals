package Nov_17;

public class IfElse {

    public static void main(String[] args) {

// 3) program to print the square of a number if it is less than 10 or else print invalid
        int n=9;
        if(n<10){
            int res=n*n;
            System.out.println("square of a number is:"+res);
        }else{
            System.out.println("Invalid");
        }
    
//  4) write a method to print whether given 2 numbers are same  or not
      isSame(5,5);


// 5) write a method to print whether given number is positive or negative
      isPositive(-4);
    }

  static void isSame(int a, int b)
  {
    if(a==b){     // a==b -> same -> true   else -> false
        System.out.println("2 numbers are same");
    }else{
        System.out.println("2 numbers are not same");
    }
  }

   static void isPositive(int a)
   {
    if(a>0){
        System.out.println("Its positive");
    }else{
        System.out.println("Its negative");
    }
   }
}