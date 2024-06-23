package arrayslevel2;

public class LongestSubstring
{
    public static int findLength(String s)
    {
        int left =0;
        int curr =0;
        int ans =0;

        for(int right =0;right<s.length();right++)
        {
            if(s.charAt(right)=='0')
            {
                curr++;
            }
            while(curr>1)
            {
                if (s.charAt(left) == '0')
                {
                    curr--;
                }
                left++;
                }
            ans = Math.max(ans,right-left+1);
            }
        return ans;
        }

        public static void main(String args[])
        {
            String s = "11001011";
            int longestSubstring = findLength(s);
            System.out.println("longest substring :" +longestSubstring);
        }
    }

