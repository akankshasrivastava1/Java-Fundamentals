package Nov_26;
//Row Sum and Column Sum of a Matrix
public class MatrixSum {
    public static void main(String[] args) {

    int[][] matrix={
        {1, 2, 3, 4},// ->1, 2, 3, 4=sum
        {5, 6, 7, 8},// 5+6+7+8
        {9,10,11,12},//
        {13,14,15,16}
        };
        int rows=matrix.length;
        int cols=matrix[0].length;
        int colSum;
        for (int j = 0; j < cols; j++) {
            colSum=0;
            for (int i = 0; i < rows; i++) {
                colSum=colSum+matrix[i][j];
            }
        System.out.println("sum of "+(j+1)+"col: "+colSum);
        }
        //Row Sum;
        int rowSum;
        for(int i=0;i<rows;i++){  // rows
           rowSum=0;
           for(int j=0;j<cols;j++){
                rowSum=rowSum+matrix[i][j];
            }
        System.out.println("sum of "+(i+1)+"row: "+rowSum);
        }
    }
    
}
