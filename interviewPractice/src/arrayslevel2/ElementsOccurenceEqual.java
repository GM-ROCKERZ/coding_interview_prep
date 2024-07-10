package arrayslevel2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ElementsOccurenceEqual
{
    public static boolean areOccurenceEqual(String s)
    {
        Map<Character,Integer> counts = new HashMap<>();
        for(char c: s.toCharArray())
        {
            counts.put(c,counts.getOrDefault(c,0)+1);
        }
        Set<Integer> frequencies = new HashSet<>(counts.values());
        System.out.print(frequencies.size());
        return frequencies.size()==1;
    }

    public static void main(String args[])
    {
        String s = "abacbc";
        boolean result = areOccurenceEqual(s);
        System.out.println(result);
    }
}
