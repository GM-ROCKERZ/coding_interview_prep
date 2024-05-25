package miscelleneouscodingquestion;

import java.util.ArrayList;
import java.util.List;

public class SecondIndexValues
{
    public static void main(String args[])
    {
        List<String> strings = List.of("apple", "banana", "cat", "dog", "elephant");

        List<Character> secondIndexValues = new ArrayList<>();
        for(String str:strings)
        {
            if(str.length()>2)
            {
                char secondIndexValue = str.charAt(1);
                secondIndexValues.add(secondIndexValue);
            }
        }
        System.out.println("Second Index values: " +secondIndexValues);

    }
}
