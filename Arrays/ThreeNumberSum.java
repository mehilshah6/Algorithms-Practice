import java.lang.*;
import java.util.*;
public class ThreeNumberSum {
    
    public static void threeNumberSum(int[] arr, int targetSum)
    {
        Arrays.sort(arr);
        int i;
        for(i=0;i<arr.length-2;i++)
        {
            int one = arr[i];
            int l = i+1;
            int r = arr.length - 1;
            while(l<r)
            {
            if(one+arr[l]+arr[r] == targetSum)
            {
                System.out.println(one+" "+arr[l]+" "+arr[r]);
                l++;
                r--;
            }
            else if(one+arr[l]+arr[r] < targetSum)
            {
                l++;
            }
            else
            {
                r--;
            }
        }
        }
    }
    public static void main(String[] args)
    {
        int[] arr = {12,3,1,2,-6,5,-8,6};
        int targetSum = 0;
        threeNumberSum(arr,targetSum);
    }
}
