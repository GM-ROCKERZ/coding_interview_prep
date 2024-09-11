package interviewPractice.src.frequentlyaskedquestionspart1;

public class NonRepeatingCharacter
{
    public static void main(String args[])
    {
        String str = "leetcode";
        int[] freq = new int[26];

        for(int i=0 ;i<str.length();i++)
        {
            freq[str.charAt(i)-'a']++;
        }
        for(int i=0;i<str.length();i++)
        {
            if(freq[str.charAt(i)-'a']==1)
            {
                System.out.println("first non-repeating char is :"+ str.charAt(i));
                return;
            }

        }
        System.out.println("There are no non repeating char");
    }
}
