package interviewPractice.src.streamapiinterviewquestions;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FindDupCharAndOccurence
{
    public static void main(String args[])
    {
        String str = "vivekkadiyan";
        System.out.println(findDuplicateCharAndOccurence(str));
    }

    private static Map<String ,Long> findDuplicateCharAndOccurence(String str)
    {
        return Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(ch->ch, LinkedHashMap::new,Collectors.counting()))
                .entrySet().stream()
                .filter(cha->cha.getValue()>1)
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
    }
}
