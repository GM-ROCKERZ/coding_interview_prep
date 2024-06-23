package algorithms;

import java.util.Arrays;

public class SelectionSort
{

   static int findSmallestElement(int[] arr)
    {
        int smallest=Integer.MAX_VALUE;
        int smallest_index =0;
        for(int i = 1;i<arr.length;i++)
        {
            if(arr[i]<smallest)
            {
                smallest=arr[i];
                smallest_index=i;
            }
        }
        return smallest_index;
    }

    static int[] selectionSort(int[] arr)
    {
        int[] newArr = new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            int smallest = findSmallestElement(arr);
            newArr[i] = arr[smallest];
        }
        return newArr;
    }

    public static void main(String args[])
    {
        int[] arr = {2,8,9,4,6,3,7,5};
        int[] sortesArr = selectionSort(arr);
        System.out.println(Arrays.toString(sortesArr));
    }
}
