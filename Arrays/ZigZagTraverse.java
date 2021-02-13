public class ZigZagTraverse {
    public static void zigZagTraverse(int[][] arr)
    {
        int height = arr.length-1;
        int width = arr[0].length-1;
        int row = 0;
        int col = 0;
        boolean goingDown = true;
        while(!outOfBounds(row, col, height, width))
        {
            System.out.print(arr[row][col]+" ");
            if(goingDown)
            {
                if(col == 0 || row == height)
                {
                    goingDown = false;
                    if(row == height)
                    {
                        col++;
                    }
                    else
                    {
                        row++;
                    }
                }
                else
                {
                    row++;
                    col--;
                }
            }
            else
            {
                if(row == 0 || col == width)
                {
                    goingDown = true;
                    if(col == width)
                    {
                        row++;
                    }
                    else
                    {
                        col++;
                    }
                }
                else
                {
                    row--;
                    col++;
                }
            }
        }
    }
    public static boolean outOfBounds(int row, int col, int height, int width)
    {
        return row < 0 || row > height || col < 0 || col > width;
    }
    public static void main(String[] args)
    {
        int[][] arr = {{1,3,4,10},{2,5,9,11},{6,8,12,15},{7,13,14,16}};
        zigZagTraverse(arr);
    }
}
