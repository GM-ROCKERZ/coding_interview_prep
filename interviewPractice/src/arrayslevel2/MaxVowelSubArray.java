package arrayslevel2;

public class MaxVowelSubArray
{
    public static int maxVowels(String s , int k)
    {
        int count =0;
        for(int i=0;i<k;i++)
        {
            if(isVowel(s.charAt(i)))
            {
                count++;
            }
        }
        int ans = count;
        for(int i= k;i<s.length();i++)
        {
            if(isVowel(s.charAt(i)))
            {
                count++;
            }
            if(isVowel(s.charAt(i-k)))
            {
                count--;
            }
            ans = Math.max(ans,count);
        }
        return ans;


    }

    private static  boolean isVowel(char c)
    {
        return c == 'a' || c == 'e'|| c == 'i'|| c=='o' || c=='u';
    }

    public static void main(String[] args)
    {
        String str = "abciiidef";
        int k=3;
        int maxVowelSubstring = maxVowels(str ,k);
        System.out.println(maxVowelSubstring);
    }
}
