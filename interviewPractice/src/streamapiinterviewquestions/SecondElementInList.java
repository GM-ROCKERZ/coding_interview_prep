package interviewPractice.src.streamapiinterviewquestions;

import java.net.Inet4Address;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SecondElementInList
{
    public static void main(String args[]){

        List<Integer> numbers = Arrays.asList(2,7,9,10,40);
        Optional<Integer> secondElement = numbers.stream()
                .distinct()
                .sorted()
                .skip(1)
                .findFirst();
        System.out.println(secondElement);
    }
}
