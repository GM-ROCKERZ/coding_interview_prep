package interviewPractice.src.arrayslevel2;

public class ReverseLetters
{
    public static String reverseOnlyLetters(String s)
    {
        char ch[] = s.toCharArray();
        int left =0;
        int right =ch.length-1;

        while(left<right)
        {
            if(Character.isAlphabetic(ch[left]) && Character.isAlphabetic(ch[right]))
            {
                char temp = ch[left];
                ch[left] = ch[right];
                ch[right] = temp;
                left++;
                right--;
            } else if (!Character.isAlphabetic(ch[left]))
            {
                left++;

            }
            else if (!Character.isAlphabetic(ch[right]))
            {
                right --;
            }
        }
        return String.valueOf(ch);
    }

    public static void main(String args[])
    {
        String str = "a-bC-def-ghIJ";
        String result = reverseOnlyLetters(str);
        System.out.print(result);
    }
}
