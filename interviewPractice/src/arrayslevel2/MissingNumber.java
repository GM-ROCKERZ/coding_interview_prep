package interviewPractice.src.arrayslevel2;

public class MissingNumber
{
    public static int findMissingNumber(int[] nums)
    {
        int expectedSum = nums.length*(nums.length+1)/2;
        int acutalSum = 0;
        for(int num :nums)
        {
            acutalSum+=num;
        }
        return expectedSum-acutalSum;
    }

    public static void main(String args[])
    {
        int[] nums = {3,0,1};
        int missingNumber = findMissingNumber(nums);
        System.out.println(missingNumber);
    }
}
