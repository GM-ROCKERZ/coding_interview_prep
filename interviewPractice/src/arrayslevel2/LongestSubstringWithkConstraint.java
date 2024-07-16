package arrayslevel2;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithkConstraint
{
    public static int findLongestSubstring(String s,int k)
    {
        Map<Character,Integer> counts = new HashMap<>();
        int left = 0;
        int ans =0;

        for(int right =0;right<s.length();right++)
        {
            char c = s.charAt(right);
            counts.put(c, counts.getOrDefault(c,0)+1);

            while(counts.size()>k)
            {
                char remove =s.charAt(left);
                counts.put(remove,counts.getOrDefault(remove,0)-1);
                if(counts.get(remove)==0)
                {
                    counts.remove(remove);
                }
                left++;
            }
            ans = Math.max(ans,right-left+1);
        }
        return ans;
    }

    public static void main(String args[])
    {
        String s = "eceba";
        int k = 2;
        int longestSubstring = findLongestSubstring(s,k);
        System.out.println("longest substring length is :" +longestSubstring);
    }
}
