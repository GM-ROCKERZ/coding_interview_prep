package medium4_StreamQuestions;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicatString
{
    public static void main(String args[])
    {
        String input = "JavaApi";

        List<Character> duplicateLis = input.chars()
                .mapToObj(x->Character.toUpperCase((char) x) )
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new ,Collectors.counting()))
                .entrySet().stream()
                .filter(x->x.getValue()>1L)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println(duplicateLis);
    }
}
