package streamapiinterviewquestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ContainsUniquesWords
{
    public static void main(String args[])
    {
        List<String> strings = Arrays.asList("apple","banana","grape","watermelon","banana","orange","orange");

        List<String> unique = strings.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(unique);
    }
}
