package miscelleneouscodingquestion;

import java.util.HashMap;
import java.util.Map;

public class WordCounter
{
    public static void main(String args[])
    {
        String str = "Hello world hello java world";
        String[] arr = str.split(" ");
        HashMap<String ,Integer> map = new HashMap();
        for(String word : arr)
        {
            if(!map.containsKey(word))
            {
                map.put(word,1);
            }
            else
            {
                int count = map.get(word);
                map.put(word,count+1);
            }

        }
        for(Map.Entry<String,Integer> entry: map.entrySet())
        {
            System.out.println(entry.getKey()+":"+entry.getValue());
        }

    }
}
