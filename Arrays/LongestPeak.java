public class LongestPeak {
    public static int longestPeak(int[] arr)
    {
        int maxPeakLength = 0;
        int i = 1;
        boolean isPeak;
        while(i < arr.length-1)
        {
            isPeak = arr[i] > arr[i-1] && arr[i] > arr[i+1];
            if(!isPeak)
            {
                i++;
                continue;
            }
            int leftIndex = i-2;
            int rightIndex = i+2;
            while(leftIndex >= 0 && arr[leftIndex] < arr[leftIndex+1])
            {
                leftIndex--;
            }
            while(rightIndex < arr.length && arr[rightIndex-1] > arr[rightIndex])
            {
                rightIndex++;
            }
            maxPeakLength = Math.max(maxPeakLength, rightIndex - leftIndex - 1);
            i = rightIndex;
        }
        return maxPeakLength;
    }
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,3,4,0,10,6,5,-1,-3,3,2};
        System.out.println(longestPeak(arr));
    }
}
