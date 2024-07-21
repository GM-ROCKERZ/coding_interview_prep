package arrayslevel2.stack;

public class BackSpaceDeletion
{
    public static boolean backSpaceCompare(String s,String t)
    {
        return build(s).equals(build(t));

    }
    private static String build(String s)
    {
        StringBuilder stack = new StringBuilder();
        for(char c: s.toCharArray())
        {
            if(c!='#')
            {
                stack.append(c);
            }
            else if(stack.length()>0)
            {
                stack.deleteCharAt(stack.length()-1);
            }
        }
        return stack.toString();
    }

    public static void main(String args[])
    {
        String s = "ab#c";
        String t = "ad#c";
        System.out.println(backSpaceCompare(s,t));
    }

}
