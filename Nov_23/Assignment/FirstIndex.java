package Nov_23.Assignment;
import java.util.Scanner;
//WAP to find first index at which element is present in array

 class FirstIndex {
    public static void FindFirst(int[] arr, int index)
    {   
        int n=-1;
        int i = 0;
        while(i < arr.length) {
            if(arr[i] == index) {
                n=i;
                break;
            }
            i++;
        }
         
        System.out.println("Index of "+index+" is : " +n);
    }
    
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        
		System.out.println("Enter the size of array :");
		int n=sc.nextInt();
		int arr[]=new int[n];
		int index;
		System.out.println("Enter the elements of array :");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
        System.out.println("Enter the element whose index is to be found: ");
        index=sc.nextInt();
	    FindFirst(arr,index);
        
        sc.close();
    }
}
