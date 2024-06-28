package arrayslevel2;

import java.util.Arrays;

public class RunningSumOf1DArray
{
    public static int[] runningSum(int[] nums)
    {
       int[] ans = new int[nums.length];
       ans[0]=nums[0];
       for(int i=1;i<nums.length;i++)
       {
           ans[i]=ans[i-1]+nums[i];
       }
       return ans;
    }

    public static void main(String args[])
    {
        int[] nums = {1,2,3,4};
        int[] result = runningSum(nums);
        System.out.println("running sum of 1d array :" + Arrays.toString(result));
    }
}
