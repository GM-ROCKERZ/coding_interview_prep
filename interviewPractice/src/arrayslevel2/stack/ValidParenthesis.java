package arrayslevel2.stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParenthesis
{
    public static boolean isValid(String str)
    {
        Map<Character,Character> matching = new HashMap<>();
        matching.put('(',')');
        matching.put('[',']');
        matching.put('{','}');

        Stack<Character> stack = new Stack<>();
        for(char c : str.toCharArray())
        {
            if(matching.containsKey(c))
            {
                stack.push(c);
            }
            else
            {
                if(stack.empty())
                {
                    return false;
                }
                char previousOpening = stack.pop();
                if (matching.get(previousOpening)!=c)
                {
                    return false;
                }
            }
        }
        return stack.empty();
    }

    public static void main(String args[])
    {
        String str = "({[]})";
        System.out.println(isValid(str));
    }
}
