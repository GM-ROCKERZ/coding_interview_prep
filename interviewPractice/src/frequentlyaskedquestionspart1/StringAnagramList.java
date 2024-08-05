package interviewPractice.src.frequentlyaskedquestionspart1;

import java.util.*;

public class StringAnagramList
{
    public static List<List<String>> stringAnagram(String[] str)
    {
        Map<String,List<String>> map = new HashMap<>();
        for(String s: str)
        {
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String key = String.valueOf(ch);
            if(!map.containsKey(key))
            {
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(s);

        }
        return new ArrayList<>(map.values());
    }

    public static void main(String args[])
    {
        String[] str= {"eat","tea","ate","nat","tan","bat"};

        List<List<String>> result = stringAnagram(str);

        for(List<String> s: result)
        {
            System.out.println(s);
        }
    }
}
