package Nov_12.Assignment;

public class DiamondPattern {
    
    public static void main (String [] args){
        int n =5;
 
         System.out.println("Diamond Pattern:\n");
         
         for (int i=0; i<=n-1; i++)
         {
             for (int j=0; j<=n-i; j++)
             {
                 System.out.print(" ");
             }
             for (int j=1; j<=i; j++)
             {
                 System.out.print("*"+" ");
             }
             System.out.println();
         }
         for (int i= 0; i<= n-1 ; i++)
         {
             for (int j=0; j<=i; j++)
             {
                 System.out.print(" ");
             }
             for (int j=0; j<=n-1-i; j++)
             {
                 System.out.print("*" + " ");
             }
             System.out.println();
         }
     }
}
