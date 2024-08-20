package streamapiinterviewquestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindSquare
{
    public static void main(String args[])
    {
        List<Integer> numbers = Arrays.asList(1,2,3,4,6);
        List<Integer> squares = numbers.stream()
                .map(num->num*num)
                .collect(Collectors.toList());
        System.out.println(squares);
    }
}
