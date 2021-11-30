package Nov_26;
//Transpose of a Matrix
public class TransposwMatrix {
    public static void main(String[] args) {
        int[][] matrix={
        {1, 2, 3, 4},
        {5, 6, 7, 8},};
        int rows=matrix.length;
        int cols=matrix[0].length;
        int newRow=cols;
        int newCol=rows;
        int[][] TransposedMatrix=new int[newRow][newCol];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                TransposedMatrix[j][i]=matrix[i][j];
                }
            }
        for(int i=0;i<newRow;i++){
            for(int j=0;j<newCol;j++){
        System.out.print(TransposedMatrix[i][j]+" ");
        }
        System.out.println();
        }
    }
}
