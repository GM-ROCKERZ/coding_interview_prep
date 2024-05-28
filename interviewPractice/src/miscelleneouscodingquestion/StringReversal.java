package interviewPractice.src.miscelleneouscodingquestion;

public class StringReversal
{
    public static String reverse(String str)
    {
        char[] ch = str.toCharArray();
        int left =0;
        int right = str.length()-1;
        while(left<right)
        {
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            left++;
            right--;
        }
        return new String(ch);
    }
    public static void main(String args[])
    {
        String str = "gopalmishra";
        String reverse = reverse(str);
        System.out.println("Reversed string :" +reverse);
    }
}
