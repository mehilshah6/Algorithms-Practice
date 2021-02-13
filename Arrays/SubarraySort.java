public class SubarraySort
{
    public static void subarraySort(int[] arr)
    {
        int min_unsorted_ele = 101;
        int max_unsorted_ele = -1;
        int i;
        for(i=1;i<arr.length-1;i++)
        {
            if(arr[i+1]<arr[i] || arr[i-1]>arr[i])
            {
                if(arr[i] < min_unsorted_ele)
                {
                    min_unsorted_ele = arr[i];
                }
                if(arr[i] > max_unsorted_ele)
                {
                    max_unsorted_ele = arr[i];
                }
            }
        }
        int first_index = -1;
        int last_index = -1;
        for(i=0;i<arr.length;i++)
        {
            if(arr[i] > min_unsorted_ele)
            {
                first_index = i;
                break;
            }
        }
        for(i=arr.length-1; i>=0; i--)
        {
            if(arr[i] < max_unsorted_ele)
            {
                last_index = i;
                break;
            }
        }
        System.out.println(first_index+" "+last_index);
    }
    public static void main(String[] args)
    {
        int[] arr = {1,2,4,7,10,11,7,12,6,7,16,18,19};
        subarraySort(arr);
    }
}