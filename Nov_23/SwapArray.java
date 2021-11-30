package Nov_23;

public class SwapArray {
    public static void main(String[] args) {
        int [] arr = {31,25,6,18,3,25,28};
        int n =arr.length;
        int i=0,  j = n-1;
        int temp;

        //for(int i=0, j=n-1; i<=j; i++, j--){
        while(i<j){ 
         temp =arr[i];
         arr[i] =arr[j];
         arr[j]=temp;
         i++; j--;
        }
    for (int k=0; k<n; k++){
        System.out.println(arr[k]);
    }
}}
