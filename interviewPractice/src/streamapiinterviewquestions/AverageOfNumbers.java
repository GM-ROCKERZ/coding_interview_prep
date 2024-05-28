package interviewPractice.src.streamapiinterviewquestions;

import java.util.Arrays;
import java.util.List;

public class AverageOfNumbers
{
    public static void main(String args[])
    {
        List<Double> doubles= Arrays.asList(1.0,2.0,3.0,4.0,5.0);
        double average = doubles.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .getAsDouble();
        System.out.println(average);
    }
}
