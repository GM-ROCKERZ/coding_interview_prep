package interviewPractice.src.medium;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.Collectors;

public class ParallelStreamExample
{
    public static void main(String args[])
    {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        System.out.println("Default parallel stream :");
        list.parallelStream()
                .forEach(num->{
                    System.out.println(Thread.currentThread().getName()+"-"+num);
                });

        ForkJoinPool customThreadPool = new ForkJoinPool(3);
        System.out.println("custom parallel stream with custom pool: ");
        customThreadPool.submit(()->list.parallelStream().forEach(num->{
            System.out.println(Thread.currentThread().getName()+"->" +num);
        })).join();
        customThreadPool.shutdown();
    }
}
