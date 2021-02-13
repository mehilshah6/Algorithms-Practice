import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FourNumberSum {
    public static void fourNumberSum(int[] array, int targetSum)
    {
        Map<Integer, List<Integer[]>> allPairSums = new HashMap<>();
        for (int i = 1; i < array.length - 1; i++) {
        for (int j = i + 1; j < array.length; j++) {
        int currentSum = array[i] + array[j];
        int difference = targetSum - currentSum;
        if (allPairSums.containsKey(difference)) {
        for (Integer[] pair : allPairSums.get(difference)) {
            System.out.println(array[i]+" "+array[j]+" "+pair[0]+" "+pair[1]);
        }
        }
        }
        for (int k = 0; k < i; k++) {
        int currentSum = array[i] + array[k];
        Integer[] pair = {array[k], array[i]};
        if (!allPairSums.containsKey(currentSum)) {
        List<Integer[]> pairGroup = new ArrayList<Integer[]>();
        pairGroup.add(pair);
        allPairSums.put(currentSum, pairGroup);
        } else {
        allPairSums.get(currentSum).add(pair);
        }
        }
        }
    }
    public static void main(String[] args)
    {
        int[] arr = {7,6,4,-1,1,2};
        int target = 16;
        fourNumberSum(arr,target);
    }
}
