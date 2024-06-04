package miscelleneouscodingquestion;

public class Fibonacci
{
    static void fib(int n)
    {
        int a=0;
        int b=1;
        for(int i=0;i<n;i++)
        {
            System.out.print(a +" ");
            int sum = a+b;
            a=b;
            b=sum;
        }
    }
    public static void main(String args[])
    {
        int n=10;
        System.out.println("fib series till 10 ");
        fib(n);
    }
}
