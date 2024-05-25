package miscelleneouscodingquestion;

import java.util.HashMap;
import java.util.Map;

public class CountLetters
{
    static Map<Character,Integer> countLetters(String str)
    {
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(map.containsKey(ch))
            {
                map.put(ch,map.get(ch)+1);
            }
            else
            {
                map.put(ch , 1);
            }
        }
        return map;

    }

    public static void main(String args[])
    {
        String str = "Javanerds";
        Map<Character,Integer> result = countLetters(str);
        for(Map.Entry<Character,Integer> e : result.entrySet())
        {
            System.out.println("Character is : "+ e.getKey()+" and its count is "+e.getValue());

        }
    }
}
