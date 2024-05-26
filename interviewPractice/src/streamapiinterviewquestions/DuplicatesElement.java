package streamapiinterviewquestions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicatesElement
{
    public static void main(String args[])
    {
        List<Integer> mylist = Arrays.asList(10,15,8,49,25,98,98,32,15);
        Set<Integer> set = new HashSet<>();
        mylist.stream()
                .filter(n->!set.add(n))
                .forEach(System.out::println);
    }
}
