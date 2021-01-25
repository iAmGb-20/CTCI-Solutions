import java.util.*;

public class ZeroMatrix {
    public void setZeroes(int[][] matrix) {
        //if length of matrix is 1??
        int endCol = matrix[0].length;
        int endRow = matrix.length;
        Set<Integer> row_set = new HashSet<Integer>();
        Set<Integer> col_set = new HashSet<Integer>();
        
        for (int i = 0; i < endRow; i++)
        {
            for (int j = 0; j < endCol; j++)
            {
                if (matrix[i][j] == 0)
                {
                    row_set.add(i);
                    col_set.add(j);
                }
            }
            
        }
        
        for (int i = 0; i < endRow; i++)
        {
            for (int j = 0; j < endCol; j++)
            {
                if (row_set.contains(i) || col_set.contains(j))
                {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}

