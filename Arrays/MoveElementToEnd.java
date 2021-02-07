public class MoveElementToEnd
{
    public static void moveElementToEnd(int[] arr, int element)
    {
        int j = 0;
        int i;
        for(i=0;i<arr.length;i++)
        {
            if(arr[i]!=element)
            {
                arr[j] = arr[i];
                j++;
            }
        }
        for(i=j;i<arr.length;i++)
        {
            arr[i] = element;
        }
        for(i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args)
    {
        int[] arr = {2,1,2,2,3,4,2};
        int element = 2;
        moveElementToEnd(arr,element);
    }
}