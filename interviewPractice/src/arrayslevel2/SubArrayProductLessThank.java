package arrayslevel2;

public class SubArrayProductLessThank
{
    public static  int numSubArrayProductLessThank(int[] nums,int k)
    {
        int ans =0;
        int left =0;
        int curr =1;
        for(int right=0;right<nums.length;right++)
        {
            curr*=nums[right];

            while(curr>=k)
            {
                curr/=nums[left];
                left++;
            }
            ans=right-left+1;
        }
        return ans;
    }
    public static void main(String args[])
    {
        int[] nums = {10,5,2,6};
        int k =100;
        int numOfSubarray = numSubArrayProductLessThank(nums,k);

        System.out.println("num of subarray having product less than k is :" +numOfSubarray);
    }
}
