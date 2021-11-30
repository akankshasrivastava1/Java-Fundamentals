package Nov_17;
//wap to check whether given num is 10,20,30,40 or not any of these
public class ElseIf{

    public static void main(String[]args)
    {
     // 7)write a method to print whether given number is positive or negaitve or zero
      isPositiveAndZero(5);
      
     //8) write a program to check whether given number is 10,20,30,40 or not any of these
        int n =20; 
        if (n==10){
          System.out.println("it is 10");
        }else if(n==20)
        {
          System.out.println("it is 20");
        }
        else if(n==3){
           System.out.println("it is 30");
        }
        else if(n==40){
           System.out.println("it is 40");
        }else{
           System.out.println("not any of these");  
        }
      //  9) write a method to take 3 persons age and print who is oldest among 3 of them
        maxAge(6,7,8);
      }
      static void isPositiveAndZero(int a){
         if(a>0){
             System.out.println("Its positive");
         }else if(a<0){
             System.out.println("Its negative");
         }else{
             System.out.println("Its zero");
         }
      } 
      
      static void maxAge(int a, int b, int c){

         if(a>b && a>c){
             System.out.println("A is elder");
         }else if(b>a && b>c){
             System.out.println("B is elder");
         }else {
             System.out.println("C is elder");
         }
     }
}