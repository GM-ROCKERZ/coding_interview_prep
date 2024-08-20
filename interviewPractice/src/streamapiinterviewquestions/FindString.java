package streamapiinterviewquestions;

import java.util.Arrays;
import java.util.List;

public class FindString
{
    public static void main(String args[])
    {
        List<String> strings =Arrays.asList("apple","banana","grape","watermelon","kiwi","orange");

        long count = strings.stream()
                .filter(str->str.length()>5)
                .count();
        System.out.println(count);
    }
}
