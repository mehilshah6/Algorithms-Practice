import java.util.*;
public class ApartmentHunting
{
    public static void apartmentHunting(List<Map<String,Boolean>>blocks, String[] reqs)
    {
        int[][] minDistanceFromBlocks = new int[reqs.length][];
        for(int i = 0; i < reqs.length; i++)
        {
            minDistanceFromBlocks[i] = getMinDistances(blocks, reqs[i]);
        }
        int[] maxDistancesAtBlocks = getMaxDistancesAtBlocks(blocks, minDistanceFromBlocks);
        System.out.println(getIdxAtMinValue(maxDistancesAtBlocks));
    }
    public static int[] getMinDistances(List<Map<String,Boolean>>blocks, String req)
    {
        int[] minDistances = new int[blocks.size()];
        int closestReqIdx = Integer.MAX_VALUE;
        for(int i = 0; i < blocks.size(); i++)
        {
            if(blocks.get(i).get(req))
            {
                closestReqIdx = i;
            }
            minDistances[i] = Math.abs(i-closestReqIdx);
        }
        for(int i = blocks.size()-1 ; i>=0; i--)
        {
            if(blocks.get(i).get(req))
            {
                closestReqIdx = i;
            }
            minDistances[i] = Math.min(minDistances[i],Math.abs(i-closestReqIdx));
        }
        return minDistances;
    }
    public static int[] getMaxDistancesAtBlocks(List<Map<String,Boolean>>blocks, int[][] minDistanceFromBlocks)
    {
        int[] maxDistancesAtBlocks = new int[blocks.size()];
        for(int i = 0 ; i <blocks.size(); i++)
        {
            int[] minDistancesAtBlock = new int[minDistanceFromBlocks.length];
            for(int j = 0; j < minDistancesAtBlock.length; j++)
            {
                minDistancesAtBlock[j] = minDistanceFromBlocks[j][i];
            }
            maxDistancesAtBlocks[i] = arrayMax(minDistancesAtBlock);
        }
        return maxDistancesAtBlocks;
    }
    public static int getIdxAtMinValue(int[] array)
    {
        int idxAtMinValue = 0;
        int minValue = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            int currentValue = array[i];
            if (currentValue < minValue) {
                minValue = currentValue;
                idxAtMinValue = i;
            }
        }
        return idxAtMinValue;
    }
    public static int arrayMax(int[] array) {
        int max = array[0];
        for (int a : array) {
            if (a > max) {
                max = a;
            }
        }
        return max;
    }
    public static void main(String[] args)
    {
        List<Map<String,Boolean>>blocks = new ArrayList<Map<String,Boolean>>();
        String[] req = {"g","sc","st"};
        Map<String,Boolean>hm = new HashMap<String,Boolean>();
        hm.put("g",false);
        hm.put("sc",true);
        hm.put("st",false);
        blocks.add(hm);
        hm.put("g",true);
        hm.put("sc",false);
        hm.put("st",false);
        blocks.add(hm);
        hm.put("g",true);
        hm.put("sc",true);
        hm.put("st",false);
        blocks.add(hm);
        hm.put("g",false);
        hm.put("sc",true);
        hm.put("st",false);
        blocks.add(hm);
        hm.put("g",false);
        hm.put("sc",true);
        hm.put("st",true);
        blocks.add(hm);
        apartmentHunting(blocks,req);

    }
}