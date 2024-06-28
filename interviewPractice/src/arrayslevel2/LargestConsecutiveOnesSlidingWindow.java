package arrayslevel2;

public class LargestConsecutiveOnesSlidingWindow
{
    public static int longestOnes(int[] nums,int k)
    {
        int left =0;
        int right;
        for(right=0;right< nums.length;right++)
        {
            if(nums[right] ==0)
            {
                k--;
            }
            if(k<0)
            {
//                k+=1-nums[left];
                if(nums[left]==0)
                    k++;
                left++;
            }
        }
        return right-left;
    }
    public static void main(String args[])
    {
        int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;
        int longestOnes = longestOnes(nums,k);
        System.out.println("longest ones string is : "+longestOnes);
    }
}
