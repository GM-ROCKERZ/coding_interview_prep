package frquentlyaskedJavaquestions;

public class StringRotation
{
    public static String manipulateString(String input)
    {
        char[] chars = input.toCharArray();

        int n = chars.length;

        reverse(chars,0,n-1);

        int start =0;
        for(int i=0;i<=n;i++)
        {
            if(i==n||chars[i]==' ')
            {
                reverse(chars,start,i-1);
                start = i+1;
            }
        }
       return new String(chars);
    }

    private static void reverse(char[] chars ,int start,int end)
    {
        while(start<end)
        {
            char temp = chars[start];
            chars[start]=chars[end];
            chars[end] = temp;
            start++;
            end--;

        }
    }

    public static void main(String args[])
    {
        String input = "abc def gh";
        String output = manipulateString(input);
        System.out.println(output);
    }
}
