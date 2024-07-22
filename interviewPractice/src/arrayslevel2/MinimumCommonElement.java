package interviewPractice.src.arrayslevel2;

public class MinimumCommonElement
{
    public static int getCommon(int[] nums1 ,int[] nums2)
    {
        int i=0;
        int j=0;
        while(i<nums1.length && j<nums2.length)
        {
            if(nums1[i] < nums2[j])
            {
                i++;
            }
            else if (nums2[j]<nums1[i])
            {
                j++;
            }
            else
                return nums1[i];
        }
        return -1;
    }

    public static void main(String args[])
    {
        int[] nums1 = {1,2,3};
        int[] nums2 = {2,4};
        int commonElement = getCommon(nums1,nums2);
        System.out.println(commonElement);
    }
}
