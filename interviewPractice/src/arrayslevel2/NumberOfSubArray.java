package arrayslevel2;

import java.util.HashMap;
import java.util.Map;

public class NumberOfSubArray
{
    public static int oddNumberOfSubArray(int[] nums,int k)
    {
        Map<Integer,Integer> counts = new HashMap<>();
        counts.put(0,1);
        int ans =0;
        int curr =0;

        for(int num:nums)
        {
            curr+= num%2;
            ans+= counts.getOrDefault(curr-k,0);
            counts.put(curr,counts.getOrDefault(curr,0)+1);
        }
        return ans;

    }
    public static void main(String args[])
    {
        int[] nums = {1,1,2,1,1};
        int k =3;
        int result = oddNumberOfSubArray(nums,k);
        System.out.println(result);
    }
}
