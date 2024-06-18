package questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test
{
    public static  void main(String args[]) {
        int[] arr = new int[]{1, 6, 2, 4, 3, 5, 7, 8, 9};

        //o/p:1,6,7,8,9
        int count = 0;
    //    int[] result = new int[arr.length];
        List<Integer> lst = new ArrayList<>();
        for(int i=0;i<=arr.length-1;i++)
        {
            if(arr[i]>count)
            {
                lst.add(arr[i]);
                count=arr[i];
            }
        }
        System.out.println(lst);
    }
}


