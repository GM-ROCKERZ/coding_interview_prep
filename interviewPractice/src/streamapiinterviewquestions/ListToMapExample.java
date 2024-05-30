package interviewPractice.src.streamapiinterviewquestions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ListToMapExample
{
    public static void main(String args[])
    {
        List<String> str = Arrays.asList("apple","banana","cherry");
        Map<String ,Integer> map = str.stream()
                .collect(Collectors.toMap(
                        Function.identity(),String::length
                ));
        System.out.println(map);
    }
}
