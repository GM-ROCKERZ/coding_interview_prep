package interviewPractice.src.medium4_StreamQuestions;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FindDuplicateNumber
{
    public static void main(String args[])
    {
        int a[] = {1,4,5,2,12,34,2,11};
        System.out.println("Duplicate number by Java " +findduplicatesbyjava8(a));
    }

    private static int findduplicatesbyjava8(int[] a)
    {
        Map<Integer,Long> map = Arrays.stream(a).boxed()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        int duplicate = map.keySet().stream()
                .filter(n->map.get(n)>1)
                .findFirst()
                .orElse(0);
        map.keySet().stream()
                .filter(x->map.get(x)>1)
                .forEach(System.out::println);
        return duplicate;
    }
}
