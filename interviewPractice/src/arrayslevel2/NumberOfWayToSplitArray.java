package interviewPractice.src.arrayslevel2;

import java.util.Arrays;

public class NumberOfWayToSplitArray
{
    public static int wayToSplitArray(int[] nums)
    {
        int n = nums.length;
        long[] prefix = new long[n];
        prefix[0]= nums[0];
        for(int i =1;i<n;i++)
        {
            prefix[i] = prefix[i-1] + nums[i];

        }
        System.out.println(Arrays.toString(prefix));
        int ans =0;
        for(int i =0;i<n-1;i++)
        {
            long leftSection = prefix[i];
            long rightSection = prefix[n-1] - prefix[i];
            if(leftSection >= rightSection)
            {
                ans++;
            }
        }
        return ans;
    }

    public static void main(String args[])
    {
        int[] nums = {10,4,-8,7};
        int result = wayToSplitArray(nums);
        System.out.println("number of way to split array :" +result);
    }
}
