public class Rotate_matrix
{
    /*
    Given a 2D array of size n x n, rotate it by 90 degrees
    Solution here is to transpose and swap
    */
    public void rotate(int[][] arr)
    {
        //first step is to tranpose the matrix
        //second step is to switch the columns and the rows
        int n = arr.length;
        
        //transposing...
        for (int i = 0; i < n; i++)
        {
            for (int j = i; j < n; j++)
            {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        //switch the columns and the rows(swapping)
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < (n/2); j++)
            {
                int temp = arr[i][j];
                arr[i][j] = arr[i][n-1-j];
                arr[i][n-1-j] = temp; 
            }
        }


    }
}