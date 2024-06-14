package interviewPractice.src.frquentlyaskedJavaquestions;

import java.util.Arrays;

public class Anagram
{
    public static void main(String args[])
    {
        String str1 = "own";
        String str2 = "now";
        char[] chArr1 = str1.toCharArray();
        char[] chArr2 = str2.toCharArray();
        Arrays.sort(chArr1);
        Arrays.sort(chArr2);
        System.out.println(Arrays.equals(chArr1,chArr2));
    }
}
