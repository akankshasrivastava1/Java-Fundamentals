package Nov_26;

public class IdentityMatrix {
    public static void main(String[] args) {
        int[][] matrix={
            {1, 0, 0, 0},//
            {0, 0, 0, 0},//
            {0, 0, 1, 0},//
            {0, 0, 0, 1}};
            
            int rows=matrix.length;
            int cols=matrix[0].length;
        //
        //           // 1-> diag & val==1
        //           // 2-> not a diag & val==0
           boolean isIdentityMatrix=true;
           for(int i=0;i<rows;i++){
               for(int j=0;j<cols;j++){
                   if(i==j && matrix[i][j]!=1){
                       isIdentityMatrix=false;
                       break;
                    }else if(i!=j && matrix[i][j]!=0){
                        isIdentityMatrix=false;
                        break;
                    }
                 }
                if(isIdentityMatrix==false){
                    break;
                    }
                }
                if(isIdentityMatrix){
                    System.out.println("Identity Matrix");
                }else{
                    System.out.println("Not a Identity Matrix");
                }
    
    }
}
