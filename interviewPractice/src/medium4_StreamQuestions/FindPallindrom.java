package interviewPractice.src.medium4_StreamQuestions;

import java.util.stream.IntStream;

public class FindPallindrom
{
    public static void main(String args[])
    {
        System.out.println("Is pallindromNumber :"+isPallindrom("ababa"));
    }
    private static boolean isPallindrom(String n)
    {
        String value = String.valueOf(n);
        int len = value.length();
        boolean ispal = IntStream.range(0,len/2)
                .anyMatch(index ->value.charAt(index)==value.charAt(len-index-1));
        return ispal;
    }
}
