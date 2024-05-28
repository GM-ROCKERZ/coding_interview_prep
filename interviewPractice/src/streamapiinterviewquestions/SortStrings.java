package interviewPractice.src.streamapiinterviewquestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortStrings
{
    public static void main(String args[])
    {
        List<String> strings = Arrays.asList("apple","banana","grape","watermelon","kiwi","orange");
        List<String> sortedUpperCase = strings.stream()
                .map(str->str.toUpperCase())
                .sorted()
                .collect(Collectors.toList());

        System.out.println(sortedUpperCase);
    }

}
