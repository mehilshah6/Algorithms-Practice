public class MonontonicArray {
    public static boolean monotonicArray(int[] arr)
    {
        boolean isNonDecreasing = true;
        boolean isNonIncreasing = true;
        for(int i=1; i<arr.length;i++)
        {
            if(arr[i] > arr[i-1])
            {
                isNonIncreasing = false;
            }
            if(arr[i] < arr[i-1])
            {
                isNonDecreasing = false;
            }
        }
        return isNonIncreasing || isNonDecreasing;
    }
    public static void main(String[] args)
    {
        int[] arr1 = {-1,-5,-10,-1100,-1100,-1101,-1102,-9001};
        int[] arr2 = {1,1,1,2,3,4,4,5};
        System.out.println(monotonicArray(arr1));
        System.out.println(monotonicArray(arr2));
    }
}
