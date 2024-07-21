package arrayslevel2.stack;

public class RemoveContineousDuplicates
{
    public static String removeDuplicates(String str)
    {
        StringBuilder stack = new StringBuilder();
        for(char c : str.toCharArray())
        {
            if(stack.length()>0 && stack.charAt(stack.length()-1)==c)
            {
                stack.deleteCharAt(stack.length()-1);
            }
            else
            {
                stack.append(c);
            }
        }
        return stack.toString();
    }
    public static void main(String args[])
    {
        String str = "abbaca";
        String result = removeDuplicates(str);
        System.out.println(result);
    }

}
