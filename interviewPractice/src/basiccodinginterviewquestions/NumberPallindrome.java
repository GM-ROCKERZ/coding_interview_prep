package basiccodinginterviewquestions;

public class NumberPallindrome
{
    public static void main(String args[])
    {
        System.out.println(isPal(121));
        System.out.println(isPal(13));
    }

    public static boolean isPal(int number)
    {
        int copyOfOrignal = number;
        int reverseNumber = 0;
        int remainder = 0;
        while(number>0)
        {
            remainder = number%10;

            reverseNumber = (reverseNumber*10)+remainder;
            number = number/10;
        }
        return copyOfOrignal == reverseNumber;
    }
}
