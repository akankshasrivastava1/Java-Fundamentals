package Nov_23;

public class DecToBin {

    static void decToBinary(int d)
    {
    int [] arr = new int[1000];
    int i=0;
    while(d>0){
        arr [i] = d % 2;
        d= d/2;
        i++;
    }

    for (int j=i-1; j>=arr[i]; j--){
        System.out.print(arr[j]);
       }
    }
    public static void main (String[] args) 
    {
        int n = 17;
          System.out.println("Decimal - " + n);
        System.out.print("Binary - ");
          decToBinary(n);
    }
    
}
