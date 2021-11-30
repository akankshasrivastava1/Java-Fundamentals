package Nov_25;
import java.util.Scanner;
public class DiagonalArray {
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
        }
        
        System.out.println("First diagonal :");
        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                if(i==j){
                }arr[i][j] = sc.nextInt();
                }

        }
        System.out.println("Second Diagonal :");
        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                if((i+j)==n-1){
                }arr[i][j] = sc.nextInt();
                }
        }
        sc.close();
    }

}
