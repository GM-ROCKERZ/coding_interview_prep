package interviewPractice.src.medium4_StreamQuestions;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNotRepeatedChar
{
    public static void main(String args[])
    {
        String input = "Java stream api is very good concept";
        char firstnotrepeatedchar = input.chars()
                .mapToObj(x->Character.toUpperCase((char)x))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()))
                .entrySet().stream()
                .filter(x->x.getValue()==1L)
                .map(x->x.getKey())
                .findFirst()
                .get();
        System.out.println("First non repeated character :"+firstnotrepeatedchar);
    }
}
