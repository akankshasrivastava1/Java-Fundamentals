package Nov_26;

public class IdenticalMatrix {
    public static void main(String[] args) {
        int[][] matrix1={
             {1, 2, 3, 4},
             {5, 6, 7, 8},
             {9,10,11,12},
             {13,14,15,16}
             };

            int[][] matrix2={
                {1, 2, 6, 4},
                {5, 6, 7, 8},
                {9,10,11,12},
                {13,14,15,16}
                };


                int rows=matrix1.length;
                int cols=matrix1[0].length;
                boolean isIdentical=true;
            
                for(int i=0;i<rows;i++){   //rows
                    for(int j=0;j<cols;j++){  //cols
                        if(matrix1[i][j]!=matrix2[i][j]){
                            isIdentical=false;
                            break;
                        }
                    }
                    if(isIdentical==false){
                        break;
                        }
                    }

                    if(isIdentical){
                        System.out.println("Identical");
                    }else {
                   System.out.println("Not identical");
                    }
    }
}
