package interviewPractice.src.medium4_StreamQuestions;

import java.util.Arrays;
import java.util.Comparator;

public class FindSecondHighestNumber
{
    public static void main(String args[])
    {
        int a[] = {3,6,32,1,8,5,31,22};
        int secondMax = Arrays.stream(a)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findAny().get();
        System.out.println(secondMax);
    }
}
