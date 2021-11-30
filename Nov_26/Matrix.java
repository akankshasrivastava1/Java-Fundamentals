package Nov_26;
import java.util.Scanner;
public class Matrix {
    public static void main(String[] args) {

        // input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("How many rows?");
        int row = sc.nextInt();
        System.out.println("How many cols?");
        int col = sc.nextInt();

        int[][] matrix=new int[row][col];

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                matrix[i][j]=sc.nextInt();
            }
        }

        // printing matrix
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
