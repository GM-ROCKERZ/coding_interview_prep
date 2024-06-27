package multithreading;

import java.util.concurrent.Callable;

public class FactorialCalculator implements Callable<Long>
{
    private int number;

    public FactorialCalculator(int number) {
        this.number = number;
    }

    @Override
    public Long call() throws Exception {
        long result = 1;
        for(int i=2;i<=number;i++)
        {
            result*=i;
        }
        return result;
    }
}
