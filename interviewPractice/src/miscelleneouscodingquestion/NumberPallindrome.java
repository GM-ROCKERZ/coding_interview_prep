package miscelleneouscodingquestion;

public class NumberPallindrome
{
    static boolean isPal(int num)
    {
        int original = num;
        int revNum = 0;
        int rem =0;

        while(num>0)
        {
            rem = num%10;
            revNum = (revNum*10)+rem;
            num = num/10;
        }
        return revNum ==original;
    }
    public static void main(String args[])
    {
        int num = 121;
        if(isPal(num))
            System.out.println("its palindrom "+num);
        else System.out.println("number is not palindrom");
    }
}
