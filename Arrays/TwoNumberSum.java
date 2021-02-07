package Arrays;
import java.util.*;
import java.lang.*;
public class TwoNumberSum
{
    public static boolean twoNumberSumSorting(int[] arr, int targetSum)
    {
        Arrays.sort(arr);
        int l = 0;
        int r = arr.length - 1;
        while(l<r)
        {
            if(arr[l]+arr[r]==targetSum)
            {
                System.out.println(arr[l]+" "+arr[r]);
                return true;
            }
            else if(arr[l]+arr[r]<targetSum)
            {
                l++;
            }
            else 
            {
                r--;
            }
        }
        return false;
    }
    public static boolean twoNumberSumHashTable(int[] arr, int targetSum)
    {
        HashMap<Integer,Integer>hm = new HashMap<Integer,Integer>();
        for(int i=0;i<arr.length;i++)
        {
            if(hm.containsKey(targetSum-arr[i]))
            {
                return true;
            }
            else
            {
                hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
            }
        }
        return false;
    }
    public static void main(String[] args)
    {
        int[] arr = {3,5,-4,8,11,1,-1,6};
        int targetSum = -10;
        System.out.println(twoNumberSumHashTable(arr,targetSum));
    }
}