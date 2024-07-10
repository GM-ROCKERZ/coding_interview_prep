package arrayslevel2;

import java.util.*;

public class Intersection
{
    public static List<Integer> arrIntersection(int[][] nums)
    {
        Map<Integer,Integer> counts = new HashMap<>();
        for(int[] arr:nums)
        {
            for (int x:arr)
            {
                counts.put(x,counts.getOrDefault(x,0)+1);
            }
        }
        int n = nums.length;
        List<Integer> ans = new ArrayList<>();
        for(int key : counts.keySet())
        {
            if(counts.get(key)==n)
            {
                ans.add(key);
            }
        }
        Collections.sort(ans);
        return ans;
    }

    public static void main(String args[])
    {
        int[][] nums ={{3,1,2,4,5},{1,2,3,4},{3,4,5,6}};
        List<Integer> result = arrIntersection(nums);
        System.out.print(result);
    }
}
