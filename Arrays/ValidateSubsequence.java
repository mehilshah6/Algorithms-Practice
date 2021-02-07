package Arrays;
import java.util.*;
import java.lang.*;
public class ValidateSubsequence {
    public static boolean validateSubsequence(int[] arr1, int[] arr2)
    {
        int i;
        int j = 0;
        for(i = 0; i< arr1.length; i++)
        {
            if(arr1[i] == arr2[j])
            {
                j++;
                if(j==arr2.length)
                {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args)
    {
        int[] arr1 = {5,1,22,25,6,-1,8,10};
        int[] arr2 = {1,6,-1,10};
        System.out.println(validateSubsequence(arr1,arr2));
    }
}
