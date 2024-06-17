package interviewPractice.src.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.List;
import java.util.concurrent.*;

public class SimulateConcurrentModification
{
    public static void main(String args[]) throws InterruptedException, ExecutionException
    {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5,7,8,9,10));
        ExecutorService executor = Executors.newFixedThreadPool(2);

        Callable<Void> modifyTask = () -> {
            for (int i = 0; i < 10; i++) {
                list.add(i);
                Thread.sleep(10);
            }
            return null;

        };
        Callable<Void> streamTask = ()->{
            try
            {
                list.stream().forEach(System.out::println);

            } catch (ConcurrentModificationException e) {
                System.out.println("Concurrent modification detectect :" +e);
            }
            return null;
        };
        Future<Void> modifyFuture = executor.submit(modifyTask);
        Future<Void> streaFuture = executor.submit(streamTask);

        modifyFuture.get();
        streaFuture.get();

        executor.shutdown();
    }
}
