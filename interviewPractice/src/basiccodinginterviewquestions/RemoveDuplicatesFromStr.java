package basiccodinginterviewquestions;

public class RemoveDuplicatesFromStr
{
    public static void main(String args[])
    {
        System.out.println(removeDup("hello"));

    }

    public static String removeDup(String str)
    {
        String strWithNodup = "";
        for(char ch : str.toCharArray())
        {
            if(!strWithNodup.contains(str.valueOf(ch)))
                strWithNodup+=ch;
        }
        return strWithNodup;
    }
}
