package interviewPractice.src.medium4_StreamQuestions;

import java.util.stream.Stream;

public class FindFibonacciSeries
{
    public static void main(String args[])
    {
        findFibonacci();
    }

    private static void findFibonacci()
    {
        Stream.iterate(new int[] {0,1},f->new int[]{
                f[1],f[0]+f[1]
        }).limit(10)
                .map(f->f[0])
                .forEach(System.out::println);
    }
}
