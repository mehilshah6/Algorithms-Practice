package Arrays;
import java.util.*;
import java.lang.*;
public class SpiralTraverse
{
    public static void spiralTraverse(int[][] arr)
    {
        int start_row = 0;
        int end_row = arr.length - 1;
        int start_col = 0;
        int end_col = arr[0].length - 1;
        int i;
        while(start_row <= end_row && start_col <= end_col)
        {
            for(i=start_col; i<=end_col; i++)
            {
                System.out.print(arr[start_row][i]+" ");
            }
            start_row++;
            for(i = start_row ; i <= end_row; i++)
            {
                System.out.print(arr[i][end_col]+" ");
            }
            end_col--;
            if(start_row < end_row)
            {
                for(i = end_col; i >= start_col; i--)
                {
                    System.out.print(arr[end_row][i]+" ");
                }
                end_row--;
            }
            if(start_col < end_col)
            {
                for(i=end_row; i >= start_row; i--)
                {
                    System.out.print(arr[i][start_col]+" ");
                }
                start_col++;
            }
        }
    }
    public static void main(String[] args)
    {
        int[][] arr = {{1,2,3,4},{12,13,14,5},{11,16,15,6},{10,9,8,7}};
        spiralTraverse(arr);
    }
}