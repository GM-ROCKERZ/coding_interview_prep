package streamapiinterviewquestions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MostFrequentElement
{
    public static void main(String args[])
    {
        Integer[] array = {10, 20, 10, 30, 50, 20, 60, 20, 20, 20, 70, 80, 20, 90};

        //step1: find the element that occured the most number of times
        Map.Entry<Integer,Long> mostCommonEntry= Arrays.stream(array)
                .collect(Collectors.groupingBy(e->e,Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .orElseThrow();
        int mostCommonElement = mostCommonEntry.getKey();
        System.out.println(mostCommonElement);

        //step2 Remove the immediate left and right elements of the most common element
        List<Integer> result = Arrays.stream(array)
                .filter(e->!(e==mostCommonElement|| e==mostCommonElement-1||e==mostCommonElement+1))
                .collect(Collectors.toList());
        System.out.println("Resulting array after removing immediate left and right elements: " + result);
    }
}
