package Nov_25;
import java.util.Scanner;
public class Array2D {

    public static void main(String [] args){
    int[][] arr = new int[3][3];
    int n = arr.length;
    int m = arr[0].length;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Element in MAtrix :");
    for (int i=0; i<n; i++){
        for (int j=0; j<m; j++){
            arr[i][j] = sc.nextInt();
        }
    }// traverse the matrix
        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
    }
    sc.close();
}
}