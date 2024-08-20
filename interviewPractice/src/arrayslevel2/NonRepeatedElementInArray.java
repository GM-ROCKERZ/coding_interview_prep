package arrayslevel2;

public class NonRepeatedElementInArray
{
    public static int removeDuplicates(int[] arr)
    {
        if(arr==null || arr.length==0)
        {
            return 0;
        }
        int left =1;
        for(int right = 1;right<arr.length;right++ )
        {
            if(arr[right] !=arr[left-1])
            {
                arr[left] = arr[right];
                left++;
            }
        }
        System.out.println();
        return left;
    }

    public static void main(String args[])
    {
        int[] array = {1, 2, 2, 3, 4, 4, 5, 5, 6, 7, 7, 8, 9, 9};
        int newLength = removeDuplicates(array);
        for(int i =0 ;i<newLength;i++)
        {
            System.out.print(array[i]+" ");
        }
    }
}
