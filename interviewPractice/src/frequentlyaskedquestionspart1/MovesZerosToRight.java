package frequentlyaskedquestionspart1;

import java.util.Arrays;

public class MovesZerosToRight
{
    public static void moveZeros(int arr[])
    {
        int left =0;

        for(int right=0;right<arr.length;right++)
        {
            if(arr[right]!=0)
            {
                int temp = arr[right];
                arr[right]= arr[left];
                arr[left] = temp;
                left++;
            }
        }
    }

    public static void main(String args[])
    {
        int arr[] = { 4,5,0,0,3,2,0,0,5,0,1};
        moveZeros(arr);
        System.out.println(Arrays.toString(arr));
    }
}
