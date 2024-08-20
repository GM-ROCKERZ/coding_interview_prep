package arrayslevel2;

import java.util.HashSet;
import java.util.Set;

public class CountElement
{
   public static int countElement(int[] arr)
   {
       Set<Integer> hashSet = new HashSet<>();
       for(int x :arr)
       {
           hashSet.add(x);
       }
       int count =0;
       for(int x:arr)
       {
           if(hashSet.contains(x+1))
               count++;
       }
       return count;
   }

   public static void main(String args[])
   {
       int[] arr = {1,2,3};
      int countedElement=  countElement(arr);
       System.out.println(countedElement);
   }
}
