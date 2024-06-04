package basiccodinginterviewquestions;

public class ReverseStr
{
    public static void main(String args[])
    {
        System.out.println(revStr("apple"));
        System.out.println(revStr("gopal"));
        System.out.println(revStr("phone"));
        System.out.println(revStr("123456"));
    }
    public static String revStr(String str)
    {
        StringBuilder res = new StringBuilder();
        for(int i = str.length()-1;i>=0;i--)
        {
            res.append(str.charAt(i));
        }
        return res.toString();
    }
}
