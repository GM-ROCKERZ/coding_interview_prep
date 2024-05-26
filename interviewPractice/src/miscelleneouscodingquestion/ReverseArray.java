package miscelleneouscodingquestion;

public class ReverseArray
{
    static void revArray(int[] arr)
    {
        int n = arr.length-1;
        for(int i=0;i<n/2;i++)
        {
            int temp = arr[i];
            arr[i] = arr[n-i];
            arr[n-i] = temp;
        }

    }
    public static void main(String args[])
    {
        int[] arr = {2,4,5,7,10,24,19};
        revArray(arr);
        for(int i : arr)
        {
            System.out.print(" "+i);
        }
    }
}
