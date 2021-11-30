package Nov_23;

public class task {
    public static void main(String[] args) {
        int [] arr = {31,25,6,18,25,28};

        int n = arr.length;
        int j = n-1;
        int [] result = new int[n];
        
        for(int i=0; i<n; i++){
           result [i]= arr[j];
           j--;
        }
           for(int k =0; k<n;k++){
         System.out.println(result[k]);
       }
    }
}
