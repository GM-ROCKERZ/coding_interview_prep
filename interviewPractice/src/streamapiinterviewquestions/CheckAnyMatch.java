package interviewPractice.src.streamapiinterviewquestions;

import java.util.Arrays;
import java.util.List;

public class CheckAnyMatch
{
    public static void main(String args[])
    {
        List<Integer> list = Arrays.asList(1,3,6,3,8,9,19);
        boolean exists = list.stream()
                .anyMatch(n->n.equals(9));
        System.out.println(exists);
    }
}
