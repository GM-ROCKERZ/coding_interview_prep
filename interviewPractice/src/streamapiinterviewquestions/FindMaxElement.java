package streamapiinterviewquestions;

import java.util.Arrays;
import java.util.List;

public class FindMaxElement
{
    public static void main(String args[])
    {
        List<Integer> mylist = Arrays.asList(10,15,8,49,25,98,32,15);
        int max = mylist.stream()
                .max(Integer::compare)
                .get();
        System.out.println(max);
    }
}
