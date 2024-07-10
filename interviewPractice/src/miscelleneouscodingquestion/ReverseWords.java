package miscelleneouscodingquestion;

public class ReverseWords
{
    static void reverse(char[] ch, int left,int right)
    {
        while(left<right) {
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            left++;
            right--;
        }
    }

    static void reverseWords(char[] str,int n)
    {
        int start=0;
        for(int end=0;end<n;end++) {
            if (str[end] == ' ')
            {
                reverse(str, start, end);
                start = end + 1;
            }
        }
        System.out.println(str);

        reverse(str,start,n-1);
        System.out.println(str);

        reverse(str,0,n-1);
        System.out.println(str);
    }

    public static void main(String args[])
    {
        String s = "Welcome to Bangalore";
        int n = s.length();
        char[] str = s.toCharArray();
        System.out.println("After reversing words in string");
        reverseWords(str,n);
        System.out.println(str);
    }
}
