package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FactorialMain
{
    public static void main(String args[])
    {
        ExecutorService executor = Executors.newFixedThreadPool(1);

        FactorialCalculator calculator = new FactorialCalculator(10);
        Future<Long> future = executor.submit(calculator);

        try
        {
            System.out.println("The result is : " + future.get());
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        executor.shutdown();
    }
}
