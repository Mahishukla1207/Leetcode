package Arrays;

import java.util.ArrayList;
import java.util.List;

public class spiralmatrix {
    class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        
        if (matrix == null || matrix.length == 0)
        return result;
        
        int m = matrix.length;
        int n = matrix[0].length;
        int rowStart = 0; int  rowEnd = m-1; int colStart = 0; int colEnd = n-1;
        while (rowStart <= rowEnd && colStart <= colEnd){

            for(int col = colStart; col <= colEnd; col++){
                result.add(matrix[rowStart][col]);
            
            }
                rowStart++;
            
            for( int row = rowStart; row <= rowEnd; row++){
                result.add(matrix[row][colEnd]);
            }
                colEnd--;

                if(rowStart <= rowEnd){
            for(int col = colEnd; col >= colStart; col--){
                result.add(matrix[rowEnd][col]);
            }
                rowEnd--;
                }
            
            if(colStart <= colEnd){

            for(int row = rowEnd; row >= rowStart; row--){
                result.add(matrix[row][colStart]);
            }
                colStart++;
            }
            
        }
        return result;
    }
}
public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        Solution solution = new spiralmatrix().new Solution();
        List<Integer> result = solution.spiralOrder(matrix);
        System.out.println("Spiral Order: " + result);
    }
}
