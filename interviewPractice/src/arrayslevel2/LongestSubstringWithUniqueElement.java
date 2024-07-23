package interviewPractice.src.arrayslevel2;

public class LongestSubstringWithUniqueElement
{
    public static int longestUniqSubstr(String str)
    {
        if(str.length()==0)
            return 0;
        if(str.length()==1)
            return 1;

        int left =0;
        int right =0;
        int res = 0;

        boolean[] visted = new boolean[256];
        while(right<str.length())
        {
            if(visted[str.charAt(right)])
            {
                while(visted[str.charAt(right)])
                {
                    visted[str.charAt(left)]= false;
                    left++;
                }
            }
            visted[str.charAt(right)]=true;


            res = Math.max(res,right-left+1);
            right++;
        }
        return res;
    }

    public static void main(String args[])
    {
        String str = "geeksforgeeks";
        int substringLength= longestUniqSubstr(str);
        System.out.println(substringLength);
    }
}
