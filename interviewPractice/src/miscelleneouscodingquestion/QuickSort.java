package miscelleneouscodingquestion;


public class QuickSort
{
    public static void quickSort(int[]array, int left,int right)
    {
        if(left<right)
        {
            int pivot = partition(array,left,right);
            quickSort(array,left,pivot-1);
            quickSort(array,pivot+1,right);
        }

    }

    private static int partition(int[] array, int left, int right)
    {
        int pivot=array[right];
        int i = left-1;
        for (int j=left;j<right;j++)
        {
            if (array[j]<pivot)
            {
                i++;
                swap(array,i,j);
            }
        }
        swap(array,i+1,right);
        return i+1;
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
        quickSort(array,0,array.length-1);
        for(int num : array)
        {
            System.out.print(num+" ");
        }
    }
}
