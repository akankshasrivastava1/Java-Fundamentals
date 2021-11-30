package Nov_11;

    public class Swap{

        public static void main(String[]args){
           int a = 5;
           int b = 7;

           System.out.println("Before Swap" + "a = " + a +  " and b = " + b );
  
           int temp = a;
           a = b;
           b = temp;

           System.out.println("After Swap" + "a = " + a +  " and b = " + b );


        }

    }