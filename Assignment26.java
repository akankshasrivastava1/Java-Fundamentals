//-lower triangular matrix

import java.util.Scanner;
public class TriangularMatrix {
    public static void main(String args[])
    {
        int a[][] = new int[5][5];
        System.out.println("Enter the order of your Matrics ");
        System.out.println("Enter the rows:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter the columns:");
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        if(n == m)
         {        
             System.out.println("Enter your elements:");
              for(int i = 0; i < n; i++)
            {
                for(int j = 0; j < n; j++)
                {      
 
                     Scanner ss = new Scanner(System.in);
                     a[i][j] = ss.nextInt();
                     System.out.print(" ");
                 }
            }
              System.out.println("You have entered:");
              for(int i=0; i<n; i++)
               {
                for(int j=0;j<n;j++)
                {      
                     System.out.print(a[i][j] + " ");
                 }
                System.out.println("");
               }
              System.out.println("The Lower Triangular Matrix is:");
              for(int i=0;i<n;i++)
               {
                for(int j=0;j<n;j++)
                 {
                  if(i>=j)
                   {
                     System.out.print(a[i][j] +" ");
                   }
                else
                {
                    System.out.print("0"+" ");
                } 
              }
            System.out.println("");
           }
        }
         else
        {
            System.out.println("you have entered improper order");
        }
   }
}

//Determine if a given Matrix is a Sparse Matrix

import java.util.Scanner; 
public class SparseMatrix
{ 
    public static void main(String[] args) 
    { 
        int m, n;  
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter the number of rows ");   
        m = sc.nextInt();   
        System.out.println("Enter the number of columns ");  
        n = sc.nextInt();   
        int a[][] = new int[m][n];   
        System.out.println("Enter all the values of matrix "); 
        for (int i = 0; i < m; i++) 
        { 
            for (int j = 0; j < n; j++) 
            { 
                a[i][j] = sc.nextInt();                 
            } 
        }    
        System.out.println("Original Matrix:"); 
        for (int i = 0; i < m; i++) 
        { 
            for (int j = 0; j < n; j++) 
            { 
                    System.out.print(a[i][j] + " "); 
            } 
            System.out.println(""); 
        } 
        int size= m*n;
        int count=0;  
        for(int i = 0; i < m; i++)
        {    
            for(int j = 0; j < n; j++)
            {    
                if(a[i][j] == 0)   
                    count++;   
            }    
        }        
        if(count>(size/2))
        System.out.println("It is a sparse matrix");
        else
        System.out.println("It is not a sparse matrix");
        sc.close();           
    } 
}

//-Find the Frequency of Odd & Even Numbers in the given Matrix"

import java.util.Scanner;
public class Frequency {
    public static void main(String[] args) 
    {
        int p, q, count1 = 0, count2 = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows in matrix:");
        p = sc.nextInt();
        System.out.print("Enter number of columns in matrix:");
        q = sc.nextInt();
        int a[][] = new int[p][q];
        System.out.println("Enter all the elements of matrix:");
        for (int i = 0; i < p; i++) 
        {
            for (int j = 0; j < q; j++) 
            {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Given Matrix:");
        for (int i = 0; i < p; i++) 
        {
            for (int j = 0; j < q; j++) 
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }
        for (int i = 0; i < p; i++) 
        {
            for (int j = 0; j < q; j++) 
            {
                if((a[i][j] % 2) == 0)
                {
                    count1++;
                }
                else
                {
                    count2++;
                }
            }
        }
        System.out.println("Even number frequency:"+count1);
        System.out.println("Odd number frequency:"+count2);
        sc.close();
    }
}
