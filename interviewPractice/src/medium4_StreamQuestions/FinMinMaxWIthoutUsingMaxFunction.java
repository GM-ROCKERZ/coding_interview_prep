package interviewPractice.src.medium4_StreamQuestions;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FinMinMaxWIthoutUsingMaxFunction
{
    public static void main(String[] args)
    {
        int[] arr = {2,3,1,22,11,33,5};
        int max = Arrays.stream(arr)
                .boxed()
                .reduce(Integer.MIN_VALUE,(a,b)->Integer.max(a,b)).intValue();
        int min = Arrays.stream(arr)
                .boxed()
                .reduce(Integer.MAX_VALUE,(a,b)->Integer.min(a,b)).intValue();
        System.out.println("Max: "+max+" Min :"+min);
    }
}
