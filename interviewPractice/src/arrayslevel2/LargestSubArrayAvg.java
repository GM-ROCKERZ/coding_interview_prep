package arrayslevel2;

public class LargestSubArrayAvg {

    public static double findMaxAvg(int nums[],int k)
    {
        double curr =0;
        for (int i=0;i<k;i++)
        {
            curr += nums[i];
        }
        double result = curr;
        for(int i=k;i<nums.length;i++)
        {
            curr+= nums[i]-nums[i-k];
            result = Math.max(result,curr);
        }
        return result/k;

    }

    public static void main(String args[])
    {
        int[] nums = {1,12,-5,-6,50,3};
        int k= 4;
        double largestAvg = findMaxAvg(nums,k);
        System.out.println("largest avg :" +largestAvg);
    }
}
