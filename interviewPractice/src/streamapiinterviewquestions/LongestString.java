package streamapiinterviewquestions;

import java.util.Arrays;
import java.util.List;

public class LongestString
{
    public static void main(String args[])
    {
        List<String> strings = Arrays.asList("apple","banana","grape","watermelon","banana","orange","orange");
        Integer longest = strings.stream()
                .mapToInt(String::length)
                .max()
                .getAsInt();
        System.out.println(longest);
    }
}
