package interviewPractice.src.arrayslevel2;

import java.util.HashSet;
import java.util.Set;

public class PanagramCheck
{
    public static boolean checkIfPanagram(String sentence)
    {
        Set<Character> seen = new HashSet<>();

        for(char currChar : sentence.toCharArray())
        {
            seen.add(currChar);
        }
        return seen.size()==26;
    }

    public static void main(String args[])
    {
       // String str = "thequickbrownfoxjumpsoverthelazydog";
        String str = "leetcode";
        boolean isPanagram = checkIfPanagram(str);
        System.out.println(isPanagram);
    }

}
