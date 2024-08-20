package arrayslevel2;

public class ReversePrefix
{
    public static  String reversedPrefix(String word ,char c)
    {
        StringBuilder sb = new StringBuilder(word);
        int firstOccurence = word.indexOf(c);
        int k=0;
        int l =firstOccurence;
        while(k<l)
        {
            swap(sb,k,l);
            k++;
            l--;
        }
        return sb.toString();
    }

    static void swap(StringBuilder sb, int i, int j)
    {
        char temp = sb.charAt(i);
        sb.replace(i,i+1,""+sb.charAt(j));
        sb.replace(j,j+1,""+temp);
    }

    public static void main(String args[])
    {
        String str = "abcdef";
        char c= 'd';
        String reversePrefixString = reversedPrefix(str,c);
        System.out.println(reversePrefixString);
    }
}
