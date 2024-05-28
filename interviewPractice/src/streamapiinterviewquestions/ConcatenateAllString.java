package interviewPractice.src.streamapiinterviewquestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConcatenateAllString
{
    public static void main(String args[])
    {
        List<String> fruits = Arrays.asList("apple","banana","cherry","coconuts","apple");
        String concat = fruits.stream()
                .collect(Collectors.joining());
        System.out.println(concat);
    }
}
