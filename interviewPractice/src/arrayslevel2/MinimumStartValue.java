package arrayslevel2;

public class MinimumStartValue
{
    public static int minStartValue(int nums[])
    {
        int min =0;
        int total =0;

        for(int num:nums)
        {
            total +=num;
            min = Math.min(min,total);
        }
        return -min+1;
    }

    public static void main(String args[])
    {
        int[] nums = {-3,2,-3,4,2};
        int startvalue = minStartValue(nums);
        System.out.println("Minimum start value : "+startvalue);
    }
}
