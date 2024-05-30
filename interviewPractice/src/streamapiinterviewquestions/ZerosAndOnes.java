package interviewPractice.src.streamapiinterviewquestions;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ZerosAndOnes
{
    public static void main(String args[])
    {
        Integer array[] = {1,1,0,1,0};

        System.out.println(Arrays.stream(array)
                .sorted().collect(Collectors.toList()));

        //Second Approach
        swapArrayElement(array);
    }

    private static void swapArrayElement(Integer[] array)
    {
        int left =0;
        for(int i=0;i< array.length;i++)
        {
            if(array[i]==0)
            {
                int temp = array[i];
                array[i] = array[left];
                array[left] = temp;
                left++;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
