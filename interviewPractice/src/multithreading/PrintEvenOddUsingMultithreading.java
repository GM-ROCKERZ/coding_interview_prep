package interviewPractice.src.multithreading;

public class PrintEvenOddUsingMultithreading
{
    int maxNoToBePrinted;
    int count =0;

    public PrintEvenOddUsingMultithreading(int maxNoToBePrinted)
    {
        this.maxNoToBePrinted = maxNoToBePrinted;
    }

    public synchronized void printEven() throws Exception
    {
        while(count<maxNoToBePrinted)
        {
            while(count%2==1)
                wait();
            System.out.println(count);
            count++;
            notify();

        }

    }
    public synchronized void printOdd() throws Exception
    {
        while(count<maxNoToBePrinted)
        {
            while(count%2==0)
                wait();
            System.out.println(count);
            count++;
            notify();
        }
    }

    public static void main(String args[])
    {
        PrintEvenOddUsingMultithreading printNumbers = new PrintEvenOddUsingMultithreading(10);
        Thread evenThread = new  Thread(()->{
            try
            {
                printNumbers.printEven();
            }
            catch (Exception e)
            {
                throw new RuntimeException(e);
            }
        });
        Thread oddThread = new Thread(()->
        {
            try
            {
                printNumbers.printOdd();
            }
            catch (Exception e)
            {
                throw new RuntimeException(e);
            }
        });
        evenThread.start();
        oddThread.start();
    }
}
