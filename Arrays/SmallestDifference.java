import java.util.*;
import java.lang.*;
public class SmallestDifference {
    public static int smallestDifference(int[] arr1, int[] arr2)
    {
        int i = 0;
        int j = 0;
        int min_diff = Integer.MAX_VALUE;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        while(i < arr1.length && j < arr2.length)
        {
            int diff = Math.max(arr1[i],arr2[j])-Math.min(arr1[i],arr2[j]);
            if(diff < min_diff)
            {
                min_diff = diff;
            }
            if(arr1[i]<arr2[j])
            {
                i++;
            }
            else
            {
                j++;
            }
        }
        return min_diff;
    }
    public static void main(String[] args)
    {
        int[] arr1 = {10,5,40};
        int[] arr2 = {50,90,10};
        System.out.println(smallestDifference(arr1,arr2));
    }
}
