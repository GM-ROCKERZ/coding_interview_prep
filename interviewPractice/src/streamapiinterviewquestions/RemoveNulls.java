package interviewPractice.src.streamapiinterviewquestions;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class RemoveNulls
{
    public static void main(String args[])
    {
        List<String> strings = Arrays.asList("apple",null,"grape","watermelon","banana",null,null);
        List<String> nonNull = strings.stream()
                .filter(Objects::nonNull)
                .collect(Collectors.toList());
        System.out.println(nonNull);
    }
}
