package basiccodinginterviewquestions;

import java.util.Arrays;

public class ReveseArray
{
    public static void main(String args[])
    {
        int[] inputArr = new int[] {1,2,3,4,5};
        revArray(inputArr);
        System.out.println(Arrays.toString(inputArr));
    }
    public static void revArray(int[] arr)
    {
        int start = 0;
        int end = arr.length-1;
        while(start<end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
