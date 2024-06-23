package arrayslevel2;

public class LargestSubArraySum
{
    public static int findBestSubArray(int[] nums,int k)
    {
        int curr =0;
        for(int i =0;i<k;i++)
        {
            curr+=nums[i];

        }
        int ans = curr;
        for(int i =k;i<nums.length;i++)
        {
            curr+=nums[i]-nums[i-k];
            ans =Math.max(ans,curr);
        }
        return ans;
    }

    public static void main(String args[])
    {
        int[] nums = {3,-1,4,12,-8,5,6};
        int k= 4;
        int largestSum = findBestSubArray(nums,4);
        System.out.println("largest subarraySum :"+largestSum);
    }
}
