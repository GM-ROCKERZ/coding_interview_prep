package algorithms;

import java.util.Arrays;

public class QuickSortAlgorithm
{
    public static void quickSort(int [] array ,int left,int right)
    {
        if(left>=right)
        {
            return;
        }
        int pivot = array[(left+right)/2];
        int index = partition(array,left,right,pivot);
        quickSort(array,left,index-1);
        quickSort(array,index,right);

    }

    private static int partition(int[] array, int left, int right, int pivot)
    {
        while(left<=right)
        {
            while(array[left]<pivot)
            {
                left++;
            }
            while(array[right]>pivot)
            {
                right--;
            }
            if (left<=right)
            {
                swap(array,left,right);
                left++;
                right--;
            }
        }
        return left;
    }

    private static void swap(int[] array, int i, int j)
    {
        int temp = array[i];
        array[i] = array[j];
        array[j]=temp;
    }

    public static void main(String args[])
    {
        int[] array = {5,2,9,1,5,6,7};
        quickSort(array,0, array.length-1);
        System.out.println(Arrays.toString(array));
    }
}
