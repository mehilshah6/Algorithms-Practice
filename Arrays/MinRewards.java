import java.util.*;
public class MinRewards 
{
    public static void minRewards(int[] arr)
    {
        int[] rewards = new int[arr.length];
        int i;
        for(i=0;i<rewards.length;i++)
        {
            rewards[i] = 1;
        }
        for(i=1;i<rewards.length;i++)
        {
            if(arr[i] > arr[i-1])
            {
                rewards[i] = rewards[i-1]+1;
            }
        }
        for(i=rewards.length-2;i>=0;i--)
        {
            if(arr[i] > arr[i+1])
            {
                rewards[i] = Math.max(rewards[i], rewards[i+1]+1);
            }
        }
        int sum = 0;
        for(i=0;i<rewards.length;i++)
        {
            sum+=rewards[i];
        }
        System.out.println(sum);
    }
    public static void main(String[] args)
    {
        int[] arr = {8,4,2,1,3,6,7,9,5};
        minRewards(arr);

    }
    
}
