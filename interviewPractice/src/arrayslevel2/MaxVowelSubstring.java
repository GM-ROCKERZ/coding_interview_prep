package arrayslevel2;

public class MaxVowelSubstring {

    public static int maxVowelInSubstring(String str,int k)
    {
        int curr = 0;
        int ans =0;

        for(int i=0;i<k;i++)
        {
            if (isVowel(str.charAt(i)))
            {
                curr++;
            }
        }
        ans = curr;

        for(int i = k;i<str.length();i++)
        {
            if(isVowel(str.charAt(i-k)))
            {
                curr--;
            }
            else
            {
                curr++;
            }
            ans=Math.max(ans,curr);
        }
        return ans;

    }

    private static boolean isVowel(char c)
    {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }


    public static void main(String args[])
    {
        String str = "abciiidef";
        int k=3;
        int maxVowelSubstring = maxVowelInSubstring(str ,k);
        System.out.println(maxVowelSubstring);
    }
}
