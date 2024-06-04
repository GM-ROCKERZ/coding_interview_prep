package basiccodinginterviewquestions;

public class MaxNumber
{
    public static void main(String args[])
    {
        System.out.println(max(new int[] {4,891,99,103}));
    }
    public static int max(int [] arr)
    {
        int max = arr[0];

        for (int num:arr)
        {
            if(max<num)
                max=num;
        }
        return max;
    }
}
