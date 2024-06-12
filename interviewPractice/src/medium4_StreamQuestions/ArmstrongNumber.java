package interviewPractice.src.medium4_StreamQuestions;

public class ArmstrongNumber
{
    public static void main(String args[])
    {
        System.out.println("Is armstrong number :" +isArmstrongnumber(1634));
    }
    private static boolean isArmstrongnumber(int n)
    {
        int len = String.valueOf(n).length();
        int sum = String.valueOf(n).chars().map(ch->Character.digit(ch,10))
                .map(digit->(int)Math.pow(digit,len))
                .sum();
        return sum==n;
    }
}
