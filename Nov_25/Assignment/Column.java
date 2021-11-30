package Nov_25.Assignment;

public class Column {
    //Print the matrix column wise"
    public static void main(String[] args) {    
        int rows, cols, sumCol;    
            
        //Initialize matrix a    
        int a[][] = {       
                        {1, 2, 3},    
                        {4, 5, 6},    
                        {7, 8, 9}    
                    };    
        rows = a.length;       
        cols = a[0].length;         
        for(int i = 0; i < cols; i++){    
            sumCol = 0;    
            for(int j = 0; j < rows; j++){    
              sumCol = sumCol + a[j][i];    
            }    
            System.out.println("Sum of " + (i+1) +" column: " + sumCol);    
        }    
    }    
}    
