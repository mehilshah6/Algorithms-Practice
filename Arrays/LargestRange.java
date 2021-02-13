import java.util.*;
public class LargestRange {
    public static void largestRange(int[] arr)
    {
        int longestLength = 0;
        int[] bestRange = new int[2];
        Map<Integer,Boolean> nums = new HashMap<Integer,Boolean>();
        for(int num : arr)
        {
            nums.put(num,true);
        }
        for(int num : arr)
        {
            if(!nums.get(num))
            {
                continue;
            }
            nums.put(num,false);
            int currentLength = 1;
            int left = num-1;
            int right = num+1;
            while(nums.containsKey(left))
            {
                nums.put(left,false);
                currentLength++;
                left--;
            }
            while(nums.containsKey(right))
            {
                nums.put(right,false);
                currentLength++;
                right++;
            }
            if(currentLength > longestLength)
            {
                longestLength = currentLength;
                bestRange[0] = left + 1;
                bestRange[1] = right - 1;
            }
        }
        System.out.println(bestRange[0]+" "+bestRange[1]);
    }
    public static void main(String[] args)
    {
        int[] arr = {1,11,3,0,15,5,9,4,10,8,12,6};
        largestRange(arr);
    }
}
