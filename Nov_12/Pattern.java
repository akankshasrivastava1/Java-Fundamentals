package Nov_12;

public class Pattern {

    public static void main (String [] args){
      int n =5;
      System.out.println("Print Square of size n*n: 5*5\n");
        for (int i=1; i<=n; i++)
        {
            for (int j=1; j<=n; j++)
            {
              System.out.print("*"+" ");
            }
            System.out.println();
        }


        System.out.println("Triangle\n");
       
        for (int i=1; i<=n; i++)
        {
            for (int j=1; j<=i; j++)
            {
              System.out.print("*"+" "); 
            }
            System.out.println();  
        }


       System.out.println("Inverse Triangle:\n");
        
        for (int i=5; i>0; i--)
        {
            for (int j=0; j<i; j++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }


        System.out.println("Left Rotated pyramid triangle:\n");
      
        for (int i=1; i<=n-1; i++)
        {
            for (int j=1; j<=i; j++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }

        for (int i=1; i<=n; i++)
        {
            for (int j=n; j>=i; j--)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }


        System.out.println("Triangle pattern with Number I\n");
        
        for (int i=1; i<=n; i++)
        {
            for (int j=1; j<=i; j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }


        System.out.println("Triangle pattern with Number II\n");
        int count = 1;
        
        for (int i=1; i<=n; i++)
        {
            for (int j=1; j<=i; j++)
            {
              System.out.print(count+" ");
              count++;
            }
            System.out.println();
        }
        
        System.out.println("Left Triangle Pattern\n");
        
        for (int i=1; i<=n; i++)
        {
            for (int j=1; j<=2*(n-i); j++)
            {
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }

        System.out.println("pyramid Pattern:\n");
        
        for (int i=1; i<=n; i++)
        {
            for (int j=1; j<=n-i; j++)
            {
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }   
}
