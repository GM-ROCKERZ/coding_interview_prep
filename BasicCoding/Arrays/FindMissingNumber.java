package BasicCoding.Arrays;

public class FindMissingNumber
{
    private static int getMissingNumber(int [] numbers,int totalCount)
    {
        int expectedSum = totalCount * ((totalCount + 1)/2);
        int actualSum = 0;
        for(int i : numbers)
        {
            actualSum += i;
        }
        return expectedSum - actualSum;
    }
    public static void main(String args[])
    {
        System.out.println(getMissingNumber(new int[] {1,2,3,4,6},6));
    }

}
