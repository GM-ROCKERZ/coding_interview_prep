package streamapiinterviewquestions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindDuplicateCharacterInString
{
    public static void main(String[] args)
    {
        String str = "vivek kadiyan";
        List<String> dupChar = findDuplicateChar(str);
        System.out.println("Duplicate character::::"+dupChar);

    }

    private static List<String> findDuplicateChar(String str)
    {
        return Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(ch->ch,Collectors.counting()))
                .entrySet().stream()
                .filter(cha->cha.getValue()>1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }
}
