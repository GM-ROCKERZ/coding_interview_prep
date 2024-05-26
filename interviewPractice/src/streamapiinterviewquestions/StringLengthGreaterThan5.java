package streamapiinterviewquestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringLengthGreaterThan5
{
    public static void main(String args[])
    {
        List<String> names = Arrays.asList("John", "Alexander", "Chris", "Elizabeth", "Amy", "Michael");

        List<String> result = names.stream()
                .filter(name ->name.length()>5)
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        result.forEach(System.out::println);
    }
}
