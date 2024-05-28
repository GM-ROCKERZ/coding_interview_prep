package streamapiinterviewquestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortInDecendingOrder
{
    public static void main(String args[])
    {
        List<String> strings = Arrays.asList("apple","banana","grape","watermelon","kiwi","orange");
        List<String> strDesc = strings.stream()
                .sorted(Comparator.comparing(String::length).reversed())
                .collect(Collectors.toList());
        System.out.println(strDesc);
    }
}
