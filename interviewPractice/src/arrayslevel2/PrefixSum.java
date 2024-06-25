package interviewPractice.src.arrayslevel2;

import java.util.Arrays;

public class PrefixSum
{
    public static boolean[] answerQueries(int [] nums,int[][]queries,int limit)
    {
        int [] prefix = new int[nums.length];
        prefix[0] = nums[0];

        for(int i=1;i<nums.length;i++)
        {
            prefix[i] = prefix[i-1]+nums[i];
        }
        System.out.println("prefix array :"+ Arrays.toString(prefix));
        boolean[] ans = new boolean[queries.length];
        for(int i=0;i<queries.length;i++)
        {
            int x = queries[i][0];
            int y = queries[i][1];
            int curr = prefix[y]-prefix[x]+nums[x];
            ans[i] = curr<limit;
        }
        return ans;
    }

    public static void main(String args[])
    {
        int[] nums = {1,6,3,2,7,2};
        int[][] queries = {{0,3},{2,5},{2,4}};
        int limit = 13;
        boolean[] result = answerQueries(nums,queries,limit);
        System.out.println("result array is :" +Arrays.toString(result));
    }
}
