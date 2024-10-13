package arrayslevel2;

public class MaximumSubarray
{
    static int  maxSum(int arr[], int k)
    {
        int currSum =0;
        int n = arr.length;
        int result;

        for(int i =0;i<k;i++)
        {
            currSum+=arr[i];
        }
        result = currSum;

        for(int i=k;i<n;i++)
        {
            currSum +=(arr[i]-arr[i-k]);
           result=Math.max(result,currSum);
        }

        return result;
    }

    public static void main(String args[])
    {
        int[] arr = {1,8,30,-5,20,7};
        int k = 4;
        System.out.println(maxSum(arr,k));
    }
}
