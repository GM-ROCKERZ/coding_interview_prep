package interviewPractice.src.arrayslevel2;

public class MaximumVowelSubstring
{
    public static int maxVowel(String s, int k)
    {
        String vowel = "aeiou";
        int curr =0;
        int ans =0;

        for(int i=0;i<s.length();i++)
        {
            if(vowel.indexOf(s.charAt(i))>=0)
                curr++;
            if(i>=k && vowel.indexOf(s.charAt(i-k))>=0)
            {
                curr--;
            }
            ans = Math.max(ans,curr);
        }
        return ans;
    }

    public static void main(String args[])
    {
        String str = "abciiidef";
        int k=3;
        int maxVowelSubstring = maxVowel(str ,k);
        System.out.println(maxVowelSubstring);
    }
}
