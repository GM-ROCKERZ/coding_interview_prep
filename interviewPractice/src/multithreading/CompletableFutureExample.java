package interviewPractice.src.multithreading;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureExample
{
    public static void main(String args[])
    {
        CompletableFuture<Void> runFuture = CompletableFuture.runAsync(()->
        {
            try
            {
                Thread.sleep(2000);
                System.out.println("Running Task asynchronously!");
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        });
        System.out.println("run async :" +runFuture.isDone());
        CompletableFuture<String> supplyFuture = CompletableFuture.supplyAsync(()->
        {
            try
            {
                Thread.sleep(2000);
                System.out.println("Running task asynchronously");
                return "Hello";
            }
            catch (InterruptedException e){
                e.printStackTrace();
                return "error";
            }
        });

        try {
            System.out.println("Supply Async :" +supplyFuture.get());
        }catch (InterruptedException| ExecutionException e)
        {
            e.printStackTrace();
        }
    }
}
