package questions;

import java.util.*;

public class FindFrequencyBasedOnInputKey
{
    public static void main(String args[])
    {
        int[] arr = {10,20,30,10,20,40,30,30,40,50,60,70};
        List<Integer> ls = Arrays.asList(10,20,30,10,20,40,30,30,40,50,60,70);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the key :");
        int key = sc.nextInt();

        Map<Integer, Set<Integer>> map = new HashMap<>();

        for(int i=0;i<arr.length;i++)
        {
            int num = Collections.frequency(ls,ls.get(i));
            map.computeIfAbsent(num,k->new HashSet<>()).add(ls.get(i));
        }
        List<Integer> ls1 = new ArrayList<>();
        for (Map.Entry<Integer, Set<Integer>> entry : map.entrySet()) {
            if (entry.getKey() == key) {
                ls1.addAll(entry.getValue());
            }
    }
        for(Integer num : ls1)
        {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
