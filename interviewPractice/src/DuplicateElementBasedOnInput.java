package interviewPractice.src;

import java.util.HashMap;
import java.util.Map;

public class DuplicateElementBasedOnInput
{
    public static int returnDuplicates(int [] arr,int input)
    {
        Map<Integer,Integer> map = new HashMap<>();

        for(int i =0;i<arr.length;i++)
        {
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }
        for(int num:map.keySet())
        {
            if(map.get(num)==input)
            {
                return num;
            }
        }
        return -1;
    }

    public static void main(String args[])
    {
        int[] arr = {10,20,30,10,20,10,10};
        int result = returnDuplicates(arr,4);
        System.out.println(result);
    }
}
